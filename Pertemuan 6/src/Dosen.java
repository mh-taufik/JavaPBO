
public class Dosen {
	private String nama;
	private MataKuliah matkul;
	
	Dosen(String nama, int code){
		this.nama = nama;
		this.matkul = new MataKuliah(code);
	}
	
	Dosen(String nama, int code1, int code2){
		this.nama = nama;
		this.matkul = new MataKuliah(code1, code2);
	}
	
	public String getNama() {
		return nama;
	}
	
	public void printData() {
		System.out.println("Nama Dosen = " + this.nama);
		this.matkul.printMatkul();
	}
}
