import java.util.Scanner;
class Circle{
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
    public double calculatePerimeter(){
        return 2*Math.PI*radius;
    }

}
class Rectangle{
    private double length;
    private double width;
    public Rectangle(double length,double width){
        this.length = length;
        this.width=width;
    }
   public double calculateArea(){
    return length*width;
   }
    public double calculatePerimeter() {
        return 2*(length+width);
    }

}
public class CircleRectangleMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 for circle and 2 for rectangle : ");
        int z = input.nextInt();
        if(z==1) {
            System.out.println("Enter radius of circle : ");
            Circle c1 = new Circle(7);
            double circleArea = c1.calculateArea();
            double circlePerimeter = c1.calculatePerimeter();
            System.out.println("Area of circle : "+circleArea+"\n"+" Perimeter of circle : "+circlePerimeter);
        }
        else if(z==2){
            Rectangle r1 = new Rectangle(4, 3);
            double rectangleArea = r1.calculateArea();
            double rectanglePerimeter = r1.calculatePerimeter();

            System.out.println("Area : "+rectangleArea+"\nPerimeter : "+rectanglePerimeter);
        }
        else {
            System.out.println("Invalid input");
        }
    }
}
