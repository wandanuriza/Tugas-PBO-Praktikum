package W3;
import java.io.*;
import java.util.*;
import java.util.regex.*; 

public class Soal1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine(); // proses pembacaan input bertipe string
        scan.close();
        // Method ini digunakan untuk mengganti regex (sebuah teks string) dengan replacement.
        // method split -> [\\s!,?._'@]+ dihilangkan sehingga input dngn karakter tsb tidak akan ditampilkan ataupun dihitung
        // method replaceAll -> [A-Za-z !,?._'@]+, diganti dengan spasi
        String[] splitString = (s.replaceAll("[A-Za-z !,?._'@]+,", "").split("[\\s!,?._'@]+"));
        System.out.println(splitString.length);
        
        for (String string : splitString) {
        	System.out.println(string);
        	}
        }
	}