import java.util.Scanner;

public class Soal5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long total;
		String allplat = scan.nextLine();
		scan.close();
		String splits[] = allplat.split("[ ]");
		for(int i=0;i<4;i++) {
			if(i==0)
				allplat = splits[i];
			else
				allplat = allplat + splits[i];
		}
		total = Long.parseLong(allplat);
		if((total - 999999)%5 == 0) {
			System.out.println("Berhenti");
		}else {
			System.out.println("Jalan");
		}
	}
	
}
