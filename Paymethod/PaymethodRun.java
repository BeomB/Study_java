package Paymethod;

public class PaymethodRun {

    public static void main(String[] args) {

        String lang = "ja";

        PaymethodStorage PAYMETHOD_STORAGE = PaymethodStorage.getInstance();

        PaymethodFactory paymethodFactory = new PaymethodFactory();
        PaymethodMapping paymethodMapping = paymethodFactory.getPaymethodMapping(lang);







    }

}
