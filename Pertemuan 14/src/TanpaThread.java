
public class TanpaThread {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		for(int i=1;i<=1000;i++)
			System.out.printf("");
		long end = System.currentTimeMillis();
		float sec = (end - start) / 1000F;
		System.out.println("Program Selesai dengan waktu: " + sec);
	}
}
