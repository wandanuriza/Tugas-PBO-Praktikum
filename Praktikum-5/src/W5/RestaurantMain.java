package W5;

public class RestaurantMain {
	public static void main(String[] args) {
		menuMakanan menu = new menuMakanan();        // menu sebagai menuMakanan
		
		menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
		menuMakanan.nextId();
		menu.tambahMenuMakanan("Gehu", 1_000, 20);
		menuMakanan.nextId();
		menu.tambahMenuMakanan("Tahu", 1_000, 0);
		menuMakanan.nextId();
		menu.tambahMenuMakanan("Molen", 1_000, 20);
		menu.tampilMenuMakanan();
		}
	}
