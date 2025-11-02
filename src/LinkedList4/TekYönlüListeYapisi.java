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

    void sonekle(int x) {
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
    void arayaEkle(int indis ,int x){
        Node eleman = new Node();
        eleman.data=x;
        if (head==null && indis==0){
            eleman.next=null;
            head=eleman;
            tail=eleman;
            System.out.println("listeye ilk eleman eklendi.");
        }
        else if (head!=null && indis==0){
            eleman.next=head;
            head=eleman;
            System.out.println(indis+ "indisinci sıraya yeni eleman eklendi.");
        }
        else {

        }
    }

    void yazdir() {
        if (head == null){
            System.out.println("liste yapısı boş.");
        }
        else{
            Node temp = head;
            System.out.print("baş->");
            while(temp != null){
                System.out.print(temp.data + " -> ");
                temp=temp.next;
            }
            System.out.print("son");
        }
    }
}
