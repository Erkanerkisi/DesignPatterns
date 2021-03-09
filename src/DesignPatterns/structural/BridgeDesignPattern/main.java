package DesignPatterns.structural.BridgeDesignPattern;

public class main {

    public static void main(String[] args) {

        /*
        * Hiyerarşi yoğun bir tasarım yerine soyut metodların implementasyonlarını ayrı bir yerde tutmamızı sağlar.
        * Bu sayede üstten alta doğru giden bir kalıtımı engellemiş oluruz.
        * Yapmamız gereken implementasyonu asıl sınıflarımıza vermek ve köprüyü kurmak.
        * */
        AbstractSms abstractSms = new AsyncSms(new SmsBulk());
        abstractSms.sendMail();

        abstractSms = new TemplateSms(new SmsOtp());
        abstractSms.sendMail();
    }
}
