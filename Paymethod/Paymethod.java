package Paymethod;

public enum Paymethod {

    CC01("삼성카드","SamSungCARD"),
    CC02("우리카드","WooriCard");

    private String krName;
    private String enName;

    Paymethod(String krName, String enName) {
        this.krName = krName;
        this.enName = enName;
    }

    public String getKrName() {
        return krName;
    }

    public String getEnName() {
        return enName;
    }
}
