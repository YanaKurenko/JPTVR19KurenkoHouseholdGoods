
package entity;
public class History {
    private Product product;
    private Buyer buyer;


    public History() {
    }    
        public History(Product product, Buyer buyer) {
        this.product = product;
        this.buyer = buyer;
        }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }
    @Override
    public String toString() {
        return "History{" 
                + "product=" + product.getName()
                + ", buyer=" + buyer.getLastname()
                + '}';
    }    
}
