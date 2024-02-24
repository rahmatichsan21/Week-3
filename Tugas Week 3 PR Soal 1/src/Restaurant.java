public class Restaurant {
    private Makanan[] daftarMenu;
    private static byte id=0;

    public Restaurant () {
        this.daftarMenu = new Makanan[10];
    }

    public void tambahMenuMakanan (Makanan makanan) {
        this.daftarMenu[id] = makanan;
        id++; 
    }

    public void tampilMenuMakanan () {
        for (int i=0; i<id; i++) {
            if(!isOutOfStock (i)) {
                System.out.println(daftarMenu[i].getNama() + "[" + daftarMenu[i].getStok() + "]" + "\tRp. " + daftarMenu[i].getHarga());
            }
        }
    }

    public boolean isOutOfStock (int id) {
        return daftarMenu[id].getStok() == 0;
    }
}
