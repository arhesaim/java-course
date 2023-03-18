package pr3;

public class DeluxeBurger extends Hamburger {
    private String drink = "drink", chips = "chips";
    private double drinkPrice = 1.81, chipsPrice = 2.75, price;

    public DeluxeBurger(String name, String breadRollType, String meat, double price) {
        super(name, breadRollType, meat, price);
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price + drinkPrice + chipsPrice;
        //System.out.printf("%s burger with %s roll, %s, price is %.2f\n", name, breadRollType, meat, this.price);
    }

    @Override
    public void addHamburgerAddition1(String name, double price){
        System.out.println("Added chips for an extra 2.75\n added Drink for an extra 1.81\n no additional items can be added to a deluxe burger\n");
    }
    @Override
    public void addHamburgerAddition2(String name, double price){
        System.out.println("Added chips for an extra 2.75\n added Drink for an extra 1.81\nno additional items can be added to a deluxe burger\n");
    }
    @Override
    public void addHamburgerAddition3(String name, double price){
        System.out.println("Added chips for an extra 2.75\n added Drink for an extra 1.81\nno additional items can be added to a deluxe burger\n");
    }
    @Override
    public void addHamburgerAddition4(String name, double price){
        System.out.println("Added chips for an extra 2.75\n added Drink for an extra 1.81\nno additional items can be added to a deluxe burger\n");
    }

    @Override
    public double itemizeHamburger(){
        //System.out.printf("%s burger with %s, %s, price is %f\n", this.name,this.drink, this.chips, this.price + this.chipsPrice + this.drinkPrice);
        return this.price;
    }

}
