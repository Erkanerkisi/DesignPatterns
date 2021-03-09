package DesignPatterns.structural.BridgeDesignPattern;

public class SmsBulk extends AbstractSmsType {
    @Override
    public void sendSms() {
        System.out.println("Sending Sms Bulk Type");
    }
}
