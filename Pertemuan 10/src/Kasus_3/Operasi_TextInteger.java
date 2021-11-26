package Kasus_3;

import java.util.Scanner;

public class Operasi_TextInteger {
	public static int exceptionInput() {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Masukan Nilai: ");
			return scan.nextInt();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e + " handled, value set to 0");
			return 0;
		}
	}
	
	public static void main(String[] args) {
		// TODO: meminta input int
		System.out.println("Input Integerr\n----------------------");
		int nilai = exceptionInput();
		System.out.println("Nilai yang anda masukan: " + nilai);
	}
}
