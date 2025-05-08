package week_2_after_mids;

public class Circle extends Shape2D{
    double radius;
    Point centre;
    Circle(String name){
        super(name);
    }
    void setRadius(double radius){
        this.radius = radius;
    }
    double getRadius(){
        return radius;
    }
    double area(){
        return Math.PI * radius * radius;
    }
    public String toString(){
        return super.toString() + "\nRadius: " + radius + "\nArea: " + area();
    }

    @Override
    public void draw() {
        System.out.println("Draw method of circle");
    }
}
