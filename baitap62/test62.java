package baitap62;

public class test62 {
    public static void main(String[] args) {
        GeometricObject c1= new Circle(5.0);
        System.out.println(c1);
        System.out.println("Area: "+c1.getArea());
        System.out.println("Perimeter: "+c1.getPerimeter());

        GeometricObject r1= new Rectangle(4.0, 7.0);
        System.out.println(r1);
        System.out.println("Area: "+r1.getArea());
        System.out.println("Perimeter: "+r1.getPerimeter());
    }
}
