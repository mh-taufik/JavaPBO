import java.util.*;

public class Jurusan {
	private String nama;
	public List<Dosen> dosen;
	
	Jurusan(String nama){
		this.nama = nama;
		generateDosen(dosen);
	}
	
	public void generateDosen(List<Dosen> dosen) {
		Dosen dosen1 = new Dosen("Budi",2,3);
		Dosen dosen2 = new Dosen("Rahmat",1,5);
		Dosen dosen3 = new Dosen("Sekar",3);
		
		dosen = new ArrayList<Dosen>(3);
		
		dosen.add(dosen1);
		dosen.add(dosen2);
		dosen.add(dosen3);
	}
	
	public void printData() {
		System.out.println("Nama Jurusan = " + this.nama);
		System.out.printf("--------------------------------\n    Daftar Dosen Pengajar\n");
		for(Dosen partOf : dosen) {
			System.out.println("Nama Dosen = " + partOf.getNama());
			partOf.printData();
		}
		System.out.println("------------------------------");
	}
}
