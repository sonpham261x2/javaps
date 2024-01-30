package bai2;

import java.util.Arrays;
import java.util.Scanner;

public class QLTL {
    public TaiLieu[] dstl ;

    public int soLuong=0;
    private Scanner sc;

    public QLTL(Scanner sc){
        super();
        dstl = new TaiLieu[0];
        this.sc = sc;
    }

    public void themTL(int them){
        TaiLieu[] newdstl = Arrays.copyOf(dstl,dstl.length+1);
        newdstl[soLuong]=taoTL(them);
        dstl=newdstl;
        soLuong++;
    }

    private TaiLieu taoTL(int them){
        TaiLieu tl;
        System.out.print("Nhập mã tài liệu : ");
        String maTaiLieu = sc.nextLine();
        System.out.print("Nhập tên nhà xuất bản : ");
        String tenNhaXuatBan = sc.nextLine();
        System.out.print("Nhập số bản phát hành : ");
        int soBanPhatHanh =Integer.parseInt(sc.nextLine());
        if (them == 1) {
            System.out.print("Nhập tên tác giả : ");
            String tenTacGia = sc.nextLine();
            System.out.print("Nhập số trang : ");
            int soTrang = Integer.parseInt(sc.nextLine());
            tl = new Sach(maTaiLieu,tenNhaXuatBan,soBanPhatHanh,tenTacGia,soTrang);
        } else if (them == 2) {
            System.out.print("Nhập số phát hành : ");
            int soPhatHanh =Integer.parseInt(sc.nextLine());
            System.out.print("Nhập tháng phát hành : ");
            int thangPhatHanh = Integer.parseInt(sc.nextLine());
            tl = new TapChi(maTaiLieu,tenNhaXuatBan,soBanPhatHanh,soPhatHanh,thangPhatHanh);
        } else {
            System.out.print("Nhập ngày phát hành : ");
            String ngayPhatHanh = sc.nextLine();
            tl = new Bao(maTaiLieu,tenNhaXuatBan,soBanPhatHanh,ngayPhatHanh);
        }
        return tl;
    }
//    private String chonGioiTinh() {
//        System.out.println("Chọn giới tính: ");
//        System.out.println("1. Nam");
//        System.out.println("2. Nữ");
//        System.out.println("3. Khác");
//        System.out.println("Nhập lựa chọn: ");
//        int choiceGender = Integer.parseInt(sc.nextLine());
//        if (choiceGender == 1) {
//            return "Nam";
//        } else if (choiceGender == 2) {
//            return "Nữ";
//        } else {
//            return "Khác";
//        }
//    }

    public void timKiemTL (){
        boolean kiemTra = false;
        System.out.println("Chọn loại tài liệu cần tìm : ");
        System.out.println("1. Sách");
        System.out.println("2. Tạp chí");
        System.out.println("3. Báo");
        System.out.println("Nhập lựa chọn: ");
        int choiceGender = Integer.parseInt(sc.nextLine());
        if (choiceGender == 1) {
            for (TaiLieu tl : dstl){
                if(tl instanceof Sach){
                    if (tl != null) {
                        System.out.println(tl.toString());
                    }
                }
            }
            if(kiemTra) System.out.println("Không có sách trong dữ liệu !");
        } else if (choiceGender == 2) {
            for (TaiLieu tl : dstl){
                if(tl instanceof TapChi){
                    if (tl != null) {
                        System.out.println(tl.toString());
                    }
                }
            }
            if(kiemTra) System.out.println("Không có tạp chí trong dữ liệu !");
        } else {
            for (TaiLieu tl : dstl){
                if(tl instanceof Bao){
                    if (tl != null) {
                        System.out.println(tl.toString());
                    }
                }
            }
            if(kiemTra) System.out.println("Không có báo trong dữ liệu !");
        }
    }

    public boolean xoaTaiLieu(){
        String maTaiLieu;
        boolean kiemTra =false;
        int layViTri= dstl.length;
        do{
            System.out.print("Nhập mã tài liệu muốn xóa : ");
            maTaiLieu = sc.nextLine();;
            for (TaiLieu tl : dstl){
                if (tl.getMaTaiLieu().equals(maTaiLieu)){
                    kiemTra=true;
                }
            }
            if(kiemTra){
                TaiLieu[] newdstl = new TaiLieu[dstl.length-1];
                for (int i =0 ; i<dstl.length-1;i++){
                    if(dstl[i].getMaTaiLieu().equals(maTaiLieu)){
                        layViTri = i;
                    }
                    if (i>=layViTri){
                        newdstl[i]=dstl[i+1];
                    }
                    else newdstl[i]=dstl[i];
                }
                dstl = newdstl;
            }
            else System.out.println("Mã tài liệu không tồn tại !");
        }while (!kiemTra);
        return true;
    }



    public void hienThiDanhSach() {
        for (TaiLieu tl : dstl) {
            if (tl != null) {
                System.out.println(tl.toString());
            }
        }
    }


}
