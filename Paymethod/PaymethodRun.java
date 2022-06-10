package Paymethod;

public class PaymethodRun {

    public static void main(String[] args) {

        String lang = "KO";

        PaymethodStorage PAYMETHOD_STORAGE = PaymethodStorage.getInstance();

        Paymethod paymethod = PAYMETHOD_STORAGE.getPaymethod("P000");

        PaymethodFactory paymethodFactory = new PaymethodFactory();
        PaymethodMapping paymethodMapping = paymethodFactory.getPaymethodMapping(lang);
        System.out.println(paymethodMapping);


    }

}
