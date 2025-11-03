package LinkedList4;

public class Uygulama {
    public static void main(String[] args) {
    TekYönlüListeYapisi list= new TekYönlüListeYapisi();
    list.basaekle(5);
    list.basaekle(6);
    list.basaekle(7);
    list.sonaekle(9);

    list.yazdir();;
    }
}
