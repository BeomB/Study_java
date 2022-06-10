package Paymethod;

import java.util.TreeMap;

public class PaymethodRun {

    public static void main(String[] args) {

        String lang = "ja";

        TreeMap<String,String> testMap = new TreeMap();     
        testMap.put("C000","VISA 한국");
        System.out.println("testMap = " + testMap);
        
        PaymethodFactory paymethodFactory = new PaymethodFactory();
        PaymethodMapping paymethodMapping2 = paymethodFactory.getPaymethodMapping(lang);
        System.out.println("paymethodMapping2 = " + paymethodMapping2.mapping(testMap));

        
    }

}
