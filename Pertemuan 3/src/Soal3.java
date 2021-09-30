/*
 * 3 menit 
 * 
 * */

import java.util.Scanner;

public class Soal3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A,B;
		String operator;
		
		scan.hasNext();
		A = scan.nextInt();
		operator = scan.next();
		B = scan.nextInt();
		scan.close();
		
		switch(operator.charAt(0)) {
			case 43 : 
				System.out.println(A+B);
				break;
			case 45 : 
				System.out.println(A-B);
				break;
			case 42 : 
				System.out.println(A*B);
				break;
			case 47 : 
				System.out.println(A/B);
				break;
			case 37 : 
				System.out.println(A%B);
				break;
				
		}
	}
}
