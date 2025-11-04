package Encapsulation;

public class Book {
   public String name,author,publisher;
    public int numberOfPage;
    Book(String name, int numberOfPage,String author,String publisher){
        this.author=author;
        this.name=name;
        this.publisher=publisher;
        if (numberOfPage<1){
            this.numberOfPage=10;
        }
        else {
            this.numberOfPage=numberOfPage;
        }

        }
    public void pageSize(){
        System.out.println(numberOfPage);
    }
}
