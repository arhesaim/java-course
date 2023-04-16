package pr7.ex1;

public record HockeyPlayer(String name, String strikesAverage) implements Player {
    public HockeyPlayer(String name, String strikesAverage){
        this.strikesAverage = strikesAverage;
        this.name = name;
    }
}
