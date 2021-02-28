package DesignPatterns.behavioral.CommandDesignPattern;

public class TvKapatCommand implements ICommand {
    private final Tv tv;

    public TvKapatCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.tvKapat();
    }
}
