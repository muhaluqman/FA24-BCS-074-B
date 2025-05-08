package week_2_after_mids;

public class Point {
    private double x;
    private double y;
    Point(){

    }
    Point(double x, double y){
        this.x=x;
        this.y=y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    void setX(double x){
        this.x=x;
    }
    void setY(double y){
        this.y=y;
    }
}
