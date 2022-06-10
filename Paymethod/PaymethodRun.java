package Paymethod;

import java.util.TreeMap;

public class PaymethodRun {

    public static void main(String[] args) {

        String lang = "KO";

        PaymethodStorage PAYMETHOD_STORAGE = PaymethodStorage.getInstance();

        PaymethodFactory paymethodFactory = new PaymethodFactory();
        PaymethodMapping paymethodMapping = paymethodFactory.getPaymethodMapping(lang);

        TreeMap<String,String> treeMap = new TreeMap();

        treeMap.put("C000","VISA");

        paymethodMapping.mapping(treeMap);
        System.out.println("treeMap = " + treeMap);

    }

}
