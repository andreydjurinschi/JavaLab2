public class IncorrectPriceException extends Exception{
    public IncorrectPriceException(String message) {
        super(message);
    }

    public static void ValidatePrice(String productName, double price, double minPrice, double maxPrice )
    throws IncorrectPriceException
    {
        if (price < minPrice || price > maxPrice) {
            throw new IncorrectPriceException("Цена товара: " + productName + " не соответствует его диапазону: от " +
                    minPrice + "до" + maxPrice + ". Введенная цена: " + price);
        }
    }
}
