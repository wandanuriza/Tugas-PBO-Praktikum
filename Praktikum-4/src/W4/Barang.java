package W4;

public class Barang {
	String kode_barang;
	String nama_barang;
	private int stok;

public Barang(String kode, String nama, int stk) {
	kode_barang = kode;
	nama_barang = nama;
	stok = stk;
	}

public int getStok() {
	return stok;
	}

public void addStok(int stok) {
	this.stok += stok;
	}
}