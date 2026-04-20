package latihan_pbo.latihan_5;

public class MenuItem extends Menu {
    public MenuItem(String nama, double harga) {
        super(nama, harga);
    }

    @Override
    public double hitungTotal(int jumlah) {
        return getHarga() * jumlah; 
    }
}