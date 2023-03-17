package pr3;

public class Hamburger {
    public String name, breadRollType, meat;
    public double price;

    public Hamburger(String name, String breadRollType, String meat, double price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

    public void addHamburgerAddition1(String name, int price){
        this.price += price;
        System.out.printf("added %s for an extra %d", name, price);
    }
    public void addHamburgerAddition2(String name, int price){
        this.price += price;
        System.out.printf("added %s for an extra %d", name, price);
    }
    public void addHamburgerAddition3(String name, int price){
        this.price += price;
        System.out.printf("added %s for an extra %d", name, price);
    }
    public void addHamburgerAddition4(String name, int price){
        this.price += price;
        System.out.printf("added %s for an extra %d", name, price);
    }
    public double itemiseHamburger(){
        return this.price;
    }
}
