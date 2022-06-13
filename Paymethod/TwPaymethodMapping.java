package Paymethod;

import java.util.TreeMap;

public class TwPaymethodMapping implements PaymethodMapping {


    private static String LANG = "th";

    private PaymethodStorage paymethodStorage = PaymethodStorage.getInstance();

    @Override
    public MappingDto mapping(TreeMap<String, String> paymap) {

        MappingDto mappingDto = new MappingDto();

        paymap.forEach((key, value) ->
        {
            if (key.contains("CC")) {
                mappingDto.getLocalMap().put(key, paymethodStorage.getPaymethod(key).getTwName());
            } else {
                mappingDto.getGlobalMap().put(key, paymethodStorage.getPaymethod(key).getTwName());
            }
        });
        return mappingDto;
    }

    @Override
    public String getLang(String lang) {
        return LANG;
    }



}
