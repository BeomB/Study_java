package Paymethod;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class PaymethodFactory {

    private List<PaymethodMapping> paymethodMappings = new ArrayList<>();

    public PaymethodFactory() {paymethodMappings.add(new KrPaymethodMapping());}

    public PaymethodMapping getPaymethodMapping(String lang)
    {
        return paymethodMappings.stream()
                .filter(pay -> pay.getLang(lang).equals(lang))
                .findAny()
                .orElseThrow(NoSuchElementException::new);
    }


}
