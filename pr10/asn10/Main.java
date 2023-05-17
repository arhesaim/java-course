package pr10.asn10;

import java.util.ArrayList;
import java.util.Random;


public class Main {
    public static Random random = new Random();
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Anna");
        list.add("MICHAEL");
        list.add("lEwIs");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Anna");
        list1.add("MICHAEL");
        list1.add("lEwIs");


        list.replaceAll(name -> name.toUpperCase() );

        System.out.println("\ncaps");
        for (String i:list){
            System.out.println(i);
        }

        list.replaceAll(name -> name + " " + (char)(random.nextInt(26) + 'A') + ".");

        System.out.println("\nsecond name");
        for (String i:list){
            System.out.println(i);
        }

        list1.replaceAll(name -> name + " " + new StringBuilder(name).reverse());

        System.out.println("\nreversed name");
        list1.forEach(i -> System.out.println(i));

        list1.removeIf(name -> {
            String[] names = name.split(" ");
            return names[0].equalsIgnoreCase(names[1]);
        });

        ArrayList<String> list2 = list1;

        System.out.println("\nremoved name");
        list2.forEach(i -> System.out.println(i));
    }
}
