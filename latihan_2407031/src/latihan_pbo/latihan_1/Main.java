package latihan_pbo.latihan_1;

class Cafe{
    String Nama;
    String Alamat;

    Cafe(String Nama, String Alamat){
        this.Nama = Nama;
        this.Alamat = Alamat;
        System.out.println("nama cafenya adalah " + this.Nama);
        System.out.println("alamatnya ada di daerah: " + this.Alamat);
    }

    void bukaCafe1() {
        System.out.println(this.Nama + " cafe buka jam 14.00");
    }

    public String getNama(){
        return Nama;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public String getAlamat(){
        return Alamat;
    }

    public void setAlamat(String Alamat){
        this.Alamat = Alamat;
    }
}

//kelas main adalah untuk menampilkan program yang akan kita buat
public class Main {
    public static void main(String[] args) {

        System.out.println("============cafe1===============");
        Cafe cafe1 = new Cafe("arumdalu", "margadadi");
        cafe1.bukaCafe1();

        System.out.println("============cafe2===============");
        Cafe cafe2 = new Cafe("kozi", "jatibarang");
        cafe2.bukaCafe1();
    }
}