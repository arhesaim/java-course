package pr7;

public record FootballPlayer(String name, String shotsPerGame) implements Player {
    public FootballPlayer(String name, String shotsPerGame){
        this.shotsPerGame = shotsPerGame;
        this.name = name;
    }
}
