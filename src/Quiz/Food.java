package Quiz;

public class Food {
    protected String name;
    protected double price;

    public Food(String name, double price){
        this.price=price;
        this.name=name;
    }
    public String getInfo(){
        return ("name: "+name + "price: "+price);
    }

    public void describe() {
        System.out.println("This is a food item: " + getInfo());
    }
}
