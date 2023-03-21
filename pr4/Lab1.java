package pr4;

import java.util.Random;

public class Lab1 {
    public static void main(String[] args){
        double[] doubles = {0, 0, 0.55, 0, 0};
        double uniqueNum = doubles[0];
        for (int i = 1; i < doubles.length; i++){
            if (doubles[i] != uniqueNum){
                uniqueNum = doubles[i];
                System.out.println(uniqueNum);
                break;
            }
        }
    }
}
