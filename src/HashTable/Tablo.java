package HashTable;

public class Tablo {
    Node dizi[];
    int size;

    public Tablo(int size) {
        this.size = size;
        dizi = new Node[size];
        for (int i=0;i<size;i++){
            dizi[i]=new Node();
        }
    }
}
