package Pertemuan9.Latihan3;

import Pertemuan9.Node;

public class StrukturQueue {
    Node FRONT;

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

    public boolean isEmpty() {
        return (FRONT == null);
    }
}