package W3;
import java.io.*;
import java.util.*;
import java.util.regex.*; 

public class Soal1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine(); // proses pembacaan input bertipe string
        scan.close();
    
        // method string split dan method string replaceAll 
        String[] splitString = (s.replaceAll("[A-Za-z !,?._'@]+,", "").split("[\\s!,?._'@]+"));
        System.out.println(splitString.length);
        
        for (String string : splitString) {
        	System.out.println(string);     // proses cetak string
        	}
        }
	}