package Pertemuan12.parsingJson;

public class Pesanan {
	Status status = new Status();
	ServicePackage servicePackage = new ServicePackage();
	City city = new City();
	private int weight, quantity, priceItem;
	private String productName;
	
	@Override
	public String toString() {
		String print = this.productName + " | " + this.quantity + " | " + this.weight + " | ";
		print += city.toString();
		print += servicePackage.toString();
		print += (this.priceItem*this.quantity) + this.servicePackage.getValue();
		return print;
	}
}
