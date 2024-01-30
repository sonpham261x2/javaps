package bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QLTL qltl = new QLTL(scanner);
        int choice;
        do {
            System.out.println("MENU");
            System.out.println("1. Thêm tài liệu");
            System.out.println("2. Xóa tài liệu theo mã tài liệu");
            System.out.println("3. Hiển thị danh sách tài liệu");
            System.out.println("4. Tìm kiếm tài liệu theo loại");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Chọn loại tài liệu muốn tạo: ");
                    System.out.println("1. Sách");
                    System.out.println("2. Tạp chí");
                    System.out.println("3. Báo");
                    System.out.println("Nhập lựa chọn của bạn: ");
                    int choice1 = Integer.parseInt(scanner.nextLine());
                    qltl.themTL(choice1);
                    break;
                case 2:
                    if(qltl.xoaTaiLieu()) System.out.println("Xóa thành công !");
                    break;
                case 3:
                    qltl.hienThiDanhSach();
                    break;
                case 4:
                    qltl.timKiemTL();
                    break;
            }
        } while (choice != 0);
    }
}
