package quan_ly_ho_dan;

import java.util.Scanner;

public class Nguoi {
    private String hoTen;
    private int tuoi;
    private String ngheNghiep;
    private String cmnn;

    public Nguoi() {
    }

    public Nguoi(String hoTen, int tuoi, String ngheNghiep, String cmnn) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.ngheNghiep = ngheNghiep;
        this.cmnn = cmnn;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public String getCmnn() {
        return cmnn;
    }

    public void setCmnn(String cmnn) {
        this.cmnn = cmnn;
    }
//    public String nhapTenNguoi(String ten) throws Exception {
//        if (ten.equals("")){
//            throw new Exception("Không được để trống");
//        }
//        return ten;
//    }
//    public void nhapTen(Scanner scanner) throws Exception {
//        System.out.println("Nhập tên:");
//        String ten = scanner.nextLine();
//        nhapTenNguoi(ten);
//    }
}
