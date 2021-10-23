import java.util.*;

//Aggregation
public class Universitas {
	private String nama, alamat;
	public List<Jurusan> jurusan;
	
	Universitas(String nama, String alamat) {
		this.nama = nama;
		this.alamat = alamat;
		this.jurusan = new ArrayList<Jurusan>(1);
	}

	public void printUniv() {
		System.out.println("Nama Universitas = " + this.nama);
		System.out.println("Alamat           = " + this.alamat);
	}
}
