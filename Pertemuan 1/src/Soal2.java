public class Soal2 {
	public static void main(String[] args) {
		int i = 42;
		String s = (i<40)?"life":(i>50)?"universe":"everything";
//		Menggunakan if i<40 maka "life" atau if i>50 maka "universe"; 
//		Selain itu maka akan menjadi "everything" 
		
		System.out.println(s);
	}
}
