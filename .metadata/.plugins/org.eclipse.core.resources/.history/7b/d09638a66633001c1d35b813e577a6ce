//Composition
import java.util.*;

public class Jurusan {
	private String nama;
	private List<Dosen> dosen;
	
	Jurusan(String nama){
		this.nama = nama;
		generateDosen(this.dosen);
	}
	
	public void generateDosen(List<Dosen> dosen) {
		dosen = new ArrayList<Dosen>(3);
		Dosen d1 = new Dosen("Budi",2,3);
		Dosen d2 = new Dosen("Rahmat",4,5);
		Dosen d3 = new Dosen("Sekar",1);
		
		dosen.add(d1);
		dosen.add(d2);
		dosen.add(d3);
	}
	
	public void printData() {
		System.out.println("Nama Jurusan = " + this.nama);
		System.out.printf("\n   Daftar Dosen   \n");
		for(Dosen partOf : dosen) {
			partOf.printDosen();
		}
	}
}
