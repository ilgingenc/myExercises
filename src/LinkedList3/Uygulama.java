package LinkedList3;

public class Uygulama {
    public static void main(String[] args) {
        TekYonluListeYapisi list = new TekYonluListeYapisi();
        list.basaEkle(10);
        list.basaEkle(20);
        list.basaEkle(30);
        list.basaEkle(40);

        System.out.println(list.head.data);

    }
}
