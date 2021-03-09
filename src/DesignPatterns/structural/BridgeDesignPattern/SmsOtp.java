package DesignPatterns.structural.BridgeDesignPattern;

public class SmsOtp extends AbstractSmsType {
    @Override
    public void sendSms() {
        System.out.println("Sending Sms Otp Type");
    }
}
