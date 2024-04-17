package cau_truc_du_lieu.linkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList arr = new MyLinkedList();

        arr.addFirst(2);
        arr.addLast(9);
        arr.addLast(10);
        arr.addFirst(5);
        arr.addLast(11);
        arr.insertNode(0, 25);
        System.out.println(arr.getHead().data);
        System.out.println(arr.getTail().data);
        Node size = arr.getHead();
        while (size != null){
            System.out.println( size.data);
           size = size.next;
        }
    }
}
