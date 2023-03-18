package pr3;

public class HealthyBurger extends Hamburger{
    private String meat, healthyExtra1Name, healthyExtra2Name;
    double price, healthyExtra1Price, healthyExtra2Price;

    public HealthyBurger(String name, String breadRollType, String meat, double price) {
        super(name, breadRollType, meat, price);
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        //System.out.printf("%s burger with %s roll, %s, price is %f\n", name, this.breadRollType, this.meat, this.price);
    }

    public void addHealthyAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
        this.price += price;
        System.out.printf("added %s for an extra %.2f\n", this.healthyExtra1Name, this.healthyExtra1Price);
    }

    public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
        this.price += price;
        System.out.printf("added %s for an extra %f\n", this.healthyExtra2Name, this.healthyExtra2Price);
    }
    @Override
    public void addHamburgerAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
        this.price += price;
        System.out.printf("added %s for an extra %.2f\n", this.addition1Name, this.addition1Price);
    }
    @Override
    public void addHamburgerAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
        this.price += price;
        System.out.printf("added %s for an extra %.2f\n", this.addition2Name, this.addition2Price);
    }
    @Override
    public void addHamburgerAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
        this.price += price;
        System.out.printf("added %s for an extra %.2f\n", this.addition3Name, this.addition3Price);
    }
    @Override
    public void addHamburgerAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
        this.price += price;
        System.out.printf("added %s for an extra %.2f\n", this.addition4Name, this.addition4Price);
    }
    @Override
    public double itemizeHamburger(){
        //System.out.printf("%s burger with %s, %s, price is %f\n", this.name,this.healthyExtra1Name, this.healthyExtra2Name, this.price);
        return this.price;
    }

}
