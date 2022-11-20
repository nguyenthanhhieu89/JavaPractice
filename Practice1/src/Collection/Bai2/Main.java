package Collection.Bai2;

import Collection.Service.ProductService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        // in ra cai menu
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            printMenu();
            option = scanner.nextInt();
            switch (option) {
                case 1: {
                    doInsertProduct(productService);
                    break;
                }
                case 2: {
                    doSearchProductById(productService);
                    break;
                }
                case 3:
                {
                    doUpdateQuantity(productService);
                    break;
                }
                case 4:
                {
                    doDeleteProduct(productService);
                    break;
                }
                case 5:
                {
                    doSortByQuantity(productService);
                    break;
                }
                case 6:
                {
                    doSortByName(productService);
                    break;
                }
                case 7:
                default:
                    System.exit(0);
                    break;

            }
        } while (true);
    }

    private static void doSortByName(ProductService productService) {
        productService.sortByName();
    }

    private static void doSortByQuantity(ProductService productService) {
        productService.sortByTotalQuantity();
    }

    private static void doDeleteProduct(ProductService productService) {
        System.out.println("Nhap san pham can xoa");
        String productId = new Scanner(System.in).nextLine();
        productService.deleteProduct(productId);
    }

    private static void doUpdateQuantity(ProductService productService) {
        System.out.println("Nhap ma san pham can update:");
        String productId = new Scanner(System.in).nextLine();
        System.out.println("Nhap so luong thay doi:");
        int changeQuantity = new Scanner(System.in).nextInt();
        productService.updateProduct(productId, changeQuantity);
    }

    private static void doSearchProductById(ProductService productService) {
        System.out.println("Nhap ma san pham can tim kiem:");
        String productId = new Scanner(System.in).nextLine();
        Product product = productService.findProduct(productId);
        if (product == null) {
            System.out.println("San pham khong ton tai!");
        } else {
            System.out.println(product);
        }
    }

    private static void doInsertProduct(ProductService productService) {
        // Input thong tin san pham
        System.out.println("Nhap thong tin san pham!");
        System.out.println("Nhap ma san pham:");
        String productId = new Scanner(System.in).nextLine();
        System.out.println("Nhap ten san pham:");
        String productName = new Scanner(System.in).nextLine();
        System.out.println("Nhap so luong san pham:");
        int quantity = new Scanner(System.in).nextInt();
        Product product = new Product(productId, productName, quantity);

        // Call service to update
        productService.insertProduct(product);
    }

    public static void printMenu() {
        System.out.println("\n\nMenu:");
        System.out.println("1. Them 1 san pham vao kho");
        System.out.println("2. Tim kiem san pham");
        System.out.println("3. Cap nhat so luong san pham");
        System.out.println("4. Xoa san pham");
        System.out.println("5. In ra danh sach theo so luong");
        System.out.println("6. In ra danh sach theo ten");
        System.out.println("7. Quit");
        System.out.println("Lua chon: \n");
    }
}
