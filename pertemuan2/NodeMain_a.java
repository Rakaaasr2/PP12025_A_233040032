package pertemuan2;

public class NodeMain_a {
    public static void main(String[] args) {
        // Membuat node dengan nilai 5, 7, 9, dan 8
        node n1 = new node(5);
        node n2 = new node(7);
        node n3 = new node(9);
        node n4 = new node(8);

        // Membentuk relasi antar node
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);

        // Menampilkan node dengan pointer p
        node p = n1;
        while (p != null) {
            System.out.printf("%d ", p.getNilai());
            p = p.getNext();
        }
    }
}
