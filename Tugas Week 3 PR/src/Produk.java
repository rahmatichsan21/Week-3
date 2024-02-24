
public class Produk {
	private String namaMakanan;
	private int Harga;
	private int Jumlah;
	private int Stok;
	
	public Produk(String namaMakanan,int Harga, int Jumlah, int Stok) {
		this.namaMakanan = namaMakanan;
		this.Harga = Harga;
		this.Jumlah = 0;
		this.Stok = 100;
	}
	
	public String getnamaMakanan() {
		return namaMakanan;
	}
	
	public int getHarga() {
		return Harga;
	}
	
	public int getJumlah() {
		return Jumlah;
	}
	
	public void setJumlah() {
		this.Jumlah += Jumlah;
	}
	
	public int getStok() {
		return Stok;
	}
	
	public void setStok() {
		this.Stok -= Jumlah;
	}
	
	public int gettotalHarga() {
		return Harga * Jumlah;
	}
}
