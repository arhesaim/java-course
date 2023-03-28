package pr6;

public class Product_C extends ProductsForSale{
    public Product_C(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(this.type + " " + this.description + " " + this.price);
    }
}
