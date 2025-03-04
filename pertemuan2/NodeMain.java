package pertemuan2;

public class NodeMain {
	public static void main (String[] args) {
		
		//membuat 2 buah node n1 & n2
		node n1 = new node (5);
		node n2 = new node (7);
		
		// membuat relasi Node n1 & n2
		n1.setNext(n2);
		
		//menampilkan node n1 & n2 dengan Pointer p
		node p = n1;
		while(p != null)
		{
			System.out.printf("%d ", p.getNilai());
			p = p.getNext();
		}
	}
}
