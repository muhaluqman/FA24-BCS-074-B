package week_2_after_mids;

public class ShapeUtils {
    ShapeUtils() {

    }
    public void printShape(Shape[] shape) {
        for (int i = 0; i < shape.length; i++) {
            System.out.println(shape[i]);
            shape[i].draw();
        }
    }
    public void increaseRectangleLength(Shape[] shape, double length) {
        for (int i = 0; i < shape.length; i++) {
            if(shape[i] instanceof Rectangle) {
                ((Rectangle) shape[i]).length = ((Rectangle) shape[i]).length + length;
            }
        }
    }
    public boolean IntersectsRectangle(Shape[] shape, Rectangle rectangle) {
        for (int i = 0; i < shape.length; i++) {
            if(shape[i] instanceof Rectangle) {
                Point stopLeftCorner=new Point();
                stopLeftCorner=((Rectangle) shape[i]).topLeftCorner;
                Point stopRightCorner=new Point();
                stopRightCorner.setX(((Rectangle) shape[i]).topLeftCorner.getX()+((Rectangle) shape[i]).length);
                stopRightCorner.setY(((Rectangle) shape[i]).topLeftCorner.getY());
                Point sbottomLeftCorner=new Point();
                sbottomLeftCorner.setX(((Rectangle) shape[i]).topLeftCorner.getX());
                sbottomLeftCorner.setY(((Rectangle) shape[i]).topLeftCorner.getY()+((Rectangle) shape[i]).width);
                Point sbottomRightCorner=new Point();
                sbottomRightCorner.setX(sbottomRightCorner.getX()+((Rectangle) shape[i]).length);
                sbottomRightCorner.setY(sbottomLeftCorner.getY());
                Point rtopLeftCorner=new Point();
                rtopLeftCorner=((Rectangle) shape[i]).topLeftCorner;
                Point rtopRightCorner=new Point();

                rtopRightCorner.setX(rectangle.topLeftCorner.getX()+((Rectangle) shape[i]).length);
                rtopRightCorner.setY((rectangle.topLeftCorner.getY()));
                Point rbottomLeftCorner=new Point();
                rbottomLeftCorner.setX((rectangle.topLeftCorner.getX()));
                rbottomLeftCorner.setY((rectangle.topLeftCorner.getY()+(rectangle.width)));
                Point rbottomRightCorner=new Point();
                rbottomRightCorner.setX(rbottomRightCorner.getX()+(rectangle.length));
                rbottomRightCorner.setY(rbottomLeftCorner.getY());
                if(rtopRightCorner.getX()<stopLeftCorner.getX()&&rtopRightCorner.getX()>stopLeftCorner.getX()&&rtopRightCorner.getY()<stopLeftCorner.getY()&&rtopRightCorner.getY()>sbottomLeftCorner.getY()) {
                    return true;
                }else if((rtopLeftCorner.getX() < stopLeftCorner.getX()) && (rtopLeftCorner.getX() > stopLeftCorner.getX()) && (rtopLeftCorner.getY() < stopLeftCorner.getY()) && (rtopLeftCorner.getY() > sbottomLeftCorner.getY()))
                {
                    return true;
                }else if(rbottomRightCorner.getX()<stopLeftCorner.getX()&&rbottomRightCorner.getX()>stopLeftCorner.getX()&&rbottomRightCorner.getY()<stopLeftCorner.getY()&&rbottomRightCorner.getY()>sbottomLeftCorner.getY()){
                    return true;
                }else if(rbottomLeftCorner.getX()<stopLeftCorner.getX()&&rbottomLeftCorner.getX()>stopLeftCorner.getX()&&rbottomLeftCorner.getY()<stopLeftCorner.getY()&&rbottomLeftCorner.getY()>sbottomLeftCorner.getY()){
                    return true;
                }else{
                    return false;
                }
            }
        }
        return false;
    }
}
