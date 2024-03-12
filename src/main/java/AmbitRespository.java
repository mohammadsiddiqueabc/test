import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.Types;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.abc.jpa.TEntity;

@Component
public class AmbitRespository {

	private static final Logger log = LogManager.getLogger(AmbitRespository.class);
	private static final String GET_RUN_DATE_SQL = "SELECT RUN_DATE FROM fm_system";
	

	@Autowired
	@Qualifier("jorjdbcTemplate")
	private JdbcTemplate jorjdbcTemplate;

	@Autowired
	@Qualifier("tunOffjdbcTemplate")
	private JdbcTemplate tunOffjdbcTemplate;

	@Autowired
	@Qualifier("tunOnjdbcTemplate")
	private JdbcTemplate tunOnjdbcTemplate;
	
	@Value("${jor_db_username}")
	private String ambitJorUserName;
	
	@Value("${tun_db_off_username}")
	private String ambitTunOffShoreUserName;
	
	@Value("${tun_db_on_username}")
	private String ambitTunOnShoreUserName;
	
	public String processXML(String inputXML, TEntity entity) throws Exception {
		
		String uname=findUserName(entity);
		String SP_PROCESS_XML = "{call "+uname+".UM_ESB_SERVICE.WEB_xml_process(?,?)}";
		JdbcTemplate jdbcTemplate = findTemplate(entity);

		StringBuilder sb = new StringBuilder();
		try (Connection connection = jdbcTemplate.getDataSource().getConnection();
				CallableStatement call = connection.prepareCall(SP_PROCESS_XML);) {
			Clob clob = connection.createClob();
			clob.setString(1, inputXML);
			call.setClob(1, clob);
			call.registerOutParameter(2, Types.CLOB);
			call.execute();
			Clob cl = call.getClob(2);
			BufferedReader br = null;
			String line;
			br = new BufferedReader(new InputStreamReader(cl.getAsciiStream()));
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}

		} catch (Exception e) {
			log.debug("Exception occured in while xml process procedure ", e);
		}
		return sb.toString();
	}

	private JdbcTemplate findTemplate(TEntity entity) {

		if (entity.getTargetUnit().equalsIgnoreCase("Bank ABC - Tunisia")) {

			if (entity.getUnitRelationshipInAbctunisia().equalsIgnoreCase("ABC Tunisia Onshore")) {
				return tunOnjdbcTemplate;
			} else if (entity.getUnitRelationshipInAbctunisia().equalsIgnoreCase("ABC Tunisia Off shore")) {
				return tunOffjdbcTemplate;
			} else {
				log.error("Invalid Unit-Relationship-In-Tunisia {} for Ambit Task invalid ",
						entity.getUnitRelationshipInAbctunisia());
				return null;
			}
		} else if (entity.getTargetUnit().equalsIgnoreCase("Bank ABC - Jordan")) {
			return jorjdbcTemplate;
		}

		log.error("Invalid Target Unit for Ambit Task {}", entity.getTargetUnit());
		return null;
	}
	
	private String findUserName(TEntity entity) {		
		
		if (entity.getTargetUnit().equalsIgnoreCase("Bank ABC - Tunisia")) {

			if (entity.getUnitRelationshipInAbctunisia().equalsIgnoreCase("ABC Tunisia Onshore")) {
				return ambitTunOnShoreUserName;
			} else if (entity.getUnitRelationshipInAbctunisia().equalsIgnoreCase("ABC Tunisia Off shore")) {
				return ambitTunOffShoreUserName;
			} else {
				log.error("Invalid Unit-Relationship-In-Tunisia {} for Ambit Task invalid ",
						entity.getUnitRelationshipInAbctunisia());
				return null;
			}
		} else if (entity.getTargetUnit().equalsIgnoreCase("Bank ABC - Jordan")) {
			return ambitJorUserName;
		}

		log.error("Invalid Target Unit for Ambit Task {}", entity.getTargetUnit());
		return null;
	}


	public Date getRunDate(TEntity entity) {
		JdbcTemplate jdbcTemplate = findTemplate(entity);
		Date runDate = jdbcTemplate.queryForObject(GET_RUN_DATE_SQL, null, Date.class);
		return runDate;
	}

}
