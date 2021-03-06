//Dependancy
public class MataKuliah {
	private String nama1, nama2;
	
	MataKuliah(int code){
		this.nama1 = generateMatkul(code);
		this.nama2 = null;
	}
	
	MataKuliah(int code1, int code2){
		this.nama1 = generateMatkul(code1);
		this.nama2 = generateMatkul(code2);
	}
	
	public String generateMatkul(int code) {
		switch(code){
			case 1:
				return "Bahasa Inggris";
			case 2:
				return "Struktur Data";
			case 3:
				return "Basis Data";
			case 4:
				return "Pemrograman Dasar";
			case 5:
				return "Algritma Dasar";
			default:
				return null;
		}
	}
	
	public void printMatkul() {
		System.out.println("Nama Mata Kuliah 1 = " + this.nama1);
		if(this.nama2 != null)
			System.out.println("Nama Mata Kuliah 2 = " + this.nama2);
	}
}
