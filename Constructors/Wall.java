public class Wall {
    private double Width, Height;

    public Wall(){
        this(0, 0);
    }

    public Wall(double width, double height) {
        Width = width;
        Height = height;
    }

    public double getWidth() {
        return Width;
    }

    public void setWidth(double width) {
        if (width < 0){
            Width = 0;
        }
        else {
            Width = width;
        }
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(double height) {
        if (height < 0){
            Height = 0;
        }
        else {
            Height = height;
        }
    }

    public double getArea(){
        double Area = getWidth() * getHeight();
        return Area;
    }

    public static void main(String[] args){
        Wall obj1 = new Wall(5,4);

        System.out.println("Area = " + obj1.getArea());
        //obj1.setHeight(-1.5);
        System.out.println("Width = " + obj1.getWidth());
        System.out.println("Height = " + obj1.getHeight());
        System.out.println("Area = " + obj1.getArea());
    }
}
