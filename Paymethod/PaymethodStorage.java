package Paymethod;

import java.util.HashMap;
import java.util.Map;

public class PaymethodStorage {

    private static PaymethodStorage PAYMETHOD_STORAGE = new PaymethodStorage();

    private Map<String,Paymethod> storage = new HashMap<>();

    private PaymethodStorage()
    {
        storage.put("CC01", Paymethod.CC01);
    }

    public static PaymethodStorage getInstance()
    {
        return PAYMETHOD_STORAGE;
    }

    public Paymethod getPaymethod(String carCode)
    {
        return this.storage.get(carCode);
    }


}
