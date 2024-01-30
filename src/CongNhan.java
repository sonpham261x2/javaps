public class CongNhan extends CanBo{

    private String bac;


    public CongNhan(String hoTen, int tuoi, String gioiTinh, String diaChi,String bac) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.bac=bac;
    }
    public String getBac() {
        return bac;
    }

    public void setBac(String bac) {
        this.bac = bac;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "bac=" + bac +
                "} " + super.toString();
    }
}
