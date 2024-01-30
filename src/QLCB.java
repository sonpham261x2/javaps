import java.util.Arrays;
import java.util.Scanner;

public class QLCB {
    public CanBo[] dscb ;
    public int soLuong=0;
    private Scanner sc;

    public QLCB() {
//
//        dscb=new CanBo[];
    }

    public QLCB(Scanner sc){
        super();
        dscb = new CanBo[0];
        this.sc = sc;
    }

    public void themCB(int them){
        CanBo[] newdscb = Arrays.copyOf(dscb,dscb.length+1);
        newdscb[soLuong]=taoCB(them);
        dscb=newdscb;
        soLuong++;
    }

    private CanBo taoCB(int them){
        CanBo cb;
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = Integer.parseInt(sc.nextLine());
        String gender = chonGioiTinh();
        System.out.println("Nhập địa chỉ: ");
        String address = sc.nextLine();
        if (them == 1) {
            System.out.println("Nhập ngành đào tạo: ");
            String special = sc.nextLine();
            cb = new KySu(name, age, gender, address, special);
        } else if (them == 2) {
            System.out.println("Nhập bậc: ");
            String bac = sc.nextLine();
            cb = new CongNhan(name, age, gender, address, bac);
        } else {
            System.out.println("Nhập công việc: ");
            String work = sc.nextLine();
            cb = new NhanVien(name, age, gender, address, work);
        }
        return cb;
    }
    private String chonGioiTinh() {
        System.out.println("Chọn giới tính: ");
        System.out.println("1. Nam");
        System.out.println("2. Nữ");
        System.out.println("3. Khác");
        System.out.println("Nhập lựa chọn: ");
        int choiceGender = Integer.parseInt(sc.nextLine());
        if (choiceGender == 1) {
            return "Nam";
        } else if (choiceGender == 2) {
            return "Nữ";
        } else {
            return "Khác";
        }
    }

    public void timKiemCB (String ten){
        for (CanBo cb : dscb){
            if (cb.getHoTen().equals(ten)){
                System.out.println(cb.toString());
            }
        }
    }

    public CanBo[] getDscb() {
        return dscb;
    }

    public void hienThiDanhSach() {
        for (CanBo cb : dscb) {
            if (cb != null) {
                System.out.println(cb.toString());
            }
        }
    }

    public void setDscb(CanBo[] dscb) {
        this.dscb = dscb;
    }
}
