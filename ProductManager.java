/*4. Лабораторная работа №2. Создание и обработка собственных исключений.
В программе требуется:
·Создать собственное исключение (class).
·Создать метод (throw), который может возбуждать это исключение(throws).
·Написать метод, перехватывающий и обрабатывающий исключение (try-catch), возбуждаемое другим методом.
Исключение: с консоли вводится наименование товара и его цена, данные записываются в массивы. В программе имеется информация о товаре и о диапазоне цен на данный товар. Добиться ввода только цен в диапазоне, допустимом для соответствующего товара.*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class ProductManager {
    private final List<Product> products = new ArrayList<>();
    private final List<Double> prices = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addProduct(String name, double minPrice, double maxPrice){
        products.add(new Product(name,minPrice, maxPrice));
    }

    public void priceChecker() throws IncorrectPriceException{
        try {
            System.out.println("Введите название продукта: ");
            String name = scanner.nextLine();
            System.out.println("Введите цену продукта: ");
            double price = scanner.nextDouble();
            System.out.println("Введите минимальную цену продукта: ");
            double minPrice = scanner.nextDouble();
            System.out.println("Введите максимальную цену продукта: ");
            double maxPrice = scanner.nextDouble();
            Product product = new Product(name, minPrice, maxPrice);
        } catch (IncorrectPriceException e) {
            e.getMessage();
        }
    }


    public static void main(String[] args) {

    }
}


