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
        String[] productNames;
        double price;
        double minPrice;
        double maxPrice;

        System.out.print("Введите желаемое кол-во товаров: ");
        int numOfProducts = scanner.nextInt();
        productNames = new String[numOfProducts];


    }
}


