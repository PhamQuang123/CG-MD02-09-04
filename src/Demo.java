import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Bài 1:
//        System.out.println("Nhập vào số a:");
//        int a = sc.nextInt();
//        System.out.println("Nhập vào số b:");
//        int b = sc.nextInt();
//        if (a % b == 0) {
//            System.out.println("a chia hết cho b");
//        } else {
//            System.out.println("a không chia hết cho b");
//        }

        // bài 2:
//        System.out.println("Nhập tuổi học sinh:");
//        int age = sc.nextInt();
//        if (age < 15) {
//            System.out.println(age + " tuổi  không đủ điều kiện vào học lớp 10.");
//        }

        // Bài 3:
//        System.out.println("Nhập số cần kiểm tra:");
//        int number3 = sc.nextInt();
//        if (number3 > 0) {
//            System.out.println(number3 + " lớn hơn 0");
//        } else if (number3 < 0) {
//            System.out.println(number3 + " nhỏ hơn 0");
//        } else {
//            System.out.println("số nhập vào là: " + number3);
//        }

        // Bài 4:
//        System.out.println("Nhập số thứ nhât:");
//        int inp1 = sc.nextInt();
//        System.out.println("Nhập số thứ 2:");
//        int inp2 = sc.nextInt();
//        System.out.println("Nhập số thứ 3:");
//        int inp3 = sc.nextInt();
//        int min, max;
//        // tìm max và min
//        min = inp1 < inp2 ? inp1 : inp2;
//        max = inp1 > inp2 ? inp1 : inp2;
//
//        min = min < inp3 ? min : inp3;
//        max = max > inp3 ? max : inp3;
//        System.out.println("số min là " + min);
//        System.out.println("số max là: " + max);
        int[] a = {50, 100};
        m(a);
        System.out.println(a[0]);

    }

    static void m(int[] x) {
        x[0] = 200;
    }
}
