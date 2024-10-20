/*4. Лабораторная работа №2. Создание и обработка собственных исключений.
В программе требуется:
·Создать собственное исключение (class).
·Создать метод (throw), который может возбуждать это исключение(throws).
·Написать метод, перехватывающий и обрабатывающий исключение (try-catch), возбуждаемое другим методом.
Исключение: с консоли вводится наименование товара и его цена, данные записываются в массивы. В программе имеется информация о товаре и о диапазоне цен на данный товар. Добиться ввода только цен в диапазоне, допустимом для соответствующего товара.*/

import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Введите название продукта: ");
            String name = scanner.nextLine();
            System.out.println("Введите цену продукта: ");
            double price = scanner.nextDouble();
            System.out.println("Введите мин цену продукта: ");
            double minPrice = scanner.nextDouble();
            System.out.println("Введите макс цену продукта: ");
            double maxPrice = scanner.nextDouble();
            Product product = new Product(name, price, minPrice, maxPrice);

        try {
            System.out.println("Введите цену на проверку для продукта " + product.getProductName());
            double CheckPrice = scanner.nextDouble();
            product.ValidatePrice(CheckPrice);
            System.out.print("Цены введены в корректном диапазоне");
        } catch (IncorrectPriceException e) {
            System.out.println(e.getMessage());
        }
    }
}


