package Kasus_3;

import java.io.FileInputStream;

public class Operasi_File {
	public static void exceptionFile() {
		try {
			FileInputStream textFile = new FileInputStream("text.txt");
			textFile.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e + " handled");
		}
	}
	
	public static void main(String[] args) {
		exceptionFile();
	}
}