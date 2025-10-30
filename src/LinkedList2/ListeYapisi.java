package LinkedList2;

public class ListeYapisi {
    Uygulama head=null;
    Uygulama tail=null;

    void ekle (int x){
        Uygulama eleman = new Uygulama();
        eleman.data=x;
        eleman.next=null;

        if(head==null){
            head=eleman;
            tail=eleman;
            System.out.println("liste oluşturuldu ilk eleman eklendi.");
        }
        else {
            tail.next=eleman;
            tail=eleman;
            System.out.println("listenin sonuna yeni bir eleman eklendi.");
        }
    }
    void yazdir(){
        if (head==null){
            System.out.println("liste yapısı boş.");
        }
        else
        {
            Uygulama temp= head;
            System.out.println(" baş");
            while(temp!=null){
                System.out.println(temp.data + "->");
                temp= temp.next;
            }
            System.out.println("son");
        }
    }

}
