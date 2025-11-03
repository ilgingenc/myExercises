package LinkedList4;

public class TekYönlüListeYapisi {
    Node head = null;
    Node tail = null;

    void basaekle(int x) {
        Node eleman = new Node();
        eleman.data = x;

        if (head == null) {
            eleman.next = null;
            head = eleman;
            tail = eleman;
            System.out.println("listeye ilk eleman eklendi.");
        } else {
            eleman.next = head;
            head = eleman;
            System.out.println("listeye eleman eklendi.");
        }
    }

    void sonaekle(int x) {
        Node eleman = new Node();
        eleman.data = x;

        if (head == null) {
            eleman.next = null;
            head = eleman;
            tail = eleman;
            System.out.println("listeye ilk eleman eklendi.");
        } else {
            eleman.next = null;
            tail.next = eleman;
            tail = eleman;
        }

    }

    void bastansil(){
        if (head==null){
            System.out.println("liste yapısı boş.");
        }
        else if (head.next==null){
            head = null;
            tail= null;
            System.out.println("listedeki tek eleman silindi.");
        }
        else{
            head=head.next;
            System.out.println("baştaki eleman silindi.");
        }
    }

    void sondansil(){
        if (head==null){
            System.out.println("liste yapısı boş.");
        }
        else if (head.next==null){
            head = null;
            tail= null;
            System.out.println("listedeki tek eleman silindi.");
        }
        else{
            Node temp = head;

            while (temp.next != tail) {
                temp = temp.next;
            }

            System.out.println("Silinen eleman: " + tail.data);
            temp.next = null;
            tail = temp;
        }
    }


    void yazdir() {
        if (head == null) {
            System.out.println("liste yapısı boş.");
        } else {
            Node temp = head;
            System.out.print("baş->");
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.print("son");
        }
    }
}
