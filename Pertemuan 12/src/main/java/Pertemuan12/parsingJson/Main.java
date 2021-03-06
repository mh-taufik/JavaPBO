package Pertemuan12.parsingJson;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Gson gs = new Gson();
		ArrayList<Pesanan> list = gs.fromJson(
				new FileReader("/home/taufik/Documents/GitHub/JavaPBO/Pertemuan 12/assets/barang.json"),
				new TypeToken<ArrayList<Pesanan>>() {}.getType());

		int i=1;
		for(Iterator<Pesanan> itr = list.iterator(); itr.hasNext(); i++) {
			Pesanan temp = itr.next();
			System.out.println("barang ke-" + i + " :  " + temp.toString());
		}
		System.out.println("----------------------------");
	}
}

//		mengecek path dari pembacaan file
//		System.out.println(read.getAbsolutePath());
//		new File("/home/taufik/Documents/GitHub/JavaPBO/Pertemuan 12/assets/barang.json")
//		new FileReader("../assets/barang.json") 