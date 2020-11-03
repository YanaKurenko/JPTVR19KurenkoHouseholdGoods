
package jptvr19kurenkohouseholdgoods;


import entity.Buyer;
import entity.History;
import entity.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import tools.creators.BuyerManager;
import tools.creators.LibraryManager;
import tools.creators.ProductManager;
import tools.savers.BuyerSaver;
import tools.savers.HistorySaver;
import tools.savers.ProductSaver;

class App {
    private List<Product> listProducts = new ArrayList<>();
    private List<Buyer> listBuyers = new ArrayList<>();
    private List<History> listHistories = new ArrayList<>();
    private ProductManager productManager = new ProductManager();
    private ProductSaver productSaver = new ProductSaver();
    private BuyerManager buyerManager = new BuyerManager();
    private BuyerSaver buyerSaver = new BuyerSaver();
    private LibraryManager libraryManager = new LibraryManager();
    private HistorySaver historySaver = new HistorySaver();

    public  App() {
        listProducts = productSaver.loadProducts();
        listBuyers = buyerSaver.loadBuyers();
        listHistories = historySaver.loadHistories();
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
                    productManager.addProductToArray(product,listProducts);
                    productSaver.saveProducts(listProducts);
                    
                    break;
                case "2":
                    System.out.println("--- Список товаров ---");
                    productManager.printListProducts(listProducts);
                    break;
                case "3":
                    System.out.println("--- Добавить покупателя ---");
                    Buyer buyer = buyerManager.createBuyer();
                    buyerManager.addBuyerToArray(buyer,listBuyers);
                    buyerSaver.saveBuyers(listBuyers);
                    break;
                case "4":
                    System.out.println("--- Список покупателей ---");
                    buyerManager.printListBuyers(listBuyers);
                    break;
                case "5":
                    System.out.println("--- Купить товар ---");
                    History history = libraryManager.takeOnProduct(listProducts, listBuyers);
                    libraryManager.addHistoryToArray(history,listHistories);
                    historySaver.saveHistories(listHistories);
                    break;
                default:
                    System.out.println("Нет такой задачи.");
            }
        }while(repeat);
    }
}