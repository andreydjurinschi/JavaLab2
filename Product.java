import java.util.List;

public class Product {
    private final String  productName;
    private final double minPrice;
    private final double maxPrice;

    //get product name
    public String getProductName() {
        return productName;
    }

    //get min price
    public double getMinPrice() {
        return minPrice;
    }

    //get max price
    public double getMaxPrice() {
        return maxPrice;
    }

    public Product(String productName, double minPrice, double maxPrice) {
        this.productName = productName;

        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }


    public void ValidatePrice(double userPrice) throws IncorrectPriceException {
        if (userPrice < minPrice || userPrice > maxPrice) {
            throw new IncorrectPriceException("Цена продукта " + productName + "не находится в верном диапазоне...");
        }
    }
}