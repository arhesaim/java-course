package pr6;

public class Product_A extends ProductsForSale{

    public Product_A(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(this.type + " " + this.description + " " + this.price);
    }
}
