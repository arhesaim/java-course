package pr6;

public class Product_B extends ProductsForSale{
    public Product_B(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(this.type + " " + this.description + " " + this.price);
    }
}
