package JDBC;

public class Dto {

    private Integer TRANSNO;

    private String TRANSID;

    private String MERCHANTINO;

    private String MERCCHANTID;

    private String RESMSG;


    public Integer getTRANSNO() {
        return TRANSNO;
    }

    public void setTRANSNO(Integer TRANSNO) {
        this.TRANSNO = TRANSNO;
    }

    public String getTRANSID() {
        return TRANSID;
    }

    public void setTRANSID(String TRANSID) {
        this.TRANSID = TRANSID;
    }

    public String getMERCHANTINO() {
        return MERCHANTINO;
    }

    public void setMERCHANTINO(String MERCHANTINO) {
        this.MERCHANTINO = MERCHANTINO;
    }

    public String getMERCCHANTID() {
        return MERCCHANTID;
    }

    public void setMERCCHANTID(String MERCCHANTID) {
        this.MERCCHANTID = MERCCHANTID;
    }

    public String getRESMSG() {
        return RESMSG;
    }

    public void setRESMSG(String RESMSG) {
        this.RESMSG = RESMSG;
    }

    public Dto(Integer TRANSNO, String TRANSID, String MERCHANTINO, String MERCCHANTID, String RESMSG) {
        this.TRANSNO = TRANSNO;
        this.TRANSID = TRANSID;
        this.MERCHANTINO = MERCHANTINO;
        this.MERCCHANTID = MERCCHANTID;
        this.RESMSG = RESMSG;
    }


    @Override
    public String toString() {
        return "Dto{" +
                "TRANSNO=" + TRANSNO +
                ", TRANSID='" + TRANSID + '\'' +
                ", MERCHANTINO='" + MERCHANTINO + '\'' +
                ", MERCCHANTID='" + MERCCHANTID + '\'' +
                ", RESMSG='" + RESMSG + '\'' +
                '}';
    }
}

