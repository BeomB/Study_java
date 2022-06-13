package Paymethod;

import java.util.TreeMap;


public class PaymethodRun {

    public static void main(String[] args) {

        String lang = "ja";

        TreeMap<String,String> testMap = new TreeMap();


        PaymethodFactory paymethodFactory = new PaymethodFactory();

        PaymethodMapping paymethodMapping = paymethodFactory.getPaymethodMapping(lang);


    }
}
