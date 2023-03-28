package pr6;

public class OrderItem {
    private int qty;
    private ProductsForSale product;

    public OrderItem(int qty, ProductsForSale product) {
        this.qty = qty;
        this.product = product;
    }

    public int getQty() {
        return qty;
    }

    public ProductsForSale getProduct() {
        return product;
    }

}
