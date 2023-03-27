package pr5;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Lab2{
    public static Scanner sc;
    public static LinkedList<Place> distances;
    public static ListIterator<Place> listIterator;
    public static void main(String[] args){
        Place way0 = new Place("Tallinn");
        Place way1 = new Place("St.Petersburg", 363.7);
        Place way2 = new Place("Riga", 310.9);
        Place way3 = new Place("Helsinki", 86.6);
        Place way4 = new Place("London", 2618.4);
        Place way5 = new Place("Moscow", 1025.6);
        Place way6 = new Place("Vilnius", 601.7);

        distances = new LinkedList<>();
        addUnique(way0);
        addUnique(way1);
        addUnique(way2);
        addUnique(way3);
        addUnique(way4);
        addUnique(way5);
        addUnique(way6);
        addUnique(way6);

        for (int k = 0; k < distances.size(); k++){
            for (int i = 1; i < distances.size()-k; i++){
                if (distances.get(i).getDistance() < distances.get(i-1).getDistance()){
                    Place dist = distances.get(i);
                    distances.set(i, distances.get(i-1));
                    distances.set(i-1, dist);
                }
            }
        }
        listIterator = distances.listIterator();
        operations();
    }

    public static void operations(){
        sc = new Scanner(System.in);
        System.out.println("actions: \n(F)orward\n" +
                "(B)ackward\n" +
                "(L)ist Places\n" +
                "(Q)uit");
        String opt = sc.next();
        switch (opt){
            case "f":
                nextPlace();
                break;
            case "b":
                previousPlace();
                break;
            case "l":
                listPlaces();
                break;
            case "q":
                break;
        }
    }

    public static void nextPlace(){
        if (listIterator.hasNext()){
            Place place = listIterator.next();
            System.out.println(place.getPlace() + " " + place.getDistance() + "\n");
            operations();
        } else {
            System.out.println("no next destination!\n");
            operations();
        }
    }

    public static void previousPlace(){
        if (listIterator.hasPrevious()){
            Place place = listIterator.previous();
            System.out.println(place.getPlace() + " " + place.getDistance() + "\n");
            operations();
        } else {
            System.out.println("no previous destination!\n");
            operations();
        }
    }

    public static void listPlaces(){
        for (Place i: distances){
            System.out.println(i.getPlace() + " " + i.getDistance());
        }
        System.out.println("");
        operations();
    }

    public static void addUnique(Place place){
        if (distances.contains(place)){
            System.out.println("already in a list");
        } else {
            distances.add(place);
        }
    }
}
