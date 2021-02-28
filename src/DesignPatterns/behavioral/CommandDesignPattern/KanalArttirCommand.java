package DesignPatterns.behavioral.CommandDesignPattern;

public class KanalArttirCommand implements ICommand {
    private final Tv tv;

    public KanalArttirCommand(Tv tv) {
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.kanalDegis();
    }
}
