package DesignPatterns.structural.BridgeDesignPattern;

public class TemplateSms extends AbstractSms {

    private AbstractSmsType abstractSmsType;

    public TemplateSms(AbstractSmsType abstractSmsType) {
        this.abstractSmsType = abstractSmsType;
    }

    @Override
    public void sendMail() {
        abstractSmsType.sendSms();
    }
}
