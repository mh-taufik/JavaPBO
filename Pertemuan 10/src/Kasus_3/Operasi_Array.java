package Kasus_3;

import java.util.Scanner;

public class Operasi_Array {
	public static int exceptionArray(int a) {
		int[] array = {0,1,2,3,4};
		try {
			return array[a];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e + " handled, set to 0");
			return 0;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Mencari nilai pada array\n-------------------------");
		System.out.println("masukan nilai: ");
		int value = scan.nextInt();
		int hasil = exceptionArray(value);
		System.out.println("Index pada array: " + hasil);
		
		scan.close();
	}
}
