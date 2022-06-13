package Paymethod;

import java.util.TreeMap;

public interface PaymethodMapping {

    MappingDto mapping(TreeMap<String, String> paymap);


    String getLang(String lang);

}

