package Quiz;

public class Dessert extends Food{
    private boolean containsSugar;
    public Dessert(String name,double price,boolean containsSugar){
        super(name,price);
        this.containsSugar=containsSugar;
    }
    public void describe() {
        System.out.print("Dessert: " + getInfo());
        if (containsSugar) {
            System.out.println(" (with sugar)");
        } else {
            System.out.println(" (sugar free)");
        }
}
}
