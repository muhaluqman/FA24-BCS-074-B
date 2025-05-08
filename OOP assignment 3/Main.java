package week_2_after_mids;

public class Main {
    public static void main(String[] args) {
        Shape shape;
        Shape3D shape3D;
        Shape2D shape2D;
        Circle circle=new Circle("Circle");
        circle.setRadius(33.5);
        System.out.println("Area of circle is: "+circle.area());
        Rectangle rectangle=new Rectangle("Rectangle",4.4,5.5);
        rectangle.setLength(68);
        rectangle.setWidth(44);
        Rectangle rectangle2=new Rectangle("Rectangle2",6.4,77);
        rectangle2.setLength(60);
        rectangle2.setWidth(45);
        System.out.println("Area of rectangle is: "+rectangle.area());
        Sphere sphere=new Sphere("Sphere",23.4);
        System.out.println("Area of sphere is: "+sphere.area());
        System.out.println("Volume of sphere is: "+sphere.volume());
        Cube cube=new Cube("Cube",44);
        System.out.println("Area of Cube is"+cube.area());
        System.out.println("Volume of Cube is"+cube.volume());
        Shape[] shape1 = new Shape[20];
        shape1[0]=circle;
        shape1[1]=rectangle;
        shape1[2]=sphere;
        shape1[3]=cube;
        shape1[4]=circle;
        shape1[5]=rectangle;
        shape1[6]=sphere;
        shape1[7]=cube;
        shape1[8]=circle;
        shape1[9]=rectangle;
        shape1[10]=sphere;
        shape1[11]=cube;
        shape1[12]=circle;
        shape1[13]=rectangle;
        shape1[14]=sphere;
        shape1[15]=cube;
        shape1[16]=circle;
        shape1[17]=rectangle;
        shape1[18]=sphere;
        shape1[19]=cube;
        ShapeUtils shapeUtils=new ShapeUtils();
        shapeUtils.printShape(shape1);
        shapeUtils.increaseRectangleLength(shape1, 22);
        System.out.println("--------After increase in length----------");
        shapeUtils.printShape(shape1);
        boolean state=shapeUtils.IntersectsRectangle(shape1, rectangle2);
        if(state==true){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }
    }

}
