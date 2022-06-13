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
               C025("WeChat", "WeChat","WeChat","微信","微信","WeChat"),
               C026("UnionPay(Offline)", "UnionPay (Offline)","UnionPay(Offline)","??（?下）","銀聯（離線）","UnionPay (Offline)"),
               C027("Molpay", "MOLPay","Molpay","Molpay","MOLPay","MOLPay"),
               C033("WeChat(In App)", "WeChat(In App)","WeChat(In App)","微信(In App)","微信(In App)","WeChat(In App)"),
               C037("WeChat(OA)", "WeChat(OA)","WeChat(OA)","微信(OA)","微信(OA)","WeChat(OA)"),
               C039("Molpay(VND)", "MOLPay(VND)","Molpay(VND)","Molpay(VND)","MOLPay(VND)","MOLPay(VND)"),
               C040("Molpay(THB)", "MOLPay(THB)","Molpay(THB)","Molpay(THB)","MOLPay(THB)","MOLPay(THB)"),
               C041("토스", "TOSS","TOSS","TOSS","TOSS","TOSS"),
               C042("PayPal", "PayPal","PayPal","??","PayPal","PayPal"),
               C043("유머니", "Yoomoney","Yoomoney","Yoomoney","Yoomoney","Yoomoney"),
               C044("카카오페이", "Kakao pay","Kakao pay","Kakao pay","Kakao pay","Kakao pay"),
               C045("가상계좌 ", "Virtual account","バ?チャル口座","????","虛擬帳戶","???????????"),
               C046("페이코", "Payco","Payco","Payco","PAYCO","Payco"),
               C047("WeChat(MINI)", "WeChat(MINI)","WeChat(MINI)","微信(MINI)","微信(MINI)","WeChat(MINI)"),
               C049("UnionPay(In App)", "UnionPay(In App)","UnionPay(In App)","??(In App)","銀聯(In App)","UnionPay(In App)"),
               C056("스마일페이", "Smile pay","Smile pay","SmilePay","SmilePay","SmilePay"),
               /** VN eWallet**/
               C057("VN eWallet", "VN eWallet 영어","VN eWallet 일본","VN eWallet 중국어","VN eWallet 대만","VN eWallet 태국"),

               C059("네이버페이(Card)", "Naver Pay(Card)","Naver Pay(Card)","NaverPay(Card)","NaverPay(Card)","NaverPay(Card)"),
               C060("네이버페이(Point)", "Naver Pay(Point)","Naver Pay(Point)","NaverPay(Point)","NaverPay(Point)","NaverPay(Point)"),
               C061("알리페이 플러스(Alipay_CN)", "Alipay Plus(Alipay_CN)","Alipay Plus(Alipay_CN)","支付?+(Alipay_CN)","支付寶+(Alipay_CN)","Alipay Plus(Alipay_CN)"),
               C062("알리페이 플러스(Alipay_HK)", "Alipay Plus(Alipay_HK)","Alipay Plus(Alipay_HK)","支付?+(Alipay_HK)","支付寶+(Alipay_HK)","Alipay Plus(Alipay_HK)"),
               C063("알리페이 플러스(TRUEMONEY)", "Alipay Plus(TRUEMONEY)","Alipay Plus(TRUEMONEY)","支付?+(TRUEMONEY)","支付寶+(TRUEMONEY)","Alipay Plus(TRUEMONEY)"),
               C064("알리페이 플러스(TNG)", "Alipay Plus(TNG)","Alipay Plus(TNG)본","支付?+","支付寶+(TNG)","Alipay Plus(TNG)"),
               C065("알리페이 플러스s(GCASH)", "Alipay Plus(GCASH)","Alipay Plus(GCASH)","支付?+(GCASH)","支付寶+(GCASH)","Alipay Plus(GCASH)"),
               C066("알리페이 플러스(DANA)", "Alipay Plus(DANA)","Alipay Plus(DANA)","支付?+","支付寶+(DANA)","Alipay Plus(DANA)"),
               C067("알리페이 플러스(KAKAOPAY)", "Alipay Plus(KAKAOPAY)","Alipay Plus(KAKAOPAY)","支付?+(KAKAOPAY)","支付寶+(KAKAOPAY)","Alipay Plus(KAKAOPAY)"),
               C068("알리페이 플러스(ALIPAY_MO)", "Alipay Plus(ALIPAY_MO)","Alipay Plus(ALIPAY_MO)","支付?+(ALIPAY_MO)","支付寶+(ALIPAY_MO)","Alipay Plus(ALIPAY_MO)"),
               C069("알리페이 플러스(PAYTM)", "Alipay Plus(PAYTM)","Alipay Plus(PAYTM)","支付?+","支付寶+(PAYTM)","支付寶+(PAYTM)"),
               C070("알리페이 플러스(EASYPAISA)", "Alipay Plus(EASYPAISA)","Alipay Plus(EASYPAISA)","支付?+(EASYPAISA)","支付寶+(EASYPAISA)","Alipay Plus(EASYPAISA)"),
               C071("알리페이 플러스(BKASH)", "Alipay Plus(BKASH)","Alipay Plus(BKASH)","支付?+(BKASH)","支付寶+(BKASH)","Alipay Plus(BKASH)"),






               C072("그랩페이", "GrabPay","GrabPay","GrabPay","GrabPay","GrabPay"),            ///추가해야함 (가로 안 값)
               C073("라인페이", "LINE Pay","LINE Pay","LINE Pay","LINE Pay","LINE Pay"),
               C074("쇼피페이", "ShopeePay","ShopeePay","ShopeePay","ShopeePay","ShopeePay"),

               /** 123alternative**/
               C075("123alternative", "123alternative 영어","123alternative 일본","123alternative 중국어","123alternative 대만","123alternative 태국"),
               C076("그랩페이(MYR)", "GrabPay(MYR)","GrabPay(MYR)","GrabPay(MYR)","GrabPay(MYR)","GrabPay(MYR)"),
               C077("그랩페이(PHP)", "GrabPay(PHP)","GrabPay(PHP)","GrabPay(PHP)","GrabPay(PHP)","GrabPay(PHP)"),

               /** BC 없ㅇ름**/
               CC00("BC card", "BC card 영어","BC card 일본","BC card 중국어","BC card 대만","BC card 태국"),

               CC01("KB (국민)", "KB (Kookmin)","KB (Kookmin)","KB (Kookmin)","KB (Kookmin)","KB (Kookmin)"),
               CC02("하나 (외환)", "Hana (KEB)","KEB Hana Card 일본","KEB Hana Card 중국어","KEB Hana Card 대만","KEB Hana Card 태국"),
               //하나 뭐가 진짜인지 해결하기
               CC03("삼성", "Samsung","Samsung","Samsung","Samsung","Samsung"),
               CC04("신한", "Shinhan","Shinhan","Shinhan","Shinhan","Shinhan"),
               CC05("현대", "Hyundai","Hyundai","Hyundai","Hyundai","Hyundai"),
               CC06("롯데", "Lotte","Lotte","Lotte","Lotte","Lotte"),
               CC07("NH (농협)", "NH","NH","NH","NH","NH"),
               CC09("씨티", "Citi","Citi","Citi","Citi","Citi"),
               CC10("우리", "Woori","Woori","Woori","Woori","Woori"),


               CC11("수협", "Suhyup","Suhyup","Suhyup","Suhyup","Suhyup"),

               //확인해보기
               CC12("제주", "Jeju","Jeju","Jeju","Jeju","Jeju"),
               CC13("전주", "Jeonbuk","Jeonbuk","Jeonbuk","Jeonbuk","Jeonbuk"),


               //여기서부터 확인하기 DB까지 확인하기
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


