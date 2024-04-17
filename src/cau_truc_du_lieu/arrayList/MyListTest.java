package cau_truc_du_lieu.arrayList;

import java.util.ArrayList;
import java.util.List;

public class MyListTest {
    public static void main(String[] args) {
        Mylist<Integer> arr  = new Mylist();
        arr.add(3);
        arr.add(4);
        arr.add(1);
        arr.add(2);
        arr.add(5);
        arr.add(6);
        arr.add(6);
        arr.add(6);
        arr.add(6);
        arr.add(6);
        arr.add(6);

       List<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < arr.size; i++) {
            System.out.printf("%d\t",arr.getElement()[i]);
        }
//        arr.insert(1,10);
//        System.out.println("\n");
//        arr.remove(2);
//        for (int i = 0; i < arr.size; i++) {
//            System.out.printf("%d\t",arr.getElement()[i]);
//        }
//        System.out.println("\n");
//        arr.remove(4);
//        for (int i = 0; i < arr.size; i++) {
//            System.out.printf("%d\t",arr.getElement()[i]);
//        }
//
//        System.out.println("\nmethod get " + arr.get(0));
    }
}
