package Paymethod;

import java.util.TreeMap;

public class EnPaymethodMapping implements PaymethodMapping {


    private static String LANG = "en";

    private PaymethodStorage paymethodStorage = PaymethodStorage.getInstance();


    @Override
    public MappingDto mapping(TreeMap<String, String> paymap) {

        MappingDto mappingDto = new MappingDto();



        paymap.forEach((key, value) ->
        {
            if (key.contains("CC")) {
                mappingDto.getLocalMap().put(key, paymethodStorage.getPaymethod(key).getEnName());
            } else {
                mappingDto.getGlobalMap().put(key, paymethodStorage.getPaymethod(key).getEnName());
            }
        });
        return mappingDto;
    }

    ////// 객체 선언까지는 함

    @Override
    public String getLang(String lang) {
        return LANG;
    }



}



