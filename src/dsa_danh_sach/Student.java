package dsa_danh_sach;

import java.util.List;
import java.util.Scanner;

public class Student {
    private int studentId;
    private String studentName;
    private int age;
    private String address;
    private String className;
    private boolean studentStatus;


    public Student() {
    }

    public Student(int studentId, String studentName, int age, String address, String className, Boolean studentStatus) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.address = address;
        this.className = className;
        this.studentStatus = studentStatus;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getClassName() {
        return className;
    }

    public boolean isStudentStatus() {
        return studentStatus;
    }

    public void setStudentStatus(boolean studentStatus) {
        this.studentStatus = studentStatus;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void inputData(List<Student> listStudent, Scanner sc) {
        this.studentId = inputStudentId(listStudent);
        this.studentName = inputStudentName(sc);
        this.age = inputAge(sc);
        this.address = inputAddress(sc);
        this.className = inputClassName(sc);
        this.studentStatus = inputStatus(sc);
    }

    public void display() {
        System.out.printf("Mã học sinh: %d - Tên học sinh: %s - Tuổi: %d - Quê quán: %s - Lớp: %s - Trạng thái: %s\n",
                this.studentId, this.studentName, this.age, this.address, this.className, this.studentStatus ? "Đi học" : "Nghỉ học");
    }

    public int inputStudentId(List<Student> listStudent) {
        int maxId = 0;
        if (listStudent.size() == 0) {
            maxId = 0;
        } else {
            for (int i = 0; i < listStudent.size(); i++) {
                if (listStudent.get(i).getStudentId() > maxId) {
                    maxId = listStudent.get(i).getStudentId();
                }
            }
        }
        maxId += 1;
        return maxId;
    }

    public String inputStudentName(Scanner sc) {
        System.out.println("Nhập tên học sinh:");
        return sc.nextLine();
    }

    public int inputAge(Scanner sc) {
        System.out.println("Nhập tuổi học sinh:");
        return Integer.parseInt(sc.nextLine());
    }

    public String inputAddress(Scanner sc) {
        System.out.println("NHập địa chỉ: ");
        return sc.nextLine();
    }

    public String inputClassName(Scanner sc) {
        System.out.println("Nhập tên lớp:");
        return sc.nextLine();
    }

    public boolean inputStatus(Scanner sc) {
        System.out.println("Nhập vào trạng thái của học sinh:");
        return Boolean.parseBoolean(sc.nextLine());
    }
}
