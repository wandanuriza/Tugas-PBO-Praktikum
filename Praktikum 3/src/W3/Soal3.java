package W3;
import java.util.*;
public class Soal3 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);   
		int A = input.nextInt();		// baca inputan disimpan sebagai nilai A
		String operator = input.next(); // baca inputan disimpan sebagai nilai operator
		int B = input.nextInt();		// baca inputan disimpan sebagai nilai B
		int result; // variabel buat menampung hasil operasi matematika
		
		if(1<=A && B<=1000) {    // mengecek apakah A dan B sudah sesuai aturan
			switch (operator) {  // menjalankan method sesuai operator yang dipilih
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
				System.out.println(result);
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
				System.out.println("Tidak Sesuai Aturan"); // jika nilai A dan B tidak memenuhi
				}
		}
	}