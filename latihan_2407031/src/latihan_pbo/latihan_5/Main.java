package latihan_pbo.latihan_5;

public class Main {
    public static void main(String[] args) {
        MenuItem ketoprak = new MenuItem("Ketoprak", 12000);
        MenuItem nasiGoreng = new MenuItem("Nasi Goreng", 15000);
        MenuItem esJeruk = new MenuItem("Es Jeruk", 8000);

        int jm1 = 3; // Ketoprak x 3
        int jm2 = 4; // Nasi Goreng x 4
        int jm3 = 5; // Es Jeruk x 5

        double total1 = ketoprak.hitungTotal(jm1);
        double total2 = nasiGoreng.hitungTotal(jm2);
        double total3 = esJeruk.hitungTotal(jm3);

        System.out.println(ketoprak.getNama() + " \t " + ketoprak.getHarga() + " x " + jm1 + " = " + total1);
        System.out.println(nasiGoreng.getNama() + " \t " + nasiGoreng.getHarga() + " x " + jm2 + " = " + total2);
        System.out.println(esJeruk.getNama() + " \t " + esJeruk.getHarga() + " x " + jm3 + " = " + total3);
        
        System.out.println("------------------------------------");
        System.out.println("Total Keseluruhan = " + (total1 + total2 + total3));
    }
}