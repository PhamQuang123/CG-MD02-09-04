package cleanCode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager obj = new StudentManager();
        do {
            System.out.println("***** MENU *****");
            System.out.println("1. Thêm mới 1 sinh viên");
            System.out.println("2. Cập nhật thông tin sinh viên");
            System.out.println("3. Xoá thông tin sinh viên");
            System.out.println("4. Điểm trung bình của các học viên");
            System.out.println("5. Tìm kiếm học viên theo ID");
            System.out.println("6. Tìm kiếm học viên theo tên");
            System.out.println("7. Học viên có điểm trung bình lớn nhất");
            System.out.println("8. Danh sách sinh viên");
            System.out.println("9. Thoát");
            System.out.print("Lựa chọn của bạn là: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    StudentManager.createStudent(scanner);
                    break;
                case 2:
                    StudentManager.updateStudent(scanner);
                    break;
                case 3:
                    StudentManager.deleteStudent(scanner);
                    break;
                case 4:
                    System.out.println("Điểm trung bình của các học sinh là: " + StudentManager.avgOfAllStudent());
                    break;
                case 5:
                    StudentManager.findStudentById(scanner);
                    break;
                case 6:
                    StudentManager.findStudentByName(scanner);
                    break;
                case 7:
                    System.out.println("Học viên có điểm trung bình lớn nhất là: ");
                    StudentManager.findAvgMax();
                    break;
                case 8:
                    StudentManager.getAllData();
                    break;
                case 9:
                    System.exit(0);
            }
        }while (true);
    }
}
