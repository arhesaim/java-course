package pr4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab0 {
    public static Random random = new Random();
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        boolean works = true;
        ArrayList<Integer> defaultArray = createArray();

        while (works){
            System.out.println("actions: \n1 - new sorted array\n2 - sort current array \n3 - break");
            int rep = sc.nextInt();
            switch(rep){
                case 1:
                    defaultArray = createArray();
                    sortArray(defaultArray);
                    break;
                case 2:
                    sortArray(defaultArray);
                    break;
                case 3:
                    works = false;
                    break;
                default:
                    System.out.println("no action, try again");
                    break;
            }

        }
    }

    public static ArrayList<Integer> createArray(){
        ArrayList<Integer> nums = new ArrayList<>();

        int length = random.nextInt(10) + 2;
        for (int i = 0; i < length; i++){
            nums.add(random.nextInt(10));
        }
        System.out.println("not sorted array: " + nums);
        return nums;
    }

    public static void sortArray(ArrayList<Integer> nums){
        for (int k = 0; k < nums.size(); k++){
            for (int i = 1; i < nums.size() - k; i++){
                if (nums.get(i) > nums.get(i-1)){
                    int num = nums.get(i);
                    nums.set(i, nums.get(i-1));
                    nums.set(i-1, num);
                }
            }
        }
        System.out.println("sorted array: " + nums);
    }
}
