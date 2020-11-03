/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.creators;

import entity.Buyer;
import entity.History;
import entity.Product;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class LibraryManager {
    private Scanner scanner = new Scanner(System.in);
    private BuyerManager buyerManager = new BuyerManager();
    private ProductManager productManager = new ProductManager();
    public History takeOnProduct(List<Product> listProducts, List<Buyer> listBuyers) {
        History history = new History();

        System.out.println("--- Список покупателей ---");
        buyerManager.printListBuyers(listBuyers);
        System.out.print("Выберите номер покупателя: ");
        int buyerNumber = scanner.nextInt();
        scanner.nextLine();
        Buyer buyer = listBuyers.get(buyerNumber-1);
        history.setBuyer(buyer);
        productManager.printListProducts(listProducts);
        System.out.print("Выберите номер продукта: ");
        int productNumber = scanner.nextInt();
        scanner.nextLine();
        Product product = listProducts.get(productNumber-1);
        history.setProduct(product);
        System.out.println("Куплен товар: "+product.getName()+buyer.getFirstname());
        return history;
    }
        public void addHistoryToArray(History history,List<History> listHistories ) {
            listHistories.add(history);
    }
            private void printHistory(History history) {
        System.out.printf("Товар \"%s\" купил(-а) %s %s%n"
                ,history.getProduct().getName()
                ,history.getBuyer().getFirstname()
                ,history.getBuyer().getLastname()
        );
    }


}

