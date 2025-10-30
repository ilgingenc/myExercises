package LinkedList;

public class MainSinifiLinked {
    public static void main(String[] args) {
        LinkedListTemelIslemler nesne1 = new LinkedListTemelIslemler();
        LinkedListTemelIslemler nesne2 = new LinkedListTemelIslemler();
        LinkedListTemelIslemler nesne3 = new LinkedListTemelIslemler();
        nesne1.sayi = 11;
        nesne2.sayi = 22;
        nesne3.sayi = 33;

        System.out.println(nesne1.sayi);
        System.out.println(nesne2.sayi);
        System.out.println(nesne3.sayi);

        nesne1.next = nesne2;
        nesne2.next = nesne3;
        nesne3.next = null;

        LinkedListTemelIslemler temp = nesne1;

        while (temp != null) {
            System.out.println(temp.sayi);
            temp=temp.next;
        }
    }
}
