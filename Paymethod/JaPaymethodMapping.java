package Paymethod;

import java.util.TreeMap;

public class JaPaymethodMapping implements PaymethodMapping {


    private static String LANG = "ja";

    private PaymethodStorage paymethodStorage = PaymethodStorage.getInstance();

    @Override
    public MappingDto mapping(TreeMap<String, String> paymap) {

        MappingDto mappingDto = new MappingDto();



        paymap.forEach((key, value) ->
        {
            if (key.contains("CC")) {
                mappingDto.getLocalMap().put(key, paymethodStorage.getPaymethod(key).getJaName());
            } else {
                mappingDto.getGlobalMap().put(key, paymethodStorage.getPaymethod(key).getJaName());
            }
        });
        return mappingDto;
    }

    @Override
    public String getLang(String lang) {
        return LANG;
    }



}
