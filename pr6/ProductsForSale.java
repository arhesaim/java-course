package pr6;

abstract class ProductsForSale {
    String type;
    double price;
    String description;

    public ProductsForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    void printPricedItem(int qty){
        System.out.println(this.type + ": " + this.price*qty);
    }
    double getSalesPrice(int qty){
        return this.price*qty;
    }
    public abstract void showDetails();
}
