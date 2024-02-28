
public class SA_HEADER_OUTType {
    private String CORR_ID;
    private String USER_NAME;
    private String APPLICATION;
    private String MSG_ID;
    private Double RESULT_CODE;
    private Double STATUS_CODE;
    private SA_ERRORSType ERRORS;
}

public class SA_ERRORSType {
    private SA_ERRLISTType ERRORS;
    private SA_BUGLISTType BUGS;
}

public class SA_ERRLISTType {
    private List<SA_ERRType> SA_ERR;
}

public class SA_BUGLISTType {
    private List<SA_BUGType> SA_BUG;
}

public class SA_ERRType {
    private Double ERROR_NO;
    private String ERROR_MSG;
    private String SEVERITY;
    private String ATTR_NAME;
    private Double POSITION_NO;
}

public class SA_BUGType {
    private Double ERROR_NO;
    private String ERROR_MSG;
    private String ERROR_DATE;
    private String PROCESS_NAME;
    private String OSUSER;
    private Double AUDSID;
    private String RUN_DATE;
    private String MODULE;
    private String ACTION;
    private String CLIENT_INFO;
    private String SYSTEM_PHASE;
    private String DEBUG_INFO;
    private String CALL_STACK;
    private String ERROR_STACK;
}

public class SYM_FT_FUNDS_HELD_OUTType {
    private SA_HEADER_OUTType HEADER_OUT;
    private String ACCT_NO;
    private String START_DATE;
    private String END_DATE;
    private String RESTRAINT_TYPE;
    private Double PLEDGED_AMT;
    private String CCY;
    private String NARRATIVE;
    private String FORCE_FUNDS_HELD;
    private String REFERENCE_NO;
    private String SOURCE_MODULE;
    private String LAST_CHANGE_OFFICER;
    private String FH_OPERATION;
    private Double FH_SEQ_NO;
    private String STATUS;
    private FT_FH_CREDIT_ACCT_COLL_OUTType FT_FH_CREDIT_ACCT_OUT;
}

public class FT_FH_CREDIT_ACCT_COLL_OUTType {
    private List<FT_FH_CREDIT_ACCT_T_OUTType> FT_FH_CREDIT_ACCT_T_OUT;
}

public class FT_FH_CREDIT_ACCT_T_OUTType {
    private Double POSITION;
    private String ACCT_NO;
    private String ERROR_MESSAGE;
}

public class SYM_STD_OUTType {
    private SA_HEADER_OUTType HEADER_OUT;
}