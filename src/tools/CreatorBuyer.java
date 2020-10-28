
package tools;

import entity.Buyer;
import java.util.Scanner;

public class CreatorBuyer {

      private Scanner scanner = new Scanner(System.in);
      public Buyer getBuyer() {
        Buyer buyer = new Buyer();
        System.out.println("--- Добавить покупателя ---");
        System.out.print("Введите имя: ");
        buyer.setFirstname(scanner.nextLine());
        System.out.print("Введите фамилию: ");
        buyer.setLastname(scanner.nextLine());
        System.out.print("Введите телефон: ");
        buyer.setPhone(scanner.nextLine());
        System.out.print("Введите сумму, которой распологает покупатель: ");
        buyer.setWallet(scanner.nextLine());
        return buyer;
    }
    
}
