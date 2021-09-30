/*
 * 30 menit
 * 
 * https://www.geeksforgeeks.org/split-string-java-examples/
 * 
 * */

import java.util.Scanner;

public class Soal1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();
		
		//untuk membatasi token apa saja yang tidak diprint
		String splits[] = str.split("[!,?._'@ ]");
		//print jumlah kata dan print per kata
		System.out.println(splits.length);
		for (String partOf : splits) {
			System.out.println(partOf);
		}
	}
}
 