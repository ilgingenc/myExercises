package Inheritance;

public class Calisan {
    String adSoyad, eposta;
    String telefon;

    public Calisan(String adSoyad, String eposta, String telefon) {
        this.adSoyad = adSoyad;
        this.eposta = eposta;
        this.telefon = telefon;
    }

    protected void giris() {
        System.out.println("çalışan giriş yaptı.");
    }


}
