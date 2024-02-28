import java.util.List;

public class SYM_FT_FUNDS_HELD_INType {
    private SA_HEADER_INType HEADER_IN;
    private String HOST_CHECK_FLAG;
    private String FT_TRAN_TYPE;
    private String ACCT_NO;
    private String START_DATE;
    private String END_DATE;
    private String RESTRAINT_TYPE;
    private double PLEDGED_AMT;
    private String CCY;
    private String NARRATIVE;
    private String FORCE_FUNDS_HELD;
    private String REFERENCE_NO;
    private String SOURCE_MODULE;
    private String LAST_CHANGE_OFFICER;
    private String FH_OPERATION;
    private Double FH_SEQ_NO;
    private List<FT_FH_CREDIT_ACCT_COLLType> FT_FH_CREDIT_ACCT_IN;
    private List<FT_PAYMENT_CHANNEL_DATA_COLLType> FT_PAYMENT_CHANNEL_DATA_IN;
}

class SA_HEADER_INType {
    private String CORR_ID;
    private String USER_NAME;
    private String APPLICATION;
    private String WORKSTATION;
    private String SCREEN_NO;
    private byte[] AUTH_KEY;
    private String PROFILE_ID;
    private String MSG_ID;
}

class FT_FH_CREDIT_ACCT_TType {
    private double POSITION;
    private String ACCT_NO;
}

class FT_PAYMENT_CHANNEL_DATA_TType {
    private double POSITION;
    private String FIELD_NAME;
    private String FIELD_VALUE;
    private String FIELD_DESCRIPTION;
}

class FT_FH_CREDIT_ACCT_COLLType {
    private List<FT_FH_CREDIT_ACCT_TType> FT_FH_CREDIT_ACCT_T;
}

class FT_PAYMENT_CHANNEL_DATA_COLLType {
    private List<FT_PAYMENT_CHANNEL_DATA_TType> FT_PAYMENT_CHANNEL_DATA_T;
}