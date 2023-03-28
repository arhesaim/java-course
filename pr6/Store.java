package pr6;

import java.util.ArrayList;

public class Store{
    public static ArrayList<ProductsForSale> productsForSale;
    public static ArrayList<OrderItem> order;
    public static void main(String[] args){
        productsForSale = new ArrayList<>();
        order = new ArrayList<>();

        Product_A productA = new Product_A("milk", 2.15, "lactose-free");
        Product_B productB = new Product_B("ice-cream", 6.50, "vegan");
        Product_C productC = new Product_C("bread", 2.90, "wholegrain");

        productA.printPricedItem(5);
        productB.printPricedItem(3);
        productC.printPricedItem(1);

        System.out.println(productA.getSalesPrice(5));
        System.out.println(productA.getSalesPrice(3));
        System.out.println(productA.getSalesPrice(1));


        OrderItem item1 = new OrderItem(5, productA);
        OrderItem item2 = new OrderItem(3, productB);
        OrderItem item3 = new OrderItem(1, productC);

        addItemToOrder(item1);
        addItemToOrder(item2);
        addItemToOrder(item3);

        printOrder();
    }

    public static void addItemToOrder(OrderItem item){
        order.add(item);
    }
    public static void printOrder(){
        for (OrderItem i: order){
            i.getProduct().showDetails();
        }
    }
}
