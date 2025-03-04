package pertemuan2;

public class node {
	private int nilai;
	private node next;
	
	// inisialisasi Node
	public node (int nilai) {
		this.nilai = nilai;
	}
	//seter  & gatter

	public int getNilai() {
		return nilai;
	}

	public void setNilai(int nilai) {
		this.nilai = nilai;
	}

	public node getNext() {
		return next;
	}

	public void setNext(node next) {
		this.next = next;
	}
	
}
