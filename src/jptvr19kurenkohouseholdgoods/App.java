
package jptvr19kurenkohouseholdgoods;


import entity.Buyer;
import entity.History;
import entity.Product;
import java.util.Scanner;
import tools.creators.BuyerManager;
import tools.creators.LibraryManager;
import tools.creators.ProductManager;
import tools.savers.BuyerSaver;
import tools.savers.HistorySaver;
import tools.savers.ProductSaver;

class App {
    private Product[] products = new Product[10];
    private Buyer[] buyers = new Buyer[10];
    private History[] histories = new History[10];
    private ProductManager productManager = new ProductManager();
    private ProductSaver productSaver = new ProductSaver();
    private BuyerManager buyerManager = new BuyerManager();
    private BuyerSaver buyerSaver = new BuyerSaver();
    private LibraryManager libraryManager = new LibraryManager();
    private HistorySaver historySaver = new HistorySaver();
    public App() {
        products = productSaver.loadProducts();
        buyers = buyerSaver.loadBuyers();
        histories = historySaver.loadHistories();
    }
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
                    Product product = productManager.createProduct();
                    productManager.addProductToArray(product,products);
                    productSaver.saveProducts(products);
                    
                    break;
                case "2":
                    System.out.println("--- Список товаров ---");
                    productManager.printListProducts(products);
                    break;
                case "3":
                    System.out.println("--- Добавить покупателя ---");
                    Buyer buyer = buyerManager.createBuyer();
                    buyerManager.addBuyerToArray(buyer,buyers);
                    buyerSaver.saveBuyers(buyers);
                    break;
                case "4":
                    System.out.println("--- Список покупателей ---");
                    buyerManager.printListBuyers(buyers);
                    break;
                case "5":
                    System.out.println("--- Купить товар ---");
                    History history = libraryManager.takeOnProduct(products, buyers);
                    libraryManager.addHistoryToArray(history,histories);
                    historySaver.saveHistories(histories);
                    break;
                default:
                    System.out.println("Нет такой задачи.");
            }
        }while(repeat);
    }
}