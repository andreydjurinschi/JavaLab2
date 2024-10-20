public class Product {
    private final String  productName;
    private final double price;
    private final double minPrice;
    private final double maxPrice;

    //get set product name
    public String getProductName() {
        return productName;
    }

    //get set price
    public double getPrice() {
        return price;
    }

    //get set min price
    public double getMinPrice() {
        return minPrice;
    }

    //get set max price
    public double getMaxPrice() {
        return maxPrice;
    }

    public Product(String productName, double price, double minPrice, double maxPrice) {
        this.productName = productName;
        this.price = price;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    public void ValidatePrice(double price)
            throws IncorrectPriceException {
        if (price < minPrice || price > maxPrice) {
            throw new IncorrectPriceException("Цена товара: " + productName + " не соответствует его диапазону: от " +
                    minPrice + " до " + maxPrice + ". Введенная цена: " + price);
        }


    }
}