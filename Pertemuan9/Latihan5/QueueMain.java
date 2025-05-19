package Pertemuan9.Latihan5;

import Pertemuan9.Node;

public class QueueMain {
    Node FRONT;
    Node REAR;

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            FRONT = REAR = newNode;
        }
        else {
            REAR.setNext (newNode);
            REAR = newNode;
        }
    }

    public int size() {
        int size = 0;
        Node curNode = FRONT;
        while (curNode != null) {
            size++;
            curNode = curNode.getNext();
        }
        return size;
    }

    public int front() {
        return FRONT != null ? FRONT.getData() : -1;
    }

    public void displayElements() {
        System.out.print("Elemen Queue: ");
        if (isEmpty()) {
            System.out.println("Queue kosong");
        } else {
            Node temp = FRONT;
            while (temp != null) {
                System.out.print(temp.getData() + " ");
                temp = temp.getNext();
            }
            System.out.println();
        }
    }

    public boolean isEmpty() {
        return (FRONT == null);
    }

    public static void main(String[] args) {
        QueueMain queue = new QueueMain();

        System.out.println("### Sebelum Enqueue 4x ###");
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        queue.displayElements();
        System.out.println();

        queue.enqueue(2);
        queue.enqueue(7);
        queue.enqueue(6);
        queue.enqueue(1);

        System.out.println("### Enqueue 4x ###");
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        queue.displayElements();
        System.out.println("Front: " + queue.front());
    }
}