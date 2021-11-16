
public class Dosen {
	private String name;
	private MataKuliah matkul;
	
	Dosen(String name, int code){
		this.name = name;
		this.matkul = new MataKuliah(code);
	}
	
	Dosen(String name, int code1, int code2){
		this.name = name;
		this.matkul = new MataKuliah(code1,code2);
	}
	
	public void printDosen() {
		System.out.println("Nama Dosen = " + this.name);
		this.matkul.printMatkul();
		System.out.println("--------------------------");
	}
}
