package latihan_pbo.tugas_4;

public class persegi extends BangunDatar {

    public persegi(double sisi) {
        super(sisi);
    }

    @Override
    public double hitungLuas() {
        return getVarA() * getVarA(); 
    }

    @Override
    public void tampilkan() {
        System.out.println("Persegi");
        System.out.println("Sisi: " + getVarA()); 
        System.out.println("Luas: " + hitungLuas());
    }
}