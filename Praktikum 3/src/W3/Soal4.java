package W3;

import java.util.Scanner;

public class Soal4 {
	public static final int gajiPokok = 500000;
	public static final int hargaItem = 50000;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double gaji,item;
		item = input.nextInt();
		
		if(item > 80) {//35%
			gaji = ((item*hargaItem)*0.35)+gajiPokok;
		}else if(item >= 40) {//25%
			gaji = ((item*hargaItem)*0.25)+gajiPokok;
		}else if(item < 15) {// -15%
			gaji = gajiPokok - (((15-item)*hargaItem)*0.15);
		}else {
			gaji = ((item*hargaItem)*0.10)+gajiPokok;
		}
		
		System.out.println(gaji);
	}
}