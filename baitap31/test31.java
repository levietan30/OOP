package baitap31;

public class test31 {
    public static void main(String[] args) {
        MyComplex c1 = new MyComplex(3.1,4.05);
        MyComplex c2 = new MyComplex(2.0,-1.5);
        System.out.println("c1: "+ c1);
        System.out.println("c2: "+ c2);
        System.out.println("c1 is real? "+c1.isReal());
        System.out.println("c1 is imaginary? "+ c1.isImaginary());
        MyComplex sum=c1.addNew(c2);
        System.out.println("sum of c1 and c2: "+sum);
        c1.addInto(c2);
        System.out.println("c1 after adding c2: "+c1);
    }
}
