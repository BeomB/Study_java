package Paymethod;

import java.util.TreeMap;

public class EnPaymethodMapping implements PaymethodMapping {


    private static String LANG = "EN";

    private PaymethodStorage paymethodStorage = PaymethodStorage.getInstance();

    @Override
    public TreeMap<String, String> mapping(TreeMap<String, String> paymap) {

        TreeMap<String, String> result = new TreeMap<>();

        paymap.forEach((key, value) ->
        {
            result.put(key, paymethodStorage.getPaymethod(key).getEnName());
        });
        return result;
    }

    @Override
    public String getLang(String lang) {
        return LANG;
    }



}
