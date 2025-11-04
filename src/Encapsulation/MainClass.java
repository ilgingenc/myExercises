package Encapsulation;

public class MainClass {
    public static void main(String[] args) {
        Book b1 = new Book("kitap", 400, "yazar", "yayıncı");
        b1.setNumberOfPage(650);
        System.out.println(b1.getNumberOfPage());



    }
}
