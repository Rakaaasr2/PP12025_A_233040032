package pertemuan2;

public class NodeMain_b {
    public static void main(String[] args) {
        // Membuat node dengan nilai 2, 3, 5, 7 dan 9
        node n1 = new node(2);
        node n2 = new node(3);
        node n3 = new node(5);
        node n4 = new node(7);
        node n5 = new node(9);

        // Membentuk relasi antar node
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);

        // Menampilkan node dengan pointer p
        node p = n1;
        while (p != null) {
            System.out.printf("%d ", p.getNilai());
            p = p.getNext();
        }
    }
}
