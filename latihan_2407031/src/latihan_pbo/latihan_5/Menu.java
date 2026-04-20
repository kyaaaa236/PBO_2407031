package latihan_pbo.latihan_5;

public class Menu {
    private String nama;
    private double harga;

    public Menu(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() { return nama; }
    public double getHarga() { return harga; }

    public double hitungTotal(int jumlah) {
        return 0;
    }
}