package Kasus_3;

import java.util.Scanner;

public class Operasi_Pembagian {
	public static int ExceptionPembagian(int value, int divisor) {
		try {
			int result = value/divisor;
			return result;
		} catch(Exception e) {
			System.out.println(e + " handled, set result to 0");
			return 0;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int value, divisor, hasil;
		
		//print ke layar
		System.out.println("Menghitung Pembagian Angka\n-----------------------------------");
		System.out.println("masukan angka yang akan dibagi: ");
		value = scan.nextInt();
		System.out.println("masukan pembagi: ");
		divisor = scan.nextInt();
		hasil = ExceptionPembagian(value, divisor);
		System.out.println("hasil pembagian adalah: " + hasil);
		
		scan.close();
	}
}
