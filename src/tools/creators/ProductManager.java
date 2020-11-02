
package tools.creators;

import entity.Product;
import java.util.Scanner;

public class ProductManager {
        private Scanner scanner = new Scanner(System.in);
    public Product createProduct() {
        Product product = new Product();
        System.out.print("Введите имя товара: ");
        product.setName(scanner.nextLine());
        System.out.print("Введите цену товара: ");
        product.setPrice(scanner.nextLine());
        System.out.print("Введите кол-во товаров: ");
        product.setQuantity(scanner.nextLine());
        System.out.println("Создан товар: "+product.getName());
        return product;
    
    }
        public void addProductToArray(Product product, Product[] products) {
        for (int i = 0; i < products.length; i++) {
            if(products[i] == null){
                products[i] = product;
                break;
            }
        }
    }
        public void printListProducts(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            if(products[i] != null){
                System.out.println(i+1+". " + products[i].toString());
            }
        }   
    }
}
