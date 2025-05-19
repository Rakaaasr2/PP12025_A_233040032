package Pertemuan9.Latihan4;

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
        int count = 0;
        Node temp = FRONT;
        while (temp != null) {
            count++;
            temp = temp.getNext();
        }
        return count;
    }

    public int front() {
        return FRONT != null ? FRONT.getData() : -1;
    }

    public boolean isEmpty() {
        return (FRONT == null);
    }


    public static void main(String[] args) {
        QueueMain queue = new QueueMain();

        System.out.println("### Sebelum Enqueu 3x ###");
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        System.out.println();

        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println("### Setelah Enqueu 3x ###");
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        System.out.println("Front: " + queue.front());

    }
}