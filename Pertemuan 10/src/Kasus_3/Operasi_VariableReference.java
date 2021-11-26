package Kasus_3;

public class Operasi_VariableReference {
	public static void exceptionRefrence() {
		int angka[];
		try {
			angka = new int[1];
			System.out.println("angka bernilai: " + angka[0]);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e + " handled");
		}
	}
	
	public static void main(String[] args) {
		exceptionRefrence();
	}
}
