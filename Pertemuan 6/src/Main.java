//Composition
public class Main {
	public static void main(String[] args) {
		Universitas univ = new Universitas("POLBAN", "Bandung");
		Jurusan jurusan = new Jurusan("Teknik Informatika");
		
		univ.printUniv();
		univ.jurusan.add(jurusan);
		jurusan.printData();
	}
}
