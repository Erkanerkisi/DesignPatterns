package DesignPatterns.behavioral.CommandDesignPattern;

public class TvAcCommand implements ICommand {

    private final Tv tv;

    public TvAcCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
     tv.tvAc();
    }
}
