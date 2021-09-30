package W3;

import java.util.Scanner;
import java.math.BigInteger; // library baru

public class Soal6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		String a,b; 
		BigInteger Ba,Bb,penjumlahan,perkalian;  
		
		//BigInteger diperlukan dalam operasi matematika ketika nilai integer 
		//yang digunakan sangat besar karena jika  hanya menggunakan tipe data int 
		//bisa menyebabkan integer overflow
		
		a = input.next(); // membaca inputan yang disimpan sebagai nilai a
		b = input.next(); // membaca inputan yang disimpan
		Ba = new BigInteger(a); // mengubah nilai a ke BigInteger
		Bb = new BigInteger(b); // mengubah nilai b ke BigInteger
		penjumlahan = Ba.add(Bb); // operasi penjumlahan dengan tipe data BigInteger
		perkalian = Ba.multiply(Bb); // operasi perkalian dengan tipe data BigInteger
		System.out.println(penjumlahan); // cetak hasil penjumlahan
		System.out.println(perkalian);   // cetak hasil perkalian
	}
}