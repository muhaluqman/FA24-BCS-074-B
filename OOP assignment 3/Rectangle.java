package week_2_after_mids;

public class Rectangle extends Shape2D{
    double length;
    double width;
    Point topLeftCorner=new Point();
    Rectangle(String name, double x, double y)
    {
        super(name);

        this.topLeftCorner.setX(x);
        this.topLeftCorner.setY(y);
    }
    double area(){
        return length*width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getWidth() {
        return width;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getLength() {
        return length;
    }
    public String toString(){
        return super.toString() + "\nArea: " + area() + "\nWidth: " + width + "\nLength: " + length;
    }

    @Override
    public void draw() {
        System.out.println("Draw method of rectangle");
    }
}
