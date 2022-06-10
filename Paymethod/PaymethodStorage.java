package Paymethod;

import java.util.HashMap;
import java.util.Map;

public class PaymethodStorage {

    private static PaymethodStorage PAYMETHOD_STORAGE = new PaymethodStorage();

    private Map<String,Paymethod> storage = new HashMap<>();

    private PaymethodStorage()
    {

        storage.put("C000", Paymethod.C000);
        storage.put("C001", Paymethod.C001);
        storage.put("C002", Paymethod.C002);
        storage.put("C003", Paymethod.C003);
        storage.put("C004", Paymethod.C004);
        storage.put("C005", Paymethod.C005);
        storage.put("C007", Paymethod.C007);
        storage.put("C010", Paymethod.C010);
        storage.put("C015", Paymethod.C015);
        storage.put("C020", Paymethod.C020);
        storage.put("C023", Paymethod.C023);
        storage.put("C024", Paymethod.C024);
        storage.put("C025", Paymethod.C025);
        storage.put("C026", Paymethod.C026);
        storage.put("C027", Paymethod.C027);
        storage.put("C033", Paymethod.C033);
        storage.put("C037", Paymethod.C037);
        storage.put("C039", Paymethod.C039);
        storage.put("C040", Paymethod.C040);
        storage.put("C041", Paymethod.C041);
        storage.put("C042", Paymethod.C042);
        storage.put("C043", Paymethod.C043);
        storage.put("C044", Paymethod.C044);
        storage.put("C045", Paymethod.C045);
        storage.put("C046", Paymethod.C046);
        storage.put("C047", Paymethod.C047);
        storage.put("C049", Paymethod.C049);
        storage.put("C056", Paymethod.C056);
        storage.put("C057", Paymethod.C057);
        storage.put("C059", Paymethod.C059);
        storage.put("C060", Paymethod.C060);
        storage.put("C061", Paymethod.C061);
        storage.put("C062", Paymethod.C062);
        storage.put("C063", Paymethod.C063);
        storage.put("C064", Paymethod.C064);
        storage.put("C065", Paymethod.C065);
        storage.put("C066", Paymethod.C066);
        storage.put("C067", Paymethod.C067);
        storage.put("C068", Paymethod.C068);
        storage.put("C069", Paymethod.C069);
        storage.put("C070", Paymethod.C070);
        storage.put("C071", Paymethod.C071);
        storage.put("C072", Paymethod.C072);
        storage.put("C073", Paymethod.C073);
        storage.put("C074", Paymethod.C074);
        storage.put("C075", Paymethod.C075);
        storage.put("C076", Paymethod.C076);
        storage.put("C077", Paymethod.C077);

        storage.put("CC00", Paymethod.CC00);
        storage.put("CC01", Paymethod.CC01);
        storage.put("CC02", Paymethod.CC02);
        storage.put("CC03", Paymethod.CC03);
        storage.put("CC04", Paymethod.CC04);
        storage.put("CC05", Paymethod.CC05);
        storage.put("CC06", Paymethod.CC06);
        storage.put("CC07", Paymethod.CC07);
        storage.put("CC09", Paymethod.CC09);
        storage.put("CC10", Paymethod.CC10);
        storage.put("CC11", Paymethod.CC11);
        storage.put("CC12", Paymethod.CC12);
        storage.put("CC13", Paymethod.CC13);
        storage.put("CC14", Paymethod.CC14);
        storage.put("CC16", Paymethod.CC16);
        storage.put("CC17", Paymethod.CC17);
        storage.put("CC18", Paymethod.CC18);
        storage.put("CC19", Paymethod.CC19);
        storage.put("CC20", Paymethod.CC20);
        storage.put("CC21", Paymethod.CC21);
        storage.put("CC22", Paymethod.CC22);
        storage.put("CC23", Paymethod.CC23);
        storage.put("CC24", Paymethod.CC24);
        storage.put("CC25", Paymethod.CC25);
        storage.put("CC26", Paymethod.CC26);
        storage.put("CC27", Paymethod.CC27);
        storage.put("CC28", Paymethod.CC28);
        storage.put("CC99", Paymethod.CC99);
    }

    public static PaymethodStorage getInstance()
    {
        return PAYMETHOD_STORAGE;
    }

    public Paymethod getPaymethod(String carCode)
    {
        return this.storage.get(carCode);
    }


}
