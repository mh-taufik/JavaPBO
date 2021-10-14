package soal_2;

public class Makanan {
	private String[] nama_makanan;
	private double[] harga_makanan;
	private int[] stok;

	Makanan() {
		this.nama_makanan = new String[10];
		this.harga_makanan = new double[10];
		this.stok = new int[10];
	}

	public void setNamaMakanan(String nama, byte id) {
		this.nama_makanan[id] = nama;
	}

	public void setHargaMakanan(double harga,byte id) {
		this.harga_makanan[id] = harga;
	}

	public void setStok(int stok, byte id) {
		this.stok[id] += stok;
	}

	public String getNamaMakanan(byte id) {
		return nama_makanan[id];
	}

	public double getHargaMakanan(byte id) {
		return harga_makanan[id];
	}

	public int getStok(byte id) {
		return stok[id];
	}
	
	public void removeStok(byte id, int jumlah) {
		this.stok[id] -= jumlah;
	}
}
