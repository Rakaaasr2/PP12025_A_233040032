package Pertemuan3.Latihan5;

import Pertemuan3.Latihan1.Node;

public class Head {
    Node HEAD;

    public void addHead (int data) {
        Node newNode = new Node(data);
        if (HEAD == null) {
            HEAD = newNode;
        }
        else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }
}