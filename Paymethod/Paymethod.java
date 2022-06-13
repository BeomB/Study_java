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
               C025("WeChat", "WeChat","WeChat","ڰ��","ڰ��","WeChat"),
               C026("UnionPay(Offline)", "UnionPay (Offline)","UnionPay(Offline)","??��?����","��֤�����ʣ�","UnionPay (Offline)"),
               C027("Molpay", "MOLPay","Molpay","Molpay","MOLPay","MOLPay"),
               C033("WeChat(In App)", "WeChat(In App)","WeChat(In App)","ڰ��(In App)","ڰ��(In App)","WeChat(In App)"),
               C037("WeChat(OA)", "WeChat(OA)","WeChat(OA)","ڰ��(OA)","ڰ��(OA)","WeChat(OA)"),
               C039("Molpay(VND)", "MOLPay(VND)","Molpay(VND)","Molpay(VND)","MOLPay(VND)","MOLPay(VND)"),
               C040("Molpay(THB)", "MOLPay(THB)","Molpay(THB)","Molpay(THB)","MOLPay(THB)","MOLPay(THB)"),
               C041("�佺", "TOSS","TOSS","TOSS","TOSS","TOSS"),
               C042("PayPal", "PayPal","PayPal","??","PayPal","PayPal"),
               C043("���Ӵ�", "Yoomoney","Yoomoney","Yoomoney","Yoomoney","Yoomoney"),
               C044("īī������", "Kakao pay","Kakao pay","Kakao pay","Kakao pay","Kakao pay"),
               C045("������� ", "Virtual account","��?�����Ϣ�","????","��������","???????????"),
               C046("������", "Payco","Payco","Payco","PAYCO","Payco"),
               C047("WeChat(MINI)", "WeChat(MINI)","WeChat(MINI)","ڰ��(MINI)","ڰ��(MINI)","WeChat(MINI)"),
               C049("UnionPay(In App)", "UnionPay(In App)","UnionPay(In App)","??(In App)","��֤(In App)","UnionPay(In App)"),
               C056("����������", "Smile pay","Smile pay","SmilePay","SmilePay","SmilePay"),
               /** VN eWallet**/
               C057("VN eWallet", "VN eWallet ����","VN eWallet �Ϻ�","VN eWallet �߱���","VN eWallet �븸","VN eWallet �±�"),

               C059("���̹�����(Card)", "Naver Pay(Card)","Naver Pay(Card)","NaverPay(Card)","NaverPay(Card)","NaverPay(Card)"),
               C060("���̹�����(Point)", "Naver Pay(Point)","Naver Pay(Point)","NaverPay(Point)","NaverPay(Point)","NaverPay(Point)"),
               C061("�˸����� �÷���(Alipay_CN)", "Alipay Plus(Alipay_CN)","Alipay Plus(Alipay_CN)","���?+(Alipay_CN)","�����+(Alipay_CN)","Alipay Plus(Alipay_CN)"),
               C062("�˸����� �÷���(Alipay_HK)", "Alipay Plus(Alipay_HK)","Alipay Plus(Alipay_HK)","���?+(Alipay_HK)","�����+(Alipay_HK)","Alipay Plus(Alipay_HK)"),
               C063("�˸����� �÷���(TRUEMONEY)", "Alipay Plus(TRUEMONEY)","Alipay Plus(TRUEMONEY)","���?+(TRUEMONEY)","�����+(TRUEMONEY)","Alipay Plus(TRUEMONEY)"),
               C064("�˸����� �÷���(TNG)", "Alipay Plus(TNG)","Alipay Plus(TNG)��","���?+","�����+(TNG)","Alipay Plus(TNG)"),
               C065("�˸����� �÷���s(GCASH)", "Alipay Plus(GCASH)","Alipay Plus(GCASH)","���?+(GCASH)","�����+(GCASH)","Alipay Plus(GCASH)"),
               C066("�˸����� �÷���(DANA)", "Alipay Plus(DANA)","Alipay Plus(DANA)","���?+","�����+(DANA)","Alipay Plus(DANA)"),
               C067("�˸����� �÷���(KAKAOPAY)", "Alipay Plus(KAKAOPAY)","Alipay Plus(KAKAOPAY)","���?+(KAKAOPAY)","�����+(KAKAOPAY)","Alipay Plus(KAKAOPAY)"),
               C068("�˸����� �÷���(ALIPAY_MO)", "Alipay Plus(ALIPAY_MO)","Alipay Plus(ALIPAY_MO)","���?+(ALIPAY_MO)","�����+(ALIPAY_MO)","Alipay Plus(ALIPAY_MO)"),
               C069("�˸����� �÷���(PAYTM)", "Alipay Plus(PAYTM)","Alipay Plus(PAYTM)","���?+","�����+(PAYTM)","�����+(PAYTM)"),
               C070("�˸����� �÷���(EASYPAISA)", "Alipay Plus(EASYPAISA)","Alipay Plus(EASYPAISA)","���?+(EASYPAISA)","�����+(EASYPAISA)","Alipay Plus(EASYPAISA)"),
               C071("�˸����� �÷���(BKASH)", "Alipay Plus(BKASH)","Alipay Plus(BKASH)","���?+(BKASH)","�����+(BKASH)","Alipay Plus(BKASH)"),






               C072("�׷�����", "GrabPay","GrabPay","GrabPay","GrabPay","GrabPay"),            ///�߰��ؾ��� (���� �� ��)
               C073("��������", "LINE Pay","LINE Pay","LINE Pay","LINE Pay","LINE Pay"),
               C074("��������", "ShopeePay","ShopeePay","ShopeePay","ShopeePay","ShopeePay"),

               /** 123alternative**/
               C075("123alternative", "123alternative ����","123alternative �Ϻ�","123alternative �߱���","123alternative �븸","123alternative �±�"),
               C076("�׷�����(MYR)", "GrabPay(MYR)","GrabPay(MYR)","GrabPay(MYR)","GrabPay(MYR)","GrabPay(MYR)"),
               C077("�׷�����(PHP)", "GrabPay(PHP)","GrabPay(PHP)","GrabPay(PHP)","GrabPay(PHP)","GrabPay(PHP)"),

               /** BC ������**/
               CC00("BC card", "BC card ����","BC card �Ϻ�","BC card �߱���","BC card �븸","BC card �±�"),

               CC01("KB (����)", "KB (Kookmin)","KB (Kookmin)","KB (Kookmin)","KB (Kookmin)","KB (Kookmin)"),
               CC02("�ϳ� (��ȯ)", "Hana (KEB)","KEB Hana Card �Ϻ�","KEB Hana Card �߱���","KEB Hana Card �븸","KEB Hana Card �±�"),
               //�ϳ� ���� ��¥���� �ذ��ϱ�
               CC03("�Ｚ", "Samsung","Samsung","Samsung","Samsung","Samsung"),
               CC04("����", "Shinhan","Shinhan","Shinhan","Shinhan","Shinhan"),
               CC05("����", "Hyundai","Hyundai","Hyundai","Hyundai","Hyundai"),
               CC06("�Ե�", "Lotte","Lotte","Lotte","Lotte","Lotte"),
               CC07("NH (����)", "NH","NH","NH","NH","NH"),
               CC09("��Ƽ", "Citi","Citi","Citi","Citi","Citi"),
               CC10("�츮", "Woori","Woori","Woori","Woori","Woori"),


               CC11("����", "Suhyup","Suhyup","Suhyup","Suhyup","Suhyup"),

               //Ȯ���غ���
               CC12("����", "Jeju","Jeju","Jeju","Jeju","Jeju"),
               CC13("����", "Jeonbuk","Jeonbuk","Jeonbuk","Jeonbuk","Jeonbuk"),


               //���⼭���� Ȯ���ϱ� DB���� Ȯ���ϱ�
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


