package bai3;

import bai2.QLTL;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager PM = new ProductManager(scanner);
        Product p1 = new Product(10000L,"bla",150000.6,123,new Category("Dien tu"));
        Product p2 = new Product(12000L,"ble",150000.7,234,new Category("Dien lanh"));
        Product p3 = new Product(13000L,"blu",250000.8,345,new Category("Dien tu"));
        PM.addP(p1);
        PM.addP(p2);
        PM.addP(p3);
        Long id;
        int choice;
        do {
            System.out.println("MENU");
            System.out.println("1. Create product");
            System.out.println("2. Update product by id");
            System.out.println("3. Delete product by id");
            System.out.println("4. Display product by id");
            System.out.println("5. Display list product");
            System.out.println("6. Display product by category");
            System.out.println("7. Total price");
            System.out.println("8. Display product by price more than 100000");
            System.out.println("9. Display product by price more than 200000 and category is \"Dien tu\"");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    PM.addProduct();
                    break;
                case 2:
                    System.out.println("Enter id : ");
                    id = Long.parseLong(scanner.nextLine());
                    PM.updateProduct(id);
                    break;
                case 3:
                    System.out.println("Enter id : ");
                    id = Long.parseLong(scanner.nextLine());
                    PM.deleteProduct(id);
                    break;
                case 4:
                    System.out.println("Enter id : ");
                    id = Long.parseLong(scanner.nextLine());
                    PM.displayProduct(id);
                    break;
                case 5:
                    PM.displayListProduct();
                    break;
                case 6:
                    System.out.println("Enter category : ");
                    String c = scanner.nextLine();
                    PM.displayProductCategory(c);
                    break;
                case 7:
                    PM.sumPriceProduct();
                    break;
                case 8:
                    PM.moreThan100000();
                    break;
                case 9:
                    PM.moreThan200000DienTu();
                    break;
            }
        } while (choice != 0);
    }
}
