package W3;
import java.util.*;
public class Soal3 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);  
		int A = input.nextInt();		// baca inputan disimpan sebagai nilai A
		String operator = input.next(); // baca inputan disimpan sebagai nilai operator
		int B = input.nextInt();		// baca inputan disimpan sebagai nilai B
		int result; 					// variabel buat menampung hasil operasi 
		
		// mengecek apakah A >= 1 dan B <= 1000
		if(1<=A && B<=1000) { 
			    // menjalankan method sesuai operator yang dipilih
				switch (operator) {  
				case "+":
					result= A+B;
					System.out.println(result);
					break;
				case "-":
					result= A-B;
					System.out.println(result);
					break;
				case "*":
					result= A*B;
					System.out.println(result);
					break;
				case "/":
					result= A/B;
					if (A % B == 0) {
						System.out.println(result);
					} else {
						System.out.println("A tidak habis dibagi B");
					}
					
					break;
				case "%":
					result= A%B;
					System.out.println(result);
					break;
					default:
						System.out.println("Operator tidak tersedia"); // jika operator yang dimasukan tidak sesuai
						break;
						}
		} else {
			System.out.println("Tidak Sesuai Batasan Nilai A dan B"); // jika nilai A dan B tidak memenuhi
			}
		}
	}