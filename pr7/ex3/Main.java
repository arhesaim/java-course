package pr7.ex3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Player[] players = new Player[5];

        players[0] = new Player("amy", 100);
        players[1] = new Player("david", 100);
        players[2] = new Player("heraldo", 50);
        players[3] = new Player("aakansa", 75);
        players[4] = new Player("aleksa", 150);

        Arrays.sort(players, new Checker().reversed());

        for (Player player : players) {
            System.out.println(player.getName() + " " + player.getScore());
        }
    }
}