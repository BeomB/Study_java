package Paymethod;

 public enum Paymethod {

        C000("VISA", "VISA","VISA","VISA","VISA","VISA"),
        C001("MasterCard", "MasterCard","MasterCard","MasterCard","MasterCard","MasterCard"),
        C002("AMEX", "AMEX","AMEX","AMEX","AMEX","AMEX"),
        C003("JCB", "JCB","JCB","JCB","JCB","JCB"),
        C004("DINERS", "DINERS","DINERS","DINERS","DINERS","DINERS"),
        C005("DISCOVER", "DISCOVER","DISCOVER","DISCOVER","Discover Credit Cards","DISCOVER"),
        C007("MIR", "MIR","MIR","MIR","MIR","MIR"),
        C010("�˸�����", "AliPay","AliPay","���?","�����","AliPay"),
        C015("PayPal", "PayPal","PayPal","??","PayPal","PayPal"),
        C020("Tenpay", "Tenpay","Tenpay","?����","�����","Tenpay"),
        C023("UnionPay", "UnionPay","UnionPay","??","��֤","UnionPay"),
        /** ��������**/
        C024("eContext", "eContext ����","eContext �Ϻ�","eContext �߱���","eContext �븸","eContext �±�"),


        /** ______________________________________________________________________________________________________**/


        C025("WeChat", "WeChat ����","WeChat �Ϻ�","WeChat �߱���","WeChat �븸","WeChat �±�"),
        C026("UnionPay (Offline)", "UnionPay (Offline) ����","UnionPay (Offline) �Ϻ�","UnionPay (Offline) �߱���","UnionPay (Offline) �븸","UnionPay (Offline) �±�"),
        C027("Molpay", "Molpay ����","Molpay �Ϻ�","Molpay �߱���","Molpay �븸","Molpay �±�"),
        C033("WeChat(In App)", "WeChat(In App) ����","WeChat(In App) �Ϻ�","WeChat(In App) �߱���","WeChat(In App) �븸","WeChat(In App) �±�"),
        C037("WeChat(OA)", "WeChat(OA) ����","WeChat(OA) �Ϻ�","WeChat(OA) �߱���","WeChat(OA) �븸","WeChat(OA) �±�"),
        C039("Molpay(VND)", "Molpay(VND) ����","Molpay(VND) �Ϻ�","Molpay(VND) �߱���","Molpay(VND) �븸","Molpay(VND) �±�"),
        C040("Molpay(THB)", "Molpay(THB) ����","Molpay(THB) �Ϻ�","Molpay(THB) �߱���","Molpay(THB) �븸","Molpay(THB) �±�"),
        C041("TOSS", "TOSS ����","TOSS �Ϻ�","TOSS �߱���","TOSS �븸","TOSS �±�"),
        C042("PayPal", "PayPal ����","PayPal �Ϻ�","PayPal �߱���","PayPal �븸","PayPal �±�"),
        C043("Yandex", "Yandex ����","Yandex �Ϻ�","Yandex �߱���","Yandex �븸","Yandex �±�"),
        C044("KakaoPay", "KakaoPay ����","KakaoPay �Ϻ�","KakaoPay �߱���","KakaoPay �븸","KakaoPay �±�"),
        C045("�������", "������� ����","������� �Ϻ�","������� �߱���","������� �븸","������� �±�"),
        C046("PAYCO", "PAYCO ����","PAYCO �Ϻ�","PAYCO �߱���","PAYCO �븸","PAYCO �±�"),
        C047("WeChat(MINI)", "WeChat(MINI) ����","WeChat(MINI) �Ϻ�","WeChat(MINI) �߱���","WeChat(MINI) �븸","WeChat(MINI) �±�"),
        C049("UnionPay(In App)", "UnionPay(In App) ����","UnionPay(In App) �Ϻ�","UnionPay(In App) �߱���","UnionPay(In App) �븸","UnionPay(In App) �±�"),
        C056("SmilePay", "SmilePay ����","SmilePay �Ϻ�","SmilePay �߱���","SmilePay �븸","SmilePay �±�"),
        C057("VN eWallet", "VN eWallet ����","VN eWallet �Ϻ�","VN eWallet �߱���","VN eWallet �븸","VN eWallet �±�"),
        C059("Naver Pay(Card)", "Naver Pay(Card) ����","Naver Pay(Card) �Ϻ�","Naver Pay(Card) �߱���","Naver Pay(Card) �븸","Naver Pay(Card) �±�"),
        C060("Naver Pay(Point)", "Naver Pay(Point) ����","Naver Pay(Point) �Ϻ�","Naver Pay(Point) �߱���","Naver Pay(Point) �븸","Naver Pay(Point) �±�"),
        C061("Alipay Plus(Alipay_CN)", "Alipay Plus(Alipay_CN) ����","Alipay Plus(Alipay_CN) �Ϻ�","Alipay Plus(Alipay_CN) �߱���","Alipay Plus(Alipay_CN) �븸","Alipay Plus(Alipay_CN) �±�"),
        C062("Alipay Plus(Alipay_HK)", "Alipay Plus(Alipay_HK) ����","Alipay Plus(Alipay_HK) �Ϻ�","Alipay Plus(Alipay_HK) �߱���","Alipay Plus(Alipay_HK) �븸","Alipay Plus(Alipay_HK) �±�"),
        C063("Alipay Plus(TRUEMONEY)", "Alipay Plus(TRUEMONEY) ����","Alipay Plus(TRUEMONEY) �Ϻ�","Alipay Plus(TRUEMONEY) �߱���","Alipay Plus(TRUEMONEY) �븸","Alipay Plus(TRUEMONEY) �±�"),
        C064("Alipay Plus(TNG)", "Alipay Plus(TNG) ����","Alipay Plus(TNG) �Ϻ�","Alipay Plus(TNG) �߱���","Alipay Plus(TNG) �븸","Alipay Plus(TNG) �±�"),
        C065("Alipay Plus(GCASH)", "Alipay Plus(GCASH) ����","Alipay Plus(GCASH) �Ϻ�","Alipay Plus(GCASH) �߱���","Alipay Plus(GCASH) �븸","Alipay Plus(GCASH) �±�"),
        C066("Alipay Plus(DANA)", "Alipay Plus(DANA) ����","Alipay Plus(DANA) �Ϻ�","Alipay Plus(DANA) �߱���","Alipay Plus(DANA) �븸","Alipay Plus(DANA) �±�"),
        C067("Alipay Plus(KAKAOPAY)", "Alipay Plus(KAKAOPAY) ����","Alipay Plus(KAKAOPAY) �Ϻ�","Alipay Plus(KAKAOPAY) �߱���","Alipay Plus(KAKAOPAY) �븸","Alipay Plus(KAKAOPAY) �±�"),
        C068("Alipay Plus(ALIPAY_MO)", "Alipay Plus(ALIPAY_MO) ����","Alipay Plus(ALIPAY_MO) �Ϻ�","Alipay Plus(ALIPAY_MO) �߱���","Alipay Plus(ALIPAY_MO) �븸","Alipay Plus(ALIPAY_MO) �±�"),
        C069("Alipay Plus(PAYTM)", "Alipay Plus(PAYTM) ����","Alipay Plus(PAYTM) �Ϻ�","Alipay Plus(PAYTM) �߱���","Alipay Plus(PAYTM) �븸","Alipay Plus(PAYTM) �±�"),
        C070("Alipay Plus(EASYPAISA)", "Alipay Plus(EASYPAISA) ����","Alipay Plus(EASYPAISA) �Ϻ�","Alipay Plus(EASYPAISA) �߱���","Alipay Plus(EASYPAISA) �븸","Alipay Plus(EASYPAISA) �±�"),
        C071("Alipay Plus(BKASH)", "Alipay Plus(BKASH) ����","Alipay Plus(BKASH) �Ϻ�","Alipay Plus(BKASH) �߱���","Alipay Plus(BKASH) �븸","Alipay Plus(BKASH) �±�"),
        C072("GrabPay(SGD)", "GrabPay(SGD) ����","GrabPay(SGD) �Ϻ�","GrabPay(SGD) �߱���","GrabPay(SGD) �븸","GrabPay(SGD) �±�"),
        C073("LinePay", "LinePay ����","LinePay �Ϻ�","LinePay �߱���","LinePay �븸","LinePay �±�"),
        C074("ShopeePay", "ShopeePay ����","ShopeePay �Ϻ�","ShopeePay �߱���","ShopeePay �븸","ShopeePay �±�"),
        C075("123alternative", "123alternative ����","123alternative �Ϻ�","123alternative �߱���","123alternative �븸","123alternative �±�"),
        C076("GrabPay(MYR)", "GrabPay(MYR) ����","GrabPay(MYR) �Ϻ�","GrabPay(MYR) �߱���","GrabPay(MYR) �븸","GrabPay(MYR) �±�"),
        C077("GrabPay(PHP)", "GrabPay(PHP) ����","GrabPay(PHP) �Ϻ�","GrabPay(PHP) �߱���","GrabPay(PHP) �븸","GrabPay(PHP) �±�"),


        CC00("BC card", "BC card ����","BC card �Ϻ�","BC card �߱���","BC card �븸","BC card �±�"),
        CC01("KB Kookmin Card", "KB Kookmin Card ����","KB Kookmin Card �Ϻ�","KB Kookmin Card �߱���","KB Kookmin Card �븸","KB Kookmin Card �±�"),
        CC02("KEB Hana Card", "KEB Hana Card ����","KEB Hana Card �Ϻ�","KEB Hana Card �߱���","KEB Hana Card �븸","KEB Hana Card �±�"),
        CC03("Samsung Card", "Samsung Card ����","Samsung Card �Ϻ�","Samsung Card �߱���","Samsung Card �븸","Samsung Card �±�"),
        CC04("Shinhan card", "Shinhan card ����","Shinhan card �Ϻ�","Shinhan card �߱���","Shinhan card �븸","Shinhan card �±�"),
        CC05("Hyundai card", "Hyundai card ����","Hyundai card �Ϻ�","Hyundai card �߱���","Hyundai card �븸","Hyundai card �±�"),
        CC06("Lotte Card", "Lotte Card ����","Lotte Card �Ϻ�","Lotte Card �߱���","Lotte Card �븸","Lotte Card �±�"),
        CC07("NH Card", "NH Card ����","NH Card �Ϻ�","NH Card �߱���","NH Card �븸","NH Card �±�"),
        CC09("Citi Card", "Citi Card ����","Citi Card �Ϻ�","Citi Card �߱���","Citi Card �븸","Citi Card �±�"),
        CC10("Woori Card", "Woori Card ����","Woori Card �Ϻ�","Woori Card �߱���","Woori Card �븸","Woori Card �±�"),
        CC11("Suhyup Card", "Suhyup Card ����","Suhyup Card �Ϻ�","Suhyup Card �߱���","Suhyup Card �븸","Suhyup Card �±�"),
        CC12("Jeju Bank Card", "Jeju Bank Card ����","Jeju Bank Card �Ϻ�","Jeju Bank Card �߱���","Jeju Bank Card �븸","Jeju Bank Card �±�"),
        CC13("JB Bank Card", "JB Bank Card ����","JB Bank Card �Ϻ�","JB Bank Card �߱���","JB Bank Card �븸","JB Bank Card �±�"),


        CC14("KJ Bank Card", "KJ Bank Card ����","KJ Bank Card �Ϻ�","KJ Bank Card �߱���","KJ Bank Card �븸","KJ Bank Card �±�"),
        CC16("kakaobank Card", "kakaobank Card ����","kakaobank Card �Ϻ�","kakaobank Card �߱���","kakaobank Card �븸","kakaobank Card �±�"),
        CC17("K bank Card", "K bank Card ����","K bank Card �Ϻ�","K bank Card �߱���","K bank Card �븸","��K bank Card��ī�� �±�"),
        CC18("Miraeasset Card", "Miraeasset Card ����","Miraeasset Card �Ϻ�","Miraeasset Card �߱���","Miraeasset Card �븸","Miraeasset Card �±�"),
        CC19("Kona Card", "Kona Card ����","Kona Card �Ϻ�","Kona Card �߱���","Kona Card �븸","Kona Card �±�"),
        CC20("Toss Card", "Toss Card ����","Toss Card �Ϻ�","Toss Card �߱���","Toss Card �븸","Toss Card �±�"),
        CC21("Chai Card", "Chai Card ����","Chai Card �Ϻ�","Chai Card �߱���","Chai Card �븸","Chai Card �±�"),
        CC22("KDBC Card", "KDBC Card ����","KDBC Card �Ϻ�","KDBC Card �߱���","KDBC Card �븸","KDBC Card �±�"),
        CC23("Post Office", "Post Office ����","Post Office �Ϻ�","Post Office �߱���","Post Office �븸","Post Office �±�"),
        CC24("KDB Card", "KDB Card ����","KDB Card �Ϻ�","KDB Card �߱���","KDB Card �븸","KDB Card �±�"),
        CC25("SC Card", "SC Card ����","SC Card �Ϻ�","SC Card �߱���","SC Card �븸","SC Card �±�"),
        CC26("IBK Card", "IBK Card ����","IBK Card �Ϻ�","IBK Card �߱���","IBK Card �븸","IBK Card �±�"),
        CC27("KB Securities", "KB Securities ����","KB Securities �Ϻ�","KB Securities �߱���","KB Securities �븸","KB Securities �±�"),
        CC28("Credit Union", "Credit Union ����","Credit Union �Ϻ�","Credit Union �߱���","Credit Union �븸","Credit Union �±�"),
        CC99("��Ÿī��", "��Ÿī�� ����","��Ÿī�� �Ϻ�","��Ÿī�� �߱���","��Ÿī�� �븸","��Ÿī�� �±�");












        private String krName;
        private String enName;
        private String jaName;
        private String zhName;
        private String thName;
        private String twName;


        Paymethod(String krName, String enName, String jaName, String zhName, String thName, String twName) {
               this.krName = krName;
               this.enName = enName;
               this.jaName = jaName;
               this.zhName = zhName;
               this.thName = thName;
               this.twName = twName;
        }

        public String getKrName() {
               return krName;
        }

        public String getEnName() {
               return enName;
        }

        public String getJaName() {
               return jaName;
        }

        public String getZhName() {
               return zhName;
        }

        public String getThName() {
               return thName;
        }

        public String getTwName() {
               return twName;
        }


        @Override
        public String toString() {
               return "Paymethod{" +
                       "krName='" + krName + '\'' +
                       ", enName='" + enName + '\'' +
                       ", jaName='" + jaName + '\'' +
                       ", zhName='" + zhName + '\'' +
                       ", thName='" + thName + '\'' +
                       ", twName='" + twName + '\'' +
                       '}';
        }
 }


