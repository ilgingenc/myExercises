package Polymorphism;

public class SiniflardaCokBicimlilik {
    public static void main(String[] args) {
        Sekil a= new Daire();
        a.ciz();
    }
}

class Sekil {
    public void ciz() {
        System.out.println("şekil çizdiriliyor.");
    }
}

class Daire extends Sekil {
    public void ciz() {
        System.out.println("daire çiziliyor.");
    }
}
