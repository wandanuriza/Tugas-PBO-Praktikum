package W3;

public class Soal3 {
	public static void main(String[] args) {
        // TODO code application logic here
        int A=100, B=30;
        int jumlah = A+B;
        int kurang = A-B;
        int kali = A*B;
        float bagi = (float)A/B;
        int modulo = A%B;
     
        System.out.println("Penjumlahan: "+A+" + "+B+" = "+jumlah);
        System.out.println("Pengurangan: "+A+" - "+B+" = "+kurang);
        System.out.println("Perkalian: "+A+" * "+B+" = "+kali);
        System.out.println("Pembagian: "+A+" / "+B+" = "+bagi);
        System.out.println("Modulo: "+A+" mod "+B+" = "+modulo);
    }

}
