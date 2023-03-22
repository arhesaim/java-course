package pr5;

import java.util.*;

public class Lab1 {
    public static Scanner sc;
    public static ArrayList<String> shoppingList;
    public static void main(String[] args){
        shoppingList = new ArrayList<>();
        chooseAction();
    }

    public static void chooseAction(){
        System.out.println("choose: \n0 - to shutdown\n" +
                "1 - to add item(s) to list (comma delimited list)\n" +
                "2 - to remove any items (comma delimited list)");
        sc = new Scanner(System.in);
        int opt = sc.nextInt();
        switch (opt){
            case 0:
                break;
            case 1:
                addItem();
                break;
            case 2:
                removeItem();
                break;
            default:
                System.out.println("no action, try again");
        }
    }

    public static void addItem(){
        sc = new Scanner(System.in);
        System.out.println("enter item: ");
        String item = sc.next();
        if (item.equals("")){
            System.out.println("please enter again");
            addItem();
        } else {
            if (item.contains(",")){
                addItems(item);
            } else {
                if (shoppingList.contains(item)){
                    System.out.printf("%s item is on a list\n", item);
                } else {
                    shoppingList.add(item);
                }
            }
            Collections.sort(shoppingList);
            System.out.println(shoppingList);
            chooseAction();
        }
    }

    public static void removeItem(){
        sc = new Scanner(System.in);
        System.out.println("enter item: ");;
        String item = sc.next();
        if (item.equals("")){
            System.out.println("try again");
            removeItem();
        } else {
            if (item.contains(",")){
                String[] items = item.split(",");
                shoppingList.removeAll(Arrays.asList(items));
            } else {
                shoppingList.remove(item);
            }
            System.out.println(shoppingList);
            chooseAction();
        }
    }

    public static void addItems(String item){
        String[] items = item.split(",");
        for (int i = 0; i < items.length; i++){
            if (shoppingList.contains(items[i])){
                System.out.printf("%s is already on a list\n", items[i]);
            } else {
                shoppingList.add(items[i]);
            }
        }
    }
}
