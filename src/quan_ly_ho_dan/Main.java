package quan_ly_ho_dan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KhuPho khoPho = new KhuPho();
        khoPho.nhapDuLieu(scanner);
        System.out.println(khoPho.getListH().get(0));
    }
}
