package Pertemuan9.Tugas;

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

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue kosong, tidak bisa dequeue.");
            return -1;
        }

        int data = FRONT.getData();
        FRONT = FRONT.getNext();

        if (FRONT == null) {
            REAR = null;
        }

        return data;
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

        System.out.println("### Setelah Enqueue 4x ###");
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        queue.displayElements();
        System.out.println("Front: " + queue.front());

        System.out.println("\n### Dequeue 2x ###");
        int removed1 = queue.dequeue();
        System.out.println("Dequeued: " + removed1);
        int removed2 = queue.dequeue();
        System.out.println("Dequeued: " + removed2);

        System.out.println("size: " + queue.size());
        queue.displayElements();
        System.out.println("Front: " + queue.front());
    }

}