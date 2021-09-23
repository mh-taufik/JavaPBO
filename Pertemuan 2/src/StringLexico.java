/**
 * 	26 menit
 * 
 * 	https://chortle.ccsu.edu/java5/Notes/chap92/ch92_2.html
 * 	https://java2blog.com/capitalize-first-letter-java/
 */

import java.util.Scanner;
import java.lang.String;

public class StringLexico {
	public static String Capitalize(String word) {
		String firstLetter = word.substring(0, 1);
		String restLetter = word.substring(1);
		return firstLetter.toUpperCase() + restLetter;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String A = scan.next();
		String B = scan.next();
		
		//panjang jumlah string yang ada
		System.out.println(A.length() + B.length());
		
		// Apakah Lexiograph atau tidak
		if(A.compareTo(B) > 0)
			System.out.println("Yes");
		else
			System.out.println("No");
		
		//kapital huruf awal
		A = Capitalize(A);
		B = Capitalize(B);
		
		System.out.println(A + " " + B);
		scan.close();
	}
}
