public class Produk {
    private String namaMakanan;
    private int harga;
    private int jumlah;
    private int stok;
    
    public Produk(String namaMakanan, int harga, int jumlah, int stok) {
        this.namaMakanan = namaMakanan;
        this.harga = harga;
        this.jumlah = jumlah;
        this.stok = stok;
    }
    
    public String getNamaMakanan() {
        return namaMakanan;
    }
    
    public int getHarga() {
        return harga;
    }
    
    public int getJumlah() {
        return jumlah;
    }
    
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
    public int getStok() {
        return stok;
    }
    
    public void kurangiStok(int jumlah) {
        stok -= jumlah;
    }
    
    public int getTotalHarga() {
        return harga * jumlah;
    }
}
