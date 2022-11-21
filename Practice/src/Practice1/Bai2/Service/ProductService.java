package Practice1.Bai2.Service;

import Practice1.Bai2.Product;

import java.util.*;

public class ProductService {
    // Save data
    private final Map<String, Product> productMap = new HashMap<>();

    // Insert product
    public void insertProduct(Product productInput) {
        // Kiem tra input
        if (productInput == null) {
            System.out.println("Input err!");
            return;
        }

        // Product Input OK
        Product product = productMap.get(productInput.getProductId());
        if (product == null) {
            // Khong ton tai trong Map
            productMap.put(productInput.getProductId(), productInput);
        } else {
            System.out.println("San pham da ton tai");
        }
    }

    // Tim kiem san pham trong Map
    public Product findProduct(String productId) {
        // Check input
        if (productId == null) {
            productId = "";
        }

        // Tim kiem san pham trong DB
        return productMap.get(productId);
    }

    // Update Product
    public void updateProduct(String productId, int changeQuantity) {
        /// Check input
        if (productId == null) {
            productId = "";
        }
        /// Update

        // Tim kiem san pham
        Product product = productMap.get(productId);
        if (product == null) {
            System.out.println("Khong tim thay san pham can update!");
        } else {
            // Tim thay san pham
            int tempQuantity = product.getTotalQuantity() + changeQuantity;

            // Kiem tra neu so luong tempQuantity < 0
            if (tempQuantity < 0) {
                // Khong du hang trong kho
                System.out.println("Khong du hang trong kho de update");
            } else {
                // Thay doi lai so luong san pham trong kho
                product.setTotalQuantity(tempQuantity);

                // Update database
                productMap.put(productId, product);
            }
        }
    }

    public void deleteProduct(String productId) {
        // Check input
        if (productId == null) {
            productId = "";
        }

        // Remove by productId
        productMap.remove(productId);
    }

    public void sortByTotalQuantity() {
        List<Product> productList = new ArrayList<>(productMap.values());
        productList.sort(Comparator.comparing(Product::getTotalQuantity));
        System.out.println(productList);
    }

    public void sortByName() {
        List<Product> productList = new ArrayList<>(productMap.values());
        productList.sort(Comparator.comparing(Product::getProductName));
        System.out.println(productList);
    }

}
