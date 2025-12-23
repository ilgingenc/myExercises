package Quiz;

public class Cat {
   public int x;
   public double direction;
   String name;

   public Cat(){
       this(0,180.0,"Sofya");
   }

   public Cat(int x,double direction,String name){
        this.x = x;
        this.direction = direction;
        this.name = name;
    }

    public void move(){
       x+=20;
    }

    public void move2(int a){
   x+=a;
    }

    public void turn(double angle){
       direction+=angle;
    }

    public void status(){
        System.out.println("name:"+ name + "x:"+x+"direction"+ direction);
    }
}
