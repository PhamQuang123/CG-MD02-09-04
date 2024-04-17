package quan_ly_ho_dan;

import java.util.Scanner;

public class HoGiaDinhImp {
    public static int nhapSoThanhVien(Scanner scanner){
        System.out.println("Nhập số thành viên:");
        return Integer.parseInt(scanner.nextLine());
    }
    public static int nhapSoNha(Scanner scanner){
        System.out.println("nhập số nhà:");
        return Integer.parseInt(scanner.nextLine());
    }
    public static Nguoi nhapThanhVien(Scanner scanner){
        Nguoi nguoi = new Nguoi();
        nguoi.setHoTen(NguoiImp.nhapTen(scanner));
        nguoi.setTuoi(NguoiImp.nhapTuoi(scanner));
        nguoi.setNgheNghiep(NguoiImp.nhapNgheNghiep(scanner));
        nguoi.setCmnn(NguoiImp.nhapCmnn(scanner));
        return nguoi;
    }

}
