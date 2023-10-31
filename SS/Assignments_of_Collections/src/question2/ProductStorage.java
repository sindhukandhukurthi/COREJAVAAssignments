package question2;
import java.util.HashSet;

class Product {
    private int productId;
    private String productName;

    public Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    // Override hashCode and equals methods for proper comparison
    @Override
    public int hashCode() {
        return productId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Product otherProduct = (Product) obj;
        return productId == otherProduct.productId;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }
}

public class ProductStorage {
    public static void main(String[] args) {
        HashSet<Product> productSet = new HashSet<>();

        // Attempt to add 10 unique products
        addUniqueProduct(productSet, new Product(1, "Product A"));
        addUniqueProduct(productSet, new Product(2, "Product B"));
        addUniqueProduct(productSet, new Product(3, "Product C"));
        addUniqueProduct(productSet, new Product(4, "Product D"));
        addUniqueProduct(productSet, new Product(5, "Product E"));
        addUniqueProduct(productSet, new Product(6, "Product F"));
        addUniqueProduct(productSet, new Product(7, "Product G"));
        addUniqueProduct(productSet, new Product(8, "Product H"));
        addUniqueProduct(productSet, new Product(9, "Product I"));
        addUniqueProduct(productSet, new Product(10, "Product J"));

        // Attempt to add a duplicate product (Product A) - Silently rejected
        addUniqueProduct(productSet, new Product(1, "Product A"));

        // Print the unique products
        System.out.println("Unique Products:");
        for (Product product : productSet) {
            System.out.println("Product ID: " + product.getProductId() + ", Product Name: " + product.getProductName());
        }
    }

    public static void addUniqueProduct(HashSet<Product> productSet, Product product) {
        if (productSet.contains(product)) {
            System.out.println("Duplicate Product: " + product.getProductId() + " - " + product.getProductName() + " (Rejected)");
        } else {
            productSet.add(product);
        }
    }
}

