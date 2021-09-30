import java.util.*;

public class Soal2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] angka = new int[3];
		String[] kata = new String[3];
		
		//proses baca input
		for(int i=0; i<3;i++) {
			scan.hasNext();
			kata[i] = scan.next();
			angka[i] = scan.nextInt();
		}
		scan.close();
		
		System.out.println("================================");
		for(int i=0;i<3;i++) {
			if(angka[i] < 10)
				System.out.printf("%s \t 00%d\n", kata[i], angka[i]);
			else if(angka[i] < 100)
				System.out.printf("%s \t 0%d\n", kata[i], angka[i]);
			else
				System.out.printf("%s \t %d\n", kata[i], angka[i]);
		}
		System.out.println("================================");
		
	}
}
