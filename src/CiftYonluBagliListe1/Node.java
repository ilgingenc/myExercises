package CiftYonluBagliListe1;

public class Node {
    int data;
    Node prev;
    Node next;

    Node(int data){
        this.data=data;
        next=null;
        prev=null;
    }
}
