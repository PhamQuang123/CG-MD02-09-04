package cleanCode;

import java.util.Scanner;

public class StudentManager {
    private static Student[] arrStudent;
    private static int index = 0;
    private static int size = 0;

    public StudentManager() {
        arrStudent = new Student[100];
    }

    public static void getAllData() {
        if (size == 0) {
            System.err.println("Chưa có thông tin, vui lòng nhập thông tin");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.println(arrStudent[i]);
            }
        }
    }

    public static void createStudent(Scanner scanner) {
        Student objStudent = new Student();
        objStudent.setStudentId(inputStudentId());
        System.out.println("Nhập tên sinh viên:");
        objStudent.setStudentName(scanner.nextLine());

        objStudent.setArrMark(inputArrMark(objStudent, scanner));

        System.out.println("Nhập giới tính:");
        objStudent.setGender(Boolean.parseBoolean(scanner.nextLine()));
        arrStudent[index] = objStudent;
        index++;
        size++;
    }

    public static int inputStudentId() {
        int maxId = 0;
        if (size == 0) {
            maxId = 0;
        } else {
            for (int i = 0; i < size; i++) {
                if (arrStudent[i].getStudentId() > maxId) {
                    maxId = arrStudent[i].getStudentId();
                }
            }
        }
        maxId += 1;
        return maxId;
    }

    public static float[] inputArrMark(Student objStudent, Scanner scanner) {
        float[] listMark = new float[3];
        for (int i = 0; i < objStudent.getArrMark().length; i++) {
            System.out.printf("Nhập điểm thứ %d: ", i + 1);
            listMark[i] = Float.parseFloat(scanner.nextLine());
        }
        return listMark;
    }

    public static void updateStudent(Scanner scanner) {
        System.out.println("Nhập mã sinh viên cần cập nhật:");
        int updateId = Integer.parseInt(scanner.nextLine());
        int updateIndex = findIndexById(updateId);
        if (updateIndex >= 0) {
            boolean isExit = true;
            do {
                System.out.println("1. Tên sinh viên");
                System.out.println("2. Bảng điểm");
                System.out.println("3. Giới tính");
                System.out.println("4. Thoát");
                System.out.print("Lựa chọn của bạn: ");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Nhập tên mới của sinh viên:");
                        arrStudent[updateIndex].setStudentName(scanner.nextLine());
                        break;
                    case 2:
                        System.out.println("Nhập bảng điểm mới:");
                        arrStudent[updateIndex].setArrMark(inputArrMark(arrStudent[updateIndex], scanner));
                        break;
                    case 3:
                        System.out.println("Nhập giới tính sinh viên:");
                        arrStudent[updateIndex].setGender(Boolean.parseBoolean(scanner.nextLine()));
                        break;
                    case 4:
                        isExit = false;
                        break;
                }
            } while (isExit);
        } else {
            System.err.println("Mã sinh viên không tồn tại");
        }
    }

    public static int findIndexById(int id) {
        if (arrStudent.length == 0) {
            System.err.println("Chưa có thông tin sinh viên, vui lòng thêm thông tin");
        } else {
            for (int i = 0; i < arrStudent.length; i++) {
                if (arrStudent[i].getStudentId() == id) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void deleteStudent(Scanner scanner) {
        System.out.println("Nhập mã sinh viên cần xoá:");
        int deleteId = Integer.parseInt(scanner.nextLine());
        int deleteIndex = findIndexById(deleteId);
        if (deleteIndex >= 0) {
            for (int i = deleteIndex; i <= size; i++) {
                arrStudent[i] = arrStudent[i + 1];
            }
            index--;
            size--;
        } else {
            System.err.println("Mã sinh viên không tồn tại");
        }
    }

    public static float avgOfAllStudent() {
        float avg = 0F;
        float sum = 0F;
        for (int i = 0; i < size; i++) {
            sum += arrStudent[i].getAvg();
        }
        return avg = sum / size;
    }

    public static void findStudentById(Scanner scanner) {
        System.out.println("Nhập mã sinh viên cần tìm kiếm:");
        int inputId = Integer.parseInt(scanner.nextLine());
        int indexFind = findIndexById(inputId);
        if (indexFind >= 0) {
            System.out.println(arrStudent[indexFind]);
        } else {
            System.err.println("Mã không tồn tại");
        }
    }

    public static void findStudentByName(Scanner scanner) {
        System.out.println("Nhập tên sinh viên cần tìm:");
        String inputName = scanner.nextLine();
        int indexFind = findIndexByName(inputName);
        if (indexFind >= 0) {
            System.out.println(arrStudent[indexFind]);
        } else {
            System.err.println("Tên không tồn tại");
        }
    }

    public static int findIndexByName(String inputName) {
        for (int i = 0; i < size; i++) {
            if (arrStudent[i].getStudentName().equals(inputName)) {
                return i;
            }
        }
        return -1;
    }

    public static void findAvgMax(){
        Student objStudent = arrStudent[0];
        for (int i = 0; i < size; i++) {
            if (arrStudent[i].getAvg() > objStudent.getAvg()){
                objStudent = arrStudent[i];
            }
        }
        System.out.println(objStudent);
    }

}
