package CiftYonluBagliListe1;

public class BagliListe {
    Node head = null;
    Node tail = null;

    void basaekle(int data) {
        Node eleman = new Node(data);

        if (head == null) {
            head = eleman;
            tail = eleman;
        } else {
            eleman.next = head;
            head.prev = eleman;
            head = eleman; // head eklenen yeni eleman olsun diyoruz.
        }
    }

    void sonaekle(int data) {
        Node eleman = new Node(data);
        if (head == null) {
            head = eleman;
            tail = eleman;
        } else {
            tail.next = eleman;
            eleman.prev = tail;
            tail = eleman;
        }
    }

    void yazdir() {
        Node temp = head; //ilk elemanı en baş belirleyip listede gezicez.
        System.out.print("bas ->");
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next; //yeni tempi belirleyip temp yapıyoruz.
        }
        System.out.print("son");
    }


    void bastanSil() {
        if (head == null) {
            System.out.println("silinecek eleman yok. liste boş.");
        } else if (head.next == null) {
            head = null;
            tail = null;
        } else {
            head=head.next;
            head.prev = null;
        }
    }

    void sondanSil() {
        if (head == null) {
            System.out.println("silinecek eleman yok liste boş.");
        } else if (head.next == null) {
            head = null;
            tail = null;
        } else {
            tail=tail.prev;
            tail.next=null;

        }
    }
    //void arayaEkle(int data, int pozisyon) {
    //    Node eleman = new Node(data);
    //
    //    if (pozisyon == 0) { // başa ekleme
    //        basaekle(data);
    //        return; // burası önemli
    //    }
    //
    //    Node temp = head;
    //    int sayac = 0;
    //
    //    // ekleme yapmak istediğimiz pozisyona kadar ilerle
    //    while (temp != null && sayac < pozisyon - 1) {
    //        temp = temp.next;
    //        sayac++;
    //    }
    //
    //    if (temp == null) { // pozisyon listeden büyükse sona ekle
    //        sonaekle(data);
    //    } else {
    //        // elemanı araya ekle
    //        eleman.next = temp.next;
    //        if (temp.next != null) {
    //            temp.next.prev = eleman;
    //        }
    //        temp.next = eleman;
    //        eleman.prev = temp;
    //    }
    //}  burda if kısmını  whileın içine yazmam gerekmez mi
}

