import java.util.*;

public class Soal4 {
	public static final int gajiPokok = 500000; 
	public static final int itemHarga = 50000; 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int jual = scan.nextInt();
		scan.close();
		int gajiNew = (int) hitungGaji(jual); 
		System.out.println(gajiNew);
		
	}
	
	public static double hitungGaji(int jumlah) {
		if(jumlah >= 80) {	//35%
			return jumlah * itemHarga * 0.35 + gajiPokok;
		}else if(jumlah >= 40){	//25%
			return jumlah * itemHarga * 0.25 + gajiPokok;
		}else if(jumlah < 15){	//-15%
			return ((15-jumlah) * itemHarga) * -0.15 + gajiPokok;
		}else {	//10%
			return jumlah * itemHarga * 0.1 + gajiPokok;
		}
	}
}
