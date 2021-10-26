//Dependancy ke Dosen
public class MataKuliah {
	private String name1;
	private String name2;
	
	MataKuliah(int code){
		this.name1 = this.generateMatkul(code);
	}
	
	MataKuliah(int code1, int code2){
		this.name1 = this.generateMatkul(code1);
		this.name2 = this.generateMatkul(code2);
	}
	
	public String generateMatkul(int code) {
		switch(code) {
			case 1:
				return "Basis Data";
			case 2:
				return "Pemrograman Dasar";
			case 3:
				return "Algoritma Dasar";
			case 4:
				return "Bahasa Inggris";
			case 5:
				return "Perangkat Lunak";
			default:
				return " ";
		}
	}
	
	public void printMatkul() {
		System.out.println("Nama Mata Kuliah 1 = " + this.name1);
		if(this.name2 != null)
			System.out.println("Nama Mata Kuliah 2 = " + this.name2);
		System.out.println("------------------------------------");
	}
}
