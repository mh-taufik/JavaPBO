
public class Universitas {
	private String nama, alamat;
	
	Universitas(String nama, String alamat){
		this.nama = nama;
		this.alamat = alamat;
	}

	public void printUniv() {
		System.out.println("Nama Universitas = " + this.nama);
		System.out.println("Alamat  = " + this.alamat);
	}
}
