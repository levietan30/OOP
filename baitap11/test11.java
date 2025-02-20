package baitap11;

public class test11 {
    public static void main(String[] args)
    {
        Circle c1=new Circle();
        System.out.println("The circle has radius of "+c1.getradius()+" and area of " + c1.getarea());
        Circle c2=new Circle(2.0);
        System.out.println("The circle has radius of "+c2.getradius()+" and area of "+c2.getarea());
    }
}

