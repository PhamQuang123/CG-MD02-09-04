package quan_ly_ho_dan;

public class HoGiaDinh {
    private int soThanhVien;
    private int soNha;
    private Nguoi nguoi;

    public HoGiaDinh() {
    }

    public HoGiaDinh(int soThanhVien, int soNha, Nguoi nguoi) {
        this.soThanhVien = soThanhVien;
        this.soNha = soNha;
        this.nguoi = nguoi;
    }

    public int getSoThanhVien() {
        return soThanhVien;
    }

    public void setSoThanhVien(int soThanhVien) {
        this.soThanhVien = soThanhVien;
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }

    public Nguoi getNguoi() {
        return nguoi;
    }

    public void setNguoi(Nguoi nguoi) {
        this.nguoi = nguoi;
    }
    public String toString(){
        return "Số tv: " + this.soThanhVien + " Số nhà: " + this.soNha
                + " tên: " + this.nguoi.getHoTen() + " tuổi: " + this.nguoi.getTuoi();
    }
}
