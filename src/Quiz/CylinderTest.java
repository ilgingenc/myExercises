package Quiz;

public class CylinderTest {
    public static void main(String[] args) {

        Cylinder c1=new Cylinder();
        System.out.println("After creating first object:"+c1.getNoOfCylinder());
        System.out.println("Radius:" + c1.r + "Height:" + c1.h);

        Cylinder c2 =new Cylinder(10,20);
        System.out.println("Radius:" + c2.r + "Height:" + c2.h);
        System.out.println("Base area:"+c2.calculateBaseArea());
        System.out.println("Surface Area: " + c2.calculateSurfaceArea());
        System.out.println("Volume: " + c2.calculateVolume());
        System.out.println("Mass:"+c2.calculateMass(5.12));
        System.out.println("Object number:"+c2.getNoOfCylinder());
    }
}
