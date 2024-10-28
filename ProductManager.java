import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private final List<Product> products = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public void addProductToList(String name, double minPrice, double maxPrice) {
        products.add(new Product(name, minPrice, maxPrice));
    }

    public Product createProduct() {
        System.out.println("Введите название продукта: ");
        String name = scanner.nextLine();
        System.out.println("Введите минимальную цену продукта: ");
        double minPrice = scanner.nextDouble();
        System.out.println("Введите максимальную цену продукта: ");
        double maxPrice = scanner.nextDouble();
        scanner.nextLine();
        return new Product(name, minPrice, maxPrice);
    }

    public void createAndAdd() {
        System.out.print("Введите количество продуктов: ");
        int numOfProducts = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numOfProducts; i++) {
            System.out.println("Продукт " + (i + 1) + ":");
            Product product = createProduct();
            addProductToList(product.getProductName(), product.getMinPrice(), product.getMaxPrice());
            System.out.println("Продукт " + product.getProductName() + " создан");

        }
    }
    public void priceChecker(){
        for(Product product : products){
            boolean valid = true;
            while (valid) {
                try {
                    System.out.println("Введите цену для проверки для " + product.getProductName() + ":");
                    double price = scanner.nextDouble();
                    product.validatePrice(price);
                    valid = false;
                } catch (IncorrectPriceException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }
            }
        }
    }
    public void printList(){
        for (Product product: products){
            System.out.println("Название продукта: " + product.getProductName() +
                    ", минимальная цена: " + product.getMinPrice() +
                    ", максимальная цена:  " + product.getMaxPrice() +
                    ", фактическая цена: " + product.getPrice());
        }
    }

}
