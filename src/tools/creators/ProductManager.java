
package tools.creators;

import entity.Product;
import java.util.List;
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
        public void addProductToArray(Product product,  List<Product> listProducts) {
            listProducts.add(product);
    }
        public void printListProducts( List<Product> listProducts) {
        for (int i = 0; i < listProducts.size(); i++) {
            if(listProducts.get(i) != null){
                System.out.println(i+1+". " + listProducts.get(i).toString());
            }
        }  
    }
}

