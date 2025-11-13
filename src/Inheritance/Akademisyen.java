package Inheritance;

public class Akademisyen extends Calisan {
    String bolum, gorevler;
    String dersler;

    public void giris() {
        System.out.println("derse girildi.");}

        public Akademisyen(String adSoyad, String eposta, String telefon, String bolum, String gorevler, String dersler)
        {
            super(adSoyad, eposta, telefon);
            this.bolum = bolum;
            this.gorevler = gorevler;
            this.dersler = dersler;
        }
    }

