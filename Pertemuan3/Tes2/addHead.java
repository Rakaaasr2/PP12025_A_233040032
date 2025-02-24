package Pertemuan3.Tes2;

import Pertemuan3.Latihan1.Node;

public class addHead {
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

    public void displayElement() {
        Node curNode = HEAD;
        while (curNode != null) {
            System.out.print(curNode.getData()+ " ");
            curNode = curNode.getNext();
        }
    }

    public static void main(String[] args) {
        addHead list = new addHead();
        list.addHead(5);
        list.addHead(4);
        list.addHead(3);

        System.out.println("Elemen: ");
        list.displayElement();
    }
}