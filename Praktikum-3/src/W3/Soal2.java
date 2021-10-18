package W3;
import java.util.Scanner;

public class Soal2 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=input.next();
            int x=input.nextInt();
            // %-15s --> artinya -15 spasi ke kanan untuk string
            // %03 --> artinya 3 spasi ke kiri untuk integer dimulai dari nol
            System.out.printf("%-15s%03d\n",s1,x); 
        }
        System.out.println("================================");
	}

}
