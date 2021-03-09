package DesignPatterns.structural.BridgeDesignPattern;

public class AsyncSms extends AbstractSms {

    private AbstractSmsType abstractSmsType;

    public AsyncSms(AbstractSmsType abstractSmsType) {
        this.abstractSmsType = abstractSmsType;
    }

    @Override
    public void sendMail() {
        abstractSmsType.sendSms();
    }
}
