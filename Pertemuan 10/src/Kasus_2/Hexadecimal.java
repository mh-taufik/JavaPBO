package Kasus_2;

import java.util.Scanner;

public class Hexadecimal{
	public static int Hexadec(String hexa) {
		try {
			return Integer.parseInt(hexa, 16);
		} catch(NumberFormatException e) {
			System.out.println(e + " handled, hex value set to 0");
			return 0;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//print ke layar
		System.out.println("Menghitung Nilai HExadecimal ke Decimal\n-----------------------------------");
		System.out.printf("masukan angka hexadecimal: ");
		String hexa = scan.next();
		 int dec = Hexadec(hexa);
		System.out.println("\nhasil bilangan pada decimal adalah: " + dec);
		
		scan.close();
	}
}
