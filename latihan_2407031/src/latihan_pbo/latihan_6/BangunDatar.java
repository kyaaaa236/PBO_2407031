package latihan_pbo.latihan_6;

public abstract class BangunDatar {
    private String nama;

    public BangunDatar (String nama){
        this.nama = nama;
    }

    //abstract method
    abstract double hitungLuas();
    abstract double hitungKeliling();

    public void Display(){
        System.out.println("Ini adalah: " + nama);
    }   
}
