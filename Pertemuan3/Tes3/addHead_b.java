package Pertemuan3.Tes3;

import Pertemuan3.Tes2.addHead;

public class addHead_b {

    public static void main(String[] args) {
        addHead list = new addHead();
        list.addHead(7);
        list.addHead(5);
        list.addHead(4);
        list.addHead(1);

        System.out.println("Elemen: ");
        list.displayElement();
    }
}