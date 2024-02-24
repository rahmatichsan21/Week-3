public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant menu = new Restaurant();

        Makanan balaBala = new Makanan("Bala-Bala", 1_000, 20);
        menu.tambahMenuMakanan(balaBala);

        Makanan gehu = new Makanan("Gehu", 1_000, 20);
        menu.tambahMenuMakanan(gehu);

        Makanan tahu = new Makanan("Tahu", 1_000, 0);
        menu.tambahMenuMakanan(tahu);

        Makanan molen = new Makanan("Molen", 1_000, 20);
        menu.tambahMenuMakanan(molen);

        menu.tampilMenuMakanan();
    }
}
