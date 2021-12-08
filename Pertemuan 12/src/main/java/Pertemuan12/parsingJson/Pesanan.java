package Pertemuan12.parsingJson;

public class Pesanan {
	Status status = new Status();
	ServicePackage servicePackage = new ServicePackage();
	City city = new City();
	private int weight, quantity, priceItem;
	private String productName;
	
	@Override
	public String toString() {
		String print = "\nNama Barang; " + this.productName + "\nJumlah: " + this.quantity + "\nHarga: " + this.priceItem
				+ "\nBerat: " + this.weight + " Kg\n";
		print += servicePackage.toString();
		print += city.toString();
		print += status.toString();
		return print;
	}
}
