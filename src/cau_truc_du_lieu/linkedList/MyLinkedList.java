package cau_truc_du_lieu.linkedList;

public class MyLinkedList {
    private Node head ;
    private Node tail;

    public static int numNodes = 0;

    public MyLinkedList() {
        head = null;
        tail = null;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public static int getNumNodes() {
        return numNodes;
    }

    public void addFirst(Object o) {
        Node newNode = new Node(o);
        if (head == null) {
            this.head = newNode;
            this.tail = this.head;
        } else {
            newNode.next = head;//
            this.head = newNode;
        }
        numNodes++;
    }

    public void addLast(Object o) {
        Node newNode = new Node(o);
        if (this.tail == null) {
            this.tail = newNode;
            this.head = this.tail;

        } else {
            this.tail.next = newNode;
            this.tail = this.tail.next;

        }
        numNodes++;
    }
    public void insertNode(int index, Object o){
        if (numNodes > 0){
            if (index > 0 && index < numNodes){
                Node p = new Node(o);
                Node c = this.head;
                int i = 0;
                while (c != null){
                    i++;
                    if (i == index){
                        p.next = c.next;
                        c.next = p;
                        break;
                    }
                    c = c.next;
                }
            } else if (index == 0) {
                this.addFirst(o);
            } else if (index == numNodes) {
                this.addLast(o);
            }else{
                System.err.println("err");
            }
        }

    }
}
