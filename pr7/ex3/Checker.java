package pr7.ex3;

import java.util.Comparator;

public class Checker implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2){
        return o1.getScore() - o2.getScore();
    }
}