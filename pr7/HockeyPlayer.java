package pr7;

public record HockeyPlayer(String name, String strikesAverage) implements Player {
    public HockeyPlayer(String name, String strikesAverage){
        this.strikesAverage = strikesAverage;
        this.name = name;
    }
}
