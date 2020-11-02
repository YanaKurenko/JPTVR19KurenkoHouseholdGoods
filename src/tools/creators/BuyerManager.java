
package tools.creators;

import entity.Buyer;
import java.util.Scanner;

public class BuyerManager {

      private Scanner scanner = new Scanner(System.in);
      public Buyer createBuyer() {
        Buyer buyer = new Buyer();
        System.out.print("Введите имя: ");
        buyer.setFirstname(scanner.nextLine());
        System.out.print("Введите фамилию: ");
        buyer.setLastname(scanner.nextLine());
        System.out.print("Введите телефон: ");
        buyer.setPhone(scanner.nextLine());
        System.out.print("Введите сумму, которой распологает покупатель: ");
        buyer.setWallet(scanner.nextLine());
        this.printBuyer(buyer);
        return buyer;
    }
    public void addBuyerToArray(Buyer buyer, Buyer[] buyers) {
        for (int i = 0; i < buyers.length; i++) {
            if(buyers[i] == null){
                buyers[i] = buyer;
                break;
            }
        }
    }

    public void printBuyer(Buyer buyer) {
        System.out.println("Имя покупателя: "
                +buyer.getFirstname()
                +" "
                + buyer.getLastname()
        );
    }

    public void printListBuyers(Buyer[] buyers) {
        for (int i = 0; i < buyers.length; i++) {
            if(buyers[i] != null){
                System.out.println(i+1+". " + buyers[i].toString());
            }
        }
    }
}
