class AreaPerimeter{
    private double length;
    private double width;
    private double radius;

    public AreaPerimeter(double length, double width) {
        this.length = length;
        this.width = width;
        rectangleData();
    }
    public AreaPerimeter(double radius) {
        this.radius = radius;
        circleData();

    }

    public void rectangleData(){
        System.out.println("Area of Rectangle : "+(length*width));
        System.out.println("Prmimeter of rectangle : "+(2*(length+width)));
    }

    public void circleData() {
        System.out.println("Area of circle : "+(3.1416*radius*radius));
        System.out.println("Perimeter of circle : "+(2*3.1416*radius));
    }


}


public class RectangleCircle {
    public static void main(String[] args) {
        AreaPerimeter Ap1 = new AreaPerimeter(8.0,5.0);
        AreaPerimeter Ap2 = new AreaPerimeter(4.0);
    }
}
/*
Rectangle & Circle
Classes to calculate area and perimeter.   method overload use koralam
*/