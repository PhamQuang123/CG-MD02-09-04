package demo_array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Demo_delete_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5, 6};
//        System.out.println("Nhập số cần xoá:");
//        int deleteNumber = sc.nextInt();
//        int index = -1;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == deleteNumber){
//                index = i;
//                break;
//            }
//        }
//        if (index >= 0){
//            for (int i = 0; i < arr.length-1; i++) {
//                if (i >= index){
//                    arr[i] = arr[i+1];
//                }
//            }
//            arr[arr.length-1] = 0;
//        }
//        System.out.println(Arrays.toString(arr));

        // thêm
//        System.out.println("Nhập số ần thêm:");
//        int addNumber = sc.nextInt();
//        System.out.println("Nhập vị trí cần chèn:");
//        int indexAdd = sc.nextInt();
//        int[] newArr = new int[7];
//        if (indexAdd >= 0 && indexAdd < arr.length) {
//            for (int i = 0, j = i; i < arr.length; i++, j++) {
//                if (indexAdd == i) {
//                    newArr[indexAdd] = addNumber;
//                    j++;
//                }
//                newArr[j] = arr[i];
//            }
//            System.out.println(Arrays.toString(newArr));
//        } else {
//            System.out.println("vị trí cần chèn không tồn tại, nhập lại đi bạn ơi");
//        }

        // Viết một ứng dụng cho phép người dùng nhập vào một mảng hai chiều của các số thực,
        // sau đó cho phép người dùng nhập vào thứ tự của một cột (tính từ 0)
        // và tính ra tổng các phần tử của cột đó.
        double[][] arr2 = {{1,2,3},{4,5,6},{7,8,9}};
        double sum1 =0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.printf("%.0f \t",arr2[i][j]);
                if (i == j){
                  sum1 += arr2[i][j];
                }
            }
            System.out.println("\n");
        }
        System.out.println("Tổng đường chéo chính là: " + sum1);
        System.out.println("Nhập số cột muốn tính tổng:");
        int choice = sc.nextInt();
        double sum = 0;
        switch (choice){
            case 0:
                for (int i = 0; i < arr2.length; i++) {
                   sum += arr2[i][0];
                }
                System.out.println("Tổng cột 0 là: " + sum);
                break;
            case 1:
                for (int i = 0; i < arr2.length; i++) {
                    sum += arr2[i][1];
                }
                System.out.println("Tổng côt 1 là: " + sum);
                break;
            case 2:
                for (int i = 0; i < arr2.length; i++) {
                    sum += arr2[i][2];
                }
                System.out.println("Tổng cột 2 là: " + sum);
                break;
        }

    }
}
