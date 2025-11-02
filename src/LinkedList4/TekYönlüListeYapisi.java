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
    void sonekle(int x){
        Node eleman= new Node();
        eleman.data= x;

        if (head==null){
            eleman.next=null;
            head=eleman;
            tail=eleman;
            System.out.println("listeye ilk eleman eklendi.");
        }
        else {
            eleman.next=null;
            tail.next=eleman;
            tail=eleman;
        }
    }
}
