package quan_ly_ho_dan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KhuPho {
    private List<HoGiaDinh> listH;

    public KhuPho() {
        listH = new ArrayList<>();
    }

    public KhuPho(List<HoGiaDinh> listH) {
        this.listH = listH;
    }

    public List<HoGiaDinh> getListH() {
        return listH;
    }

    public void setListH(List<HoGiaDinh> listH) {
        this.listH = listH;
    }

    public void nhapDuLieu(Scanner scanner){
        HoGiaDinh hoGiaDinh = new HoGiaDinh();
        System.out.println("Nhập thông tin hộ gia đình:");
        hoGiaDinh.setSoThanhVien(HoGiaDinhImp.nhapSoThanhVien(scanner));
        hoGiaDinh.setSoNha(HoGiaDinhImp.nhapSoNha(scanner));
        System.out.println("Nhập thông tin thành viên gia đình:");
        hoGiaDinh.setNguoi(HoGiaDinhImp.nhapThanhVien(scanner));
        this.listH.add(hoGiaDinh);
    }


}
