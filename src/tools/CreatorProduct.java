
package tools;

import entity.Product;
import java.util.Scanner;

public class CreatorProduct {
        private Scanner scanner = new Scanner(System.in);
    public Product getProduct() {
        Product product = new Product();
        System.out.println("--- Добавление товара ---");
        System.out.print("Введите имя товара: ");
        product.setName(scanner.nextLine());
        System.out.print("Введите цену товара: ");
        product.setPrice(scanner.nextLine());
        System.out.print("Введите кол-во товаров: ");
        product.setQuantity(scanner.nextLine());
        scanner.nextLine();
        return product;
    
    }
    
}
