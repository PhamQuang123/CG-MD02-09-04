package package_accessModifier;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle obj1 = new Circle(1, 5);
        Circle obj2 = new Circle(2, 12);
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println("Hình tròn có bán kính lớn nhất là: " + Circle.maxRadius);
        System.out.println("Tổng diện tích các hình tròn được tạo ra là: " + Circle.totalS);
    }
}
