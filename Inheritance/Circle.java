public class Circle {
    private double Radius;

    public Circle(double radius) {
        if(radius > 0) {
            Radius = radius;
        }
        else{
            Radius = 0;
        }
    }

    public double getRadius() {
        return Radius;
    }

    public double getArea() {
        double Area = Radius * Radius * Math.PI;
        return Area;
    }


public class Cylinder extends Circle{
    double Height;

    public Cylinder(double radius, double height) {
        super(radius);
        if (height > 0) {
            Height = height;
        }
        else{
            Height = 0;
        }
    }

    public double getHeight() {
        return Height;
    }

    public double getVolume(){
        double Volume = getArea() * getHeight();
        return Volume;
    }
}

public class Main{

    public static void main(String[] args) {

            Circle circle = new Circle(3.75);

            System.out.println("Circle.Radius = " + circle.getRadius());
        
            System.out.println("Circle.Area = " + circle.getArea());
        
            Cylinder cylinder = new Cylinder(5.55, 7.25);
        
            System.out.println("Cylinder.Radius = " + cylinder.getRadius());
        
            System.out.println("Cylinder.Height = " + cylinder.getHeight());
        
            System.out.println("Cylinder.Area = " + cylinder.getArea());
        
            System.out.println("Cylinder.Volume = " + cylinder.getVolume());
         
        }
 }
}