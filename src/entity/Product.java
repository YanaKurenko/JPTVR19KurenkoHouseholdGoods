
package entity;

import java.io.Serializable;

public class Product implements Serializable{
    private String name;
    private String price;
    private String quantity;
 
    public Product() {
    }
    public Product(String name, String price, String quantity){
        this.name = name;
        this.price = price; 
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return "Product{" 
                + "name=" + name 
                + ", price=" + price 
                + ", quantity=" + quantity
                + '}';
    }

    
}
