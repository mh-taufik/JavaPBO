
public class Main {
	public static void main(String[] args) {
		Universitas univ = new Universitas("Politeknik Negeri Bandung","Bandung");
		Jurusan jurusan = new Jurusan("teknik Informatika");
		
		univ.printUniv();
		jurusan.printData();
	}
}
