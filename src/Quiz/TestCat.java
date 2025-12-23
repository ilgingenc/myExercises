package Quiz;

public class TestCat {
    public static void main(String[] args) {
        Cat c1 =new Cat();
        Cat c2 =new Cat(5,45,"lucy");

        c1.move();;
        c2.move2(20);

        c1.status();
        c2.status();
    }
}
