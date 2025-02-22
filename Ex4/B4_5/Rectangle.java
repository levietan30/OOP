package Ex4.B4_5;

public class Rectangle extends Shape{
    double width = 1.0;
    double length = 1.0;
    public Rectangle(){
        super();

    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color ,boolean filled ){
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth() {

        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width * length;

    }
    public double getPerimeter(){
        return 2*width+2*length;
    }
    public String toString(){
        return "Rectangle[Shape[color="+ color + ", filled=" + filled + ",] width=" + width + ", length=" + length + "]";
    }

}
