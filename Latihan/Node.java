package Pertemuan4.Latihan;

public class Node {
    public int data;
    public Node next;


    public Node (int data) {
        this.data = data;
    }

    //** setter & Getter */
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
