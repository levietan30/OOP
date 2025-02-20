package baitap13;

public class Rectangle {
    private float length;
    private float width;
    public Rectangle()
    {
        length=1.0f;
        width=1.0f;
    }
    public Rectangle(float l, float w)
    {
        length=l;
        width=w;
    }

    public float getLength() {
        return length;
    }
    public void setLength(float l)
    {
        length=l;
    }
    public float getWidth() {
        return width;
    }
    public void setWidth(float w)
    {
        width=w;
    }
    public double getArea()
    {
        return length*width;
    }
    public double getperimeter()
    {
        return 2*(length+width);
    }
    public String toString()
    {
        return "Rectangle[length="+this.length+",width="+this.width+"]";
    }
}
