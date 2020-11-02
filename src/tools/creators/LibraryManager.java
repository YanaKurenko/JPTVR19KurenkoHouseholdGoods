/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.creators;

import entity.Buyer;
import entity.History;
import entity.Product;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class LibraryManager {
    private Scanner scanner = new Scanner(System.in);
    private BuyerManager buyerManager = new BuyerManager();
    private ProductManager productManager = new ProductManager();
    public History takeOnProduct(Product[] products, Buyer[] buyers) {
        History history = new History();

        System.out.println("--- Список покупателей ---");
        buyerManager.printListBuyers(buyers);
        System.out.print("Выберите номер покупателя: ");
        int buyerNumber = scanner.nextInt();
        scanner.nextLine();
        Buyer buyer = buyers[buyerNumber-1];
        history.setBuyer(buyer);
        productManager.printListProducts(products);
        System.out.print("Выберите номер продукта: ");
        int productNumber = scanner.nextInt();
        scanner.nextLine();
        Product product = products[productNumber-1];
        history.setProduct(product);
        System.out.println("Куплен товар: "+product.getName()+buyer.getFirstname());
        return history;
    }
        public void addHistoryToArray(History history, History[] histories) {
        for (int i = 0; i < histories.length; i++) {
            if (histories[i] == null) {
                histories[i] = history;
                break;
            }
        }
    }
            private void printHistory(History history) {
        System.out.printf("Товар \"%s\" купил(-а) %s %s%n"
                ,history.getProduct().getName()
                ,history.getBuyer().getFirstname()
                ,history.getBuyer().getLastname()
        );
    }

}

