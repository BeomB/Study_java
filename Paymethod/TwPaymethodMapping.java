package Paymethod;

import java.util.TreeMap;

public class TwPaymethodMapping implements PaymethodMapping {


    private static String LANG = "TW";

    private PaymethodStorage paymethodStorage = PaymethodStorage.getInstance();

    @Override
    public TreeMap<String, String> mapping(TreeMap<String, String> paymap, String lang) {

        TreeMap<String, String> result = new TreeMap<>();

        paymap.forEach((key, value) ->
        {
            result.put(key, paymethodStorage.getPaymethod(key).getTwName());
        });
        return result;
    }

    @Override
    public String getLang(String lang) {
        return LANG;
    }



}
