public class Penjualan {
    private String namaMakanan;
    private int totalHarga;
    private int jumlah;
    private int sisaStok;
    
    public Penjualan(String namaMakanan, int totalHarga, int sisaStok) {
        this.namaMakanan = namaMakanan;
        this.totalHarga = totalHarga;
        this.sisaStok = sisaStok;
    }
    
    public String getNamaMakanan() {
        return namaMakanan;
    }
    
    public int getTotalHarga() {
        return totalHarga;
    }
    
    public int getJumlah() {
        return jumlah;
    }
    
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
    public int getSisaStok() {
        return sisaStok;
    }
}
