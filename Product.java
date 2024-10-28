public class Product {
    private final String productName;
    private final double minPrice;
    private final double maxPrice;
    private double price;

    public Product(String productName, double minPrice, double maxPrice) {
        this.productName = productName;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    public String getProductName() {
        return productName;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public double getPrice() {
        return price;
    }


    public void validatePrice(double userPrice) throws IncorrectPriceException {
        if (userPrice < minPrice) {
            throw new IncorrectPriceException("Ваша цена ниже допустимого диапазона");
        } else if (userPrice > maxPrice) {
            throw new IncorrectPriceException("Ваша цена выше допустимого диапазона");
        }else{
            System.out.println("Цена " + userPrice + " для продукта " + this.getProductName() + " находится в допустимом диапазоне.");
            this.price = userPrice;
        }
    }
}
