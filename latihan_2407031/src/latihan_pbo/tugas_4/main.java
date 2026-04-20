package latihan_pbo.tugas_4;

public class main {
    public static void main(String[] args) {
        BangunDatar[] kumpulanBangun = new BangunDatar[4];

        kumpulanBangun[0] = new BangunDatar(0, 0); 
        kumpulanBangun[1] = new persegi(5.0);
        kumpulanBangun[2] = new PersegiPanjang(6.0, 4.0);
        kumpulanBangun[3] = new Segitiga(10.0, 5.0);

        for (BangunDatar b : kumpulanBangun) {
            b.tampilkan();
            System.out.println("--------------------");
        }
    }
}