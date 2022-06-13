package Paymethod;

import java.util.TreeMap;

public class KrPaymethodMapping implements PaymethodMapping {


    private static String LANG = "ko";

    private PaymethodStorage paymethodStorage = PaymethodStorage.getInstance();

    @Override
    public MappingDto mapping(TreeMap<String, String> paymap) {

        MappingDto mappingDto = new MappingDto();



        paymap.forEach((key, value) ->
        {
            if (key.contains("CC")) {
                mappingDto.getLocalMap().put(key, paymethodStorage.getPaymethod(key).getKrName());
            } else {
                mappingDto.getGlobalMap().put(key, paymethodStorage.getPaymethod(key).getKrName());
            }
        });
        return mappingDto;
    }

    @Override
    public String getLang(String lang) {
        return LANG;
    }



}
