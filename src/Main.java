import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QLCB qlcb = new QLCB(scanner);
        int choice;
        do {
            System.out.println("MENU");
            System.out.println("1. Tạo mới cán bộ");
            System.out.println("2. Tìm kiếm cán bộ theo tên");
            System.out.println("3. Hiển thị danh sách cán bộ");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Chọn vị trí muốn tạo: ");
                    System.out.println("1. Kỹ sư");
                    System.out.println("2. Công nhân");
                    System.out.println("3. Nhân viên");
                    System.out.println("Nhập lựa chọn của bạn: ");
                    int choice1 = Integer.parseInt(scanner.nextLine());
                    qlcb.themCB(choice1);
                    break;
                case 2:
                    System.out.println("Nhap ten can bo can tim:    ");
                    String ten = scanner.nextLine();
                    qlcb.timKiemCB(ten);
                    break;
                case 3:
                    qlcb.hienThiDanhSach();
                    break;
            }
        } while (choice != 0);

    }
}
