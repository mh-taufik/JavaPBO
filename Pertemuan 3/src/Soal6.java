import java.math.BigInteger;
import java.util.Scanner;

public class Soal6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BigInteger A = scan.nextBigInteger();
		BigInteger B = scan.nextBigInteger();
		scan.close();
		
		System.out.println(A.add(B));
		System.out.println(A.multiply(B));
	}
}
