package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SYM_FT_FUNDS_HELD_INType", propOrder = {
    "headerin",
    "hostcheckflag",
    "fttrantype",
    "acctno",
    "startdate",
    "enddate",
    "restrainttype",
    "pledgedamt",
    "ccy",
    "narrative",
    "forcefundsheld",
    "referenceno",
    "sourcemodule",
    "lastchangeofficer",
    "fhoperation",
    "fhseqno",
    "ftfhcreditacctin",
    "ftpaymentchanneldatain"
})
public class SYMFTFUNDSHELDINType {

    @XmlElement(name = "HEADER_IN", required = true)
    protected SAHEADERINType headerin;
    @XmlElement(name = "HOST_CHECK_FLAG", required = true)
    protected String hostcheckflag;
    @XmlElement(name = "FT_TRAN_TYPE", required = true)
    protected String fttrantype;
    @XmlElement(name = "ACCT_NO", required = true)
    protected String acctno;
    @XmlElement(name = "START_DATE", required = true)
    protected String startdate;
    @XmlElement(name = "END_DATE", required = true)
    protected String enddate;
    @XmlElement(name = "RESTRAINT_TYPE", required = true)
    protected String restrainttype;
    @XmlElement(name = "PLEDGED_AMT")
    protected double pledgedamt;
    @XmlElement(name = "CCY", required = true)
    protected String ccy;
    @XmlElement(name = "NARRATIVE")
    protected String narrative;
    @XmlElement(name = "FORCE_FUNDS_HELD", required = true)
    protected String forcefundsheld;
    @XmlElement(name = "REFERENCE_NO")
    protected String referenceno;
    @XmlElement(name = "SOURCE_MODULE", required = true)
    protected String sourcemodule;
    @XmlElement(name = "LAST_CHANGE_OFFICER")
    protected String lastchangeofficer;
    @XmlElement(name = "FH_OPERATION", required = true)
    protected String fhoperation;
    @XmlElement(name = "FH_SEQ_NO")
    protected Double fhseqno;
    @XmlElement(name = "FT_FH_CREDIT_ACCT_IN")
    protected FTFHCREDITACCTCOLLType ftfhcreditacctin;
    @XmlElement(name = "FT_PAYMENT_CHANNEL_DATA_IN")
    protected FTPAYMENTCHANNELDATACOLLType ftpaymentchanneldatain;
}
