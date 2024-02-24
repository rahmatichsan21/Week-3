import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inisialisasi produk
        Produk[] menu = {
            new Produk("Nasi Goreng", 15000, 0, 10),
            new Produk("Mie Goreng", 12000, 0, 10),
            new Produk("Ayam Goreng", 20000, 0, 10)
        };

        // Memilih menu
        boolean pesanLagi = true;
        while (pesanLagi) {
            System.out.println("Menu Makanan:");
            for (int i = 0; i < menu.length; i++) {
                System.out.println((i + 1) + ". " + menu[i].getNamaMakanan() + " - Rp" + menu[i].getHarga() + "(Stok : - "  + menu[i].getStok() + ")");
            }

            System.out.print("Pilih menu (nomor): ");
            int pilihan = scanner.nextInt() - 1;
            scanner.nextLine(); // Membersihkan newline

            System.out.print("Jumlah yang dipesan: ");
            int jumlah = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            if (jumlah > menu[pilihan].getStok()) {
                System.out.println("Stok " + menu[pilihan].getNamaMakanan() + " tidak mencukupi.");
            } else {
                menu[pilihan].setJumlah(jumlah);
                menu[pilihan].kurangiStok(jumlah);

                System.out.print("Pesan lagi? (y/n): ");
                String jawab = scanner.nextLine();
                pesanLagi = jawab.equalsIgnoreCase("y");
            }
        }

        // Menampilkan pesanan
        System.out.println("Pesanan:");
        int totalBayar = 0;
        for (Produk item : menu) {
            if (item.getJumlah() > 0) {
                int harga = item.getTotalHarga();
                System.out.println(item.getNamaMakanan() + " - " + item.getJumlah() + " x Rp" + harga);
                totalBayar += harga;
            }
        }
        System.out.println("Total Bayar: Rp" + totalBayar);

        scanner.close();
    }
}
