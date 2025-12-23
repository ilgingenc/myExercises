package TekYonluDaireselListe;

public class TekYonluDaireselListe {
    Node head = null;
    Node tail = null;

    void basaEkle(int data) {
        Node eleman = new Node(data);
        if (head == null) {
            head = eleman;
            tail = eleman;
            tail.next = head;
        } else {
            eleman.next = head;
            head = eleman;
            tail.next = head;
        }
    }

    void sonaEkle(int data) {
        Node eleman = new Node(data);
        if (head == null) {
            head = eleman;
            tail = eleman;
            tail.next = head;
        } else {
            tail.next = eleman;
            tail = eleman;
            tail.next = head;
        }
    }

    void bastanSilme() {
        if (head == null) {
            System.out.println("silinecek eleman yok.");
            return;
        }
        else if(head==tail){
            head=null;
            tail=null;
        }
        else{
            head=head.next;
            tail.next=head;
        }
    }
    void sondanSilme(){
        if (head == null) {
            System.out.println("silinecek eleman yok.");
            return;
        }
        else if(head==tail){
            head=null;
            tail=null;
        }
        else{
            Node temp=head;
            while (temp.next!=tail){
                temp=temp.next;
            }
            tail=temp;
            tail.next=head;
        }
    }

    void yazdir() {
        Node temp = head;
        do {
            System.out.println(temp.data + "->");
            temp = temp.next;
        }
        while (temp != head);
    }
}
