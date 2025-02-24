package Pertemuan3.Tes1;

import Pertemuan3.Latihan2dan3.StrukturList;

public class ListMain_a {

    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        list.addTail(3);
        list.addTail(2);
        list.addTail(1);

        System.out.println("Elemen: ");
        list.displayElement();
    }
}