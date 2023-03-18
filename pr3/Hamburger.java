package pr3;

public class Hamburger {
    public String name, breadRollType, meat, addition1Name, addition2Name, addition3Name, addition4Name;
    public double price, addition1Price, addition2Price, addition3Price, addition4Price;

    public Hamburger(String name, String breadRollType, String meat, double price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
        System.out.printf("%s burger with %s roll, %s, price is %.2f\n", this.name, this.breadRollType, this.meat, this.price);
    }

    public void addHamburgerAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
        this.price += price;
        System.out.printf("added %s for an extra %.2f\n", this.addition1Name, this.addition1Price);
    }
    public void addHamburgerAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
        this.price += price;
        System.out.printf("added %s for an extra %.2f\n", this.addition2Name, this.addition2Price);
    }
    public void addHamburgerAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
        this.price += price;
        System.out.printf("added %s for an extra %.2f\n", this.addition3Name, this.addition3Price);
    }
    public void addHamburgerAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
        this.price += price;
        System.out.printf("added %s for an extra %.2f\n", this.addition4Name, this.addition4Price);
    }
    public double itemizeHamburger(){
        //System.out.printf("%s burger with %s, %s, %s, %s, price is %f\n", this.name, this.addition1Name, this.addition2Name, this.addition3Name, this.addition4Name, this.price);
        return this.price;
    }
}
