package Paymethod;

 public enum Paymethod {

        C000("VISA", "VISA","VISA","VISA","VISA","VISA"),
        C001("MasterCard", "MasterCard","MasterCard","MasterCard","MasterCard","MasterCard"),
        C002("AMEX", "AMEX","AMEX","AMEX","AMEX","AMEX"),
        C003("JCB", "JCB","JCB","JCB","JCB","JCB"),
        C004("DINERS", "DINERS","DINERS","DINERS","DINERS","DINERS"),
        C005("DISCOVER", "DISCOVER","DISCOVER","DISCOVER","Discover Credit Cards","DISCOVER"),
        C007("MIR", "MIR","MIR","MIR","MIR","MIR"),
        C010("알리페이", "AliPay","AliPay","支付?","支付寶","AliPay"),
        C015("PayPal", "PayPal","PayPal","??","PayPal","PayPal"),
        C020("Tenpay", "Tenpay","Tenpay","?付通","財付通","Tenpay"),
        C023("UnionPay", "UnionPay","UnionPay","??","銀聯","UnionPay"),
        /** 이컨없음**/
        C024("eContext", "eContext 영어","eContext 일본","eContext 중국어","eContext 대만","eContext 태국"),


        /** ______________________________________________________________________________________________________**/


        C025("WeChat", "WeChat 영어","WeChat 일본","WeChat 중국어","WeChat 대만","WeChat 태국"),
        C026("UnionPay (Offline)", "UnionPay (Offline) 영어","UnionPay (Offline) 일본","UnionPay (Offline) 중국어","UnionPay (Offline) 대만","UnionPay (Offline) 태국"),
        C027("Molpay", "Molpay 영어","Molpay 일본","Molpay 중국어","Molpay 대만","Molpay 태국"),
        C033("WeChat(In App)", "WeChat(In App) 영어","WeChat(In App) 일본","WeChat(In App) 중국어","WeChat(In App) 대만","WeChat(In App) 태국"),
        C037("WeChat(OA)", "WeChat(OA) 영어","WeChat(OA) 일본","WeChat(OA) 중국어","WeChat(OA) 대만","WeChat(OA) 태국"),
        C039("Molpay(VND)", "Molpay(VND) 영어","Molpay(VND) 일본","Molpay(VND) 중국어","Molpay(VND) 대만","Molpay(VND) 태국"),
        C040("Molpay(THB)", "Molpay(THB) 영어","Molpay(THB) 일본","Molpay(THB) 중국어","Molpay(THB) 대만","Molpay(THB) 태국"),
        C041("TOSS", "TOSS 영어","TOSS 일본","TOSS 중국어","TOSS 대만","TOSS 태국"),
        C042("PayPal", "PayPal 영어","PayPal 일본","PayPal 중국어","PayPal 대만","PayPal 태국"),
        C043("Yandex", "Yandex 영어","Yandex 일본","Yandex 중국어","Yandex 대만","Yandex 태국"),
        C044("KakaoPay", "KakaoPay 영어","KakaoPay 일본","KakaoPay 중국어","KakaoPay 대만","KakaoPay 태국"),
        C045("가상계좌", "가상계좌 영어","가상계좌 일본","가상계좌 중국어","가상계좌 대만","가상계좌 태국"),
        C046("PAYCO", "PAYCO 영어","PAYCO 일본","PAYCO 중국어","PAYCO 대만","PAYCO 태국"),
        C047("WeChat(MINI)", "WeChat(MINI) 영어","WeChat(MINI) 일본","WeChat(MINI) 중국어","WeChat(MINI) 대만","WeChat(MINI) 태국"),
        C049("UnionPay(In App)", "UnionPay(In App) 영어","UnionPay(In App) 일본","UnionPay(In App) 중국어","UnionPay(In App) 대만","UnionPay(In App) 태국"),
        C056("SmilePay", "SmilePay 영어","SmilePay 일본","SmilePay 중국어","SmilePay 대만","SmilePay 태국"),
        C057("VN eWallet", "VN eWallet 영어","VN eWallet 일본","VN eWallet 중국어","VN eWallet 대만","VN eWallet 태국"),
        C059("Naver Pay(Card)", "Naver Pay(Card) 영어","Naver Pay(Card) 일본","Naver Pay(Card) 중국어","Naver Pay(Card) 대만","Naver Pay(Card) 태국"),
        C060("Naver Pay(Point)", "Naver Pay(Point) 영어","Naver Pay(Point) 일본","Naver Pay(Point) 중국어","Naver Pay(Point) 대만","Naver Pay(Point) 태국"),
        C061("Alipay Plus(Alipay_CN)", "Alipay Plus(Alipay_CN) 영어","Alipay Plus(Alipay_CN) 일본","Alipay Plus(Alipay_CN) 중국어","Alipay Plus(Alipay_CN) 대만","Alipay Plus(Alipay_CN) 태국"),
        C062("Alipay Plus(Alipay_HK)", "Alipay Plus(Alipay_HK) 영어","Alipay Plus(Alipay_HK) 일본","Alipay Plus(Alipay_HK) 중국어","Alipay Plus(Alipay_HK) 대만","Alipay Plus(Alipay_HK) 태국"),
        C063("Alipay Plus(TRUEMONEY)", "Alipay Plus(TRUEMONEY) 영어","Alipay Plus(TRUEMONEY) 일본","Alipay Plus(TRUEMONEY) 중국어","Alipay Plus(TRUEMONEY) 대만","Alipay Plus(TRUEMONEY) 태국"),
        C064("Alipay Plus(TNG)", "Alipay Plus(TNG) 영어","Alipay Plus(TNG) 일본","Alipay Plus(TNG) 중국어","Alipay Plus(TNG) 대만","Alipay Plus(TNG) 태국"),
        C065("Alipay Plus(GCASH)", "Alipay Plus(GCASH) 영어","Alipay Plus(GCASH) 일본","Alipay Plus(GCASH) 중국어","Alipay Plus(GCASH) 대만","Alipay Plus(GCASH) 태국"),
        C066("Alipay Plus(DANA)", "Alipay Plus(DANA) 영어","Alipay Plus(DANA) 일본","Alipay Plus(DANA) 중국어","Alipay Plus(DANA) 대만","Alipay Plus(DANA) 태국"),
        C067("Alipay Plus(KAKAOPAY)", "Alipay Plus(KAKAOPAY) 영어","Alipay Plus(KAKAOPAY) 일본","Alipay Plus(KAKAOPAY) 중국어","Alipay Plus(KAKAOPAY) 대만","Alipay Plus(KAKAOPAY) 태국"),
        C068("Alipay Plus(ALIPAY_MO)", "Alipay Plus(ALIPAY_MO) 영어","Alipay Plus(ALIPAY_MO) 일본","Alipay Plus(ALIPAY_MO) 중국어","Alipay Plus(ALIPAY_MO) 대만","Alipay Plus(ALIPAY_MO) 태국"),
        C069("Alipay Plus(PAYTM)", "Alipay Plus(PAYTM) 영어","Alipay Plus(PAYTM) 일본","Alipay Plus(PAYTM) 중국어","Alipay Plus(PAYTM) 대만","Alipay Plus(PAYTM) 태국"),
        C070("Alipay Plus(EASYPAISA)", "Alipay Plus(EASYPAISA) 영어","Alipay Plus(EASYPAISA) 일본","Alipay Plus(EASYPAISA) 중국어","Alipay Plus(EASYPAISA) 대만","Alipay Plus(EASYPAISA) 태국"),
        C071("Alipay Plus(BKASH)", "Alipay Plus(BKASH) 영어","Alipay Plus(BKASH) 일본","Alipay Plus(BKASH) 중국어","Alipay Plus(BKASH) 대만","Alipay Plus(BKASH) 태국"),
        C072("GrabPay(SGD)", "GrabPay(SGD) 영어","GrabPay(SGD) 일본","GrabPay(SGD) 중국어","GrabPay(SGD) 대만","GrabPay(SGD) 태국"),
        C073("LinePay", "LinePay 영어","LinePay 일본","LinePay 중국어","LinePay 대만","LinePay 태국"),
        C074("ShopeePay", "ShopeePay 영어","ShopeePay 일본","ShopeePay 중국어","ShopeePay 대만","ShopeePay 태국"),
        C075("123alternative", "123alternative 영어","123alternative 일본","123alternative 중국어","123alternative 대만","123alternative 태국"),
        C076("GrabPay(MYR)", "GrabPay(MYR) 영어","GrabPay(MYR) 일본","GrabPay(MYR) 중국어","GrabPay(MYR) 대만","GrabPay(MYR) 태국"),
        C077("GrabPay(PHP)", "GrabPay(PHP) 영어","GrabPay(PHP) 일본","GrabPay(PHP) 중국어","GrabPay(PHP) 대만","GrabPay(PHP) 태국"),


        CC00("BC card", "BC card 영어","BC card 일본","BC card 중국어","BC card 대만","BC card 태국"),
        CC01("KB Kookmin Card", "KB Kookmin Card 영어","KB Kookmin Card 일본","KB Kookmin Card 중국어","KB Kookmin Card 대만","KB Kookmin Card 태국"),
        CC02("KEB Hana Card", "KEB Hana Card 영어","KEB Hana Card 일본","KEB Hana Card 중국어","KEB Hana Card 대만","KEB Hana Card 태국"),
        CC03("Samsung Card", "Samsung Card 영어","Samsung Card 일본","Samsung Card 중국어","Samsung Card 대만","Samsung Card 태국"),
        CC04("Shinhan card", "Shinhan card 영어","Shinhan card 일본","Shinhan card 중국어","Shinhan card 대만","Shinhan card 태국"),
        CC05("Hyundai card", "Hyundai card 영어","Hyundai card 일본","Hyundai card 중국어","Hyundai card 대만","Hyundai card 태국"),
        CC06("Lotte Card", "Lotte Card 영어","Lotte Card 일본","Lotte Card 중국어","Lotte Card 대만","Lotte Card 태국"),
        CC07("NH Card", "NH Card 영어","NH Card 일본","NH Card 중국어","NH Card 대만","NH Card 태국"),
        CC09("Citi Card", "Citi Card 영어","Citi Card 일본","Citi Card 중국어","Citi Card 대만","Citi Card 태국"),
        CC10("Woori Card", "Woori Card 영어","Woori Card 일본","Woori Card 중국어","Woori Card 대만","Woori Card 태국"),
        CC11("Suhyup Card", "Suhyup Card 영어","Suhyup Card 일본","Suhyup Card 중국어","Suhyup Card 대만","Suhyup Card 태국"),
        CC12("Jeju Bank Card", "Jeju Bank Card 영어","Jeju Bank Card 일본","Jeju Bank Card 중국어","Jeju Bank Card 대만","Jeju Bank Card 태국"),
        CC13("JB Bank Card", "JB Bank Card 영어","JB Bank Card 일본","JB Bank Card 중국어","JB Bank Card 대만","JB Bank Card 태국"),


        CC14("KJ Bank Card", "KJ Bank Card 영어","KJ Bank Card 일본","KJ Bank Card 중국어","KJ Bank Card 대만","KJ Bank Card 태국"),
        CC16("kakaobank Card", "kakaobank Card 영어","kakaobank Card 일본","kakaobank Card 중국어","kakaobank Card 대만","kakaobank Card 태국"),
        CC17("K bank Card", "K bank Card 영어","K bank Card 일본","K bank Card 중국어","K bank Card 대만","신K bank Card용카드 태국"),
        CC18("Miraeasset Card", "Miraeasset Card 영어","Miraeasset Card 일본","Miraeasset Card 중국어","Miraeasset Card 대만","Miraeasset Card 태국"),
        CC19("Kona Card", "Kona Card 영어","Kona Card 일본","Kona Card 중국어","Kona Card 대만","Kona Card 태국"),
        CC20("Toss Card", "Toss Card 영어","Toss Card 일본","Toss Card 중국어","Toss Card 대만","Toss Card 태국"),
        CC21("Chai Card", "Chai Card 영어","Chai Card 일본","Chai Card 중국어","Chai Card 대만","Chai Card 태국"),
        CC22("KDBC Card", "KDBC Card 영어","KDBC Card 일본","KDBC Card 중국어","KDBC Card 대만","KDBC Card 태국"),
        CC23("Post Office", "Post Office 영어","Post Office 일본","Post Office 중국어","Post Office 대만","Post Office 태국"),
        CC24("KDB Card", "KDB Card 영어","KDB Card 일본","KDB Card 중국어","KDB Card 대만","KDB Card 태국"),
        CC25("SC Card", "SC Card 영어","SC Card 일본","SC Card 중국어","SC Card 대만","SC Card 태국"),
        CC26("IBK Card", "IBK Card 영어","IBK Card 일본","IBK Card 중국어","IBK Card 대만","IBK Card 태국"),
        CC27("KB Securities", "KB Securities 영어","KB Securities 일본","KB Securities 중국어","KB Securities 대만","KB Securities 태국"),
        CC28("Credit Union", "Credit Union 영어","Credit Union 일본","Credit Union 중국어","Credit Union 대만","Credit Union 태국"),
        CC99("기타카드", "기타카드 영어","기타카드 일본","기타카드 중국어","기타카드 대만","기타카드 태국");












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


