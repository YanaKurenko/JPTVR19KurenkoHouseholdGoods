
package jptvr19kurenkohouseholdgoods;


import entity.Buyer;
import entity.Product;
import java.util.Scanner;
import tools.CreatorBuyer;
import tools.CreatorProduct;
import tools.ProductSaver;

class App {
    private Product[] products = new Product[10];
    private Buyer[] buyers = new Buyer[10];
    public void run(){
        boolean repeat = true;
        System.out.println("--- Магазин Хозяйственных Товаров ---");
        do{
            System.out.println("Задачи: ");
            System.out.println("0. Выйти из программы");
            System.out.println("1. Добавить новый товар");
            System.out.println("2. Список товаров");
            System.out.println("3. Добавить покупателя");
            System.out.println("4. Список покупателей");
            System.out.println("5. Покупателю купить товар ");
            System.out.print("Выберите задачу: ");
            Scanner scanner = new Scanner(System.in);
            String task = scanner.nextLine();
            switch (task) {
                case "0":
                    System.out.println("--- конец программы ---");
                    repeat = false;
                    break;
                case "1":
                    System.out.println("--- Добавить новый товар ---");
                    CreatorProduct creatorProduct = new CreatorProduct();
                    Product product = creatorProduct.getProduct();
                    for (int i = 0; i < products.length; i++) {
                        if(products[i] == null){
                            products[i] = product;
                    break;
                        }
                    }
                    ProductSaver productSaver = new ProductSaver();
                    productSaver.saveProduct(products);
                    System.out.println("Товар создан: "+product.getName());
                    break;
                case "2":
                    System.out.println("--- Список товаров ---");
                    for (int i = 0; i < products.length; i++) {
                        if(products[i] != null){
                            System.out.println(i+1+". " + products[i].toString());
                        }
                    }
                    break;
                case "3":
                    System.out.println("--- Добавить покупателя ---");
                    CreatorBuyer creatorBuyer = new CreatorBuyer();
                    Buyer buyer = creatorBuyer.getBuyer();
                    System.out.println("Имя покупателя: "
                            +buyer.getFirstname()
                            +" "
                            + buyer.getLastname()
                    );
                    System.out.println(buyer.toString());
                    break;
                case "4":
                    System.out.println("--- Список покупателей ---");
                    break;
                case "5":
                    System.out.println("--- Купить товар ---");
                    break;
                default:
                    System.out.println("Нет такой задачи.");
            }
        }while(repeat);
    }
}