package Paymethod;

import java.util.TreeMap;

public interface PaymethodMapping {

    TreeMap<String, String> mapping(TreeMap<String, String> paymap, String lang);


    String getLang(String lang);

}

