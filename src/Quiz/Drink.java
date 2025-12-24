package Quiz;

public class Drink extends Food{
    private boolean cold;

    public Drink(String name, double price, boolean cold) {
        super(name, price);   // call Food constructor​
        this.cold = cold;
    }


    public void describe() {
        System.out.print("Drink: " + getInfo());
        if (cold) {
            System.out.println(" (served cold)");
        } else {
            System.out.println(" (served hot)");
        }
    }
}
