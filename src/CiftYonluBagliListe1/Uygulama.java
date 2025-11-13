package CiftYonluBagliListe1;

public class Uygulama {
    public static void main(String[] args) {
            BagliListe list =new BagliListe();
            list.basaekle(10);
            list.basaekle(20);
            list.sonaekle(40);
            list.sonaekle(50);
            list.bastanSil();
            list.sondanSil();
            list.yazdir();
    }
}
