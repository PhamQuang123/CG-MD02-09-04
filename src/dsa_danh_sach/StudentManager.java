package dsa_danh_sach;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> listStudent = new ArrayList<>();
//        StudentManager objSM = new StudentManager();
//        Student objS = new Student();
        do {
            System.out.println("***** Danh Sách Học Sinh *****");
            System.out.println("1. Danh sách học sinh");
            System.out.println("2. Thêm học sinh mới");
            System.out.println("3. Sửa thông tin học sinh");
            System.out.println("4. Xoá thông tin học sinh");
            System.out.println("5. Hiển thị học sinh 20 tuổi");
            System.out.println("6. Số lượng học sinh có tuổi 23 và quê ở Đà Nẵng");
            System.out.println("7. Thoát");
            System.out.print("Lựa chọn của bạn là: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    if (listStudent.size() > 0) {
                        for (Student obj : listStudent) {
                            obj.display();
                        }
                    }else {
                        System.err.println("Chưa có thông tin học sinh, vui lòng nhập thông tin");
                    }
                    break;
                case 2:
                    System.out.println("Nhập số lượng học sinh cần nhập thông tin:");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        Student objS = new Student();
                        objS.inputData(listStudent, sc);
                        listStudent.add(objS);
                    }
                    break;
                case 3:
                    System.out.println("Nhập mã học sinh cần sửa thông tin:");
                    int updateId = Integer.parseInt(sc.nextLine());
                    int index = findIndexById(updateId, listStudent);
                    if (index >= 0){
//                        updateListStudent();
                        listStudent.get(index).setStudentName(listStudent.get(index).inputStudentName(sc));
                        listStudent.get(index).setAge(listStudent.get(index).inputAge(sc));
                        listStudent.get(index).setAddress(listStudent.get(index).inputAddress(sc));
                        listStudent.get(index).setClassName(listStudent.get(index).inputClassName(sc));
                        listStudent.get(index).setStudentStatus(listStudent.get(index).inputStatus(sc));
                    }else{
                        System.err.println("Mã sinh viên không tồn tại");
                    }
                    break;
                case 4:
                    System.out.println("Nhập mã học sinh cần xoá:");
                    int deleteId = Integer.parseInt(sc.nextLine());
                    int deleteIndex = findIndexById(deleteId, listStudent);
                    if (deleteIndex >= 0){
                        listStudent.remove(deleteIndex);
                    }else{
                        System.err.println("Mã học sinh không tồn tại");
                    }
                    break;
                case 5:
                    boolean check = false;
                    for (Student objSt: listStudent
                         ) {
                        if (objSt.getAge() == 20){
                            objSt.display();
                            check = true;
                        }
                    }
                    if (!check){
                        System.err.println("Không có học sinh có tuổi = 20");
                    }
                    break;
                case 6:

                    int cnt = 0;
                    for (Student objSt: listStudent
                    ) {
                        if (objSt.getAge() == 23 && objSt.getAddress().equals("Đà Nẵng")){
                            cnt ++;
                        }
                    }
                    if (cnt > 0){
                        System.out.println("số lượng các học sinh có tuổi là 23 và quê ở Đà Nẵng là: " + cnt);
                    }else{
                        System.err.println("Không có học sinh có tuổi = 23 và quê Đà Nẵng");
                    }
                    break;
                case 7:
                    System.exit(0);
            }
        } while (true);
    }
    public static int findIndexById(int id, List<Student> list){
        if (list.size() == 0){
            return -1;
        }else{
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getStudentId() == id){
                    return i;
                }
            }
        }
        return -1;
    }
}
