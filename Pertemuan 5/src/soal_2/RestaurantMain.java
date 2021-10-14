package soal_2;

public class RestaurantMain {
	public static void main(String[] args) {
		Restaurant menu = new Restaurant();
		menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
		menu.tambahMenuMakanan("Gehu", 1_000, 20);
		menu.tambahMenuMakanan("Tahu", 1_000, 0);
		menu.tambahMenuMakanan("Molen", 1_000, 20);
		
		menu.tampilMenuMakanan();
		System.out.println();
		menu.pesanMenuMakanan(0, 10);
		menu.pesanMenuMakanan(3, 20);
		menu.tampilMenuMakanan();
	}
	

}
