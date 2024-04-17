package quan_ly_ho_dan;

import java.util.Scanner;

public class NguoiImp {
    public static String nhapTen(Scanner scanner){
        System.out.println("Nhập tên thành viên:");
        return scanner.nextLine();
    }
    public static int nhapTuoi(Scanner scanner){
        System.out.println("Nhập tuổi:");
        return Integer.parseInt(scanner.nextLine());
    }

    public static String nhapNgheNghiep(Scanner scanner){
        System.out.println("Nhập nghề nghiệp:");
        return scanner.nextLine();
    }
    public static String nhapCmnn(Scanner scanner){
        System.out.println("Nhập số cmnn:");
        return scanner.nextLine();
    }
}
