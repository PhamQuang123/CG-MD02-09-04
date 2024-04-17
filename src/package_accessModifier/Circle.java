package package_accessModifier;

import java.util.Scanner;

public class Circle {
    private int id;
    private int radius;
    public static int maxRadius;
    private static int cnt = 0;
    public static final float PI = 3.14F;
    public static double totalS;

    public Circle() {
    }

    public Circle(int id, int radius) {
        this.id = id;
        this.radius = radius;
        if (this.radius > maxRadius){
            maxRadius = this.radius;
        }
        totalS += this.getS();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public static int getMaxRadius() {
        return maxRadius;
    }

    public static void setMaxRadius(int maxRadius) {
        Circle.maxRadius = maxRadius;
    }

    public static int getCnt() {
        return cnt;
    }

    public static void setCnt(int cnt) {
        Circle.cnt = cnt;
    }

    public static double getTotalS() {
        return totalS;
    }

    public static void setTotalS(double totalS) {
        Circle.totalS = totalS;
    }

    public String toString() {
        return "Mã: " + this.id + " - Bán kính: " + this.radius + " - Chu vi: " + this.getC() + " - Diện tích: " + this.getS();
    }

    public double getC() {
        return this.radius * 2 * PI;
    }

    public double getS() {
        return PI * this.radius * this.radius;
    }
}
