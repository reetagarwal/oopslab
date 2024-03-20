package lab4;

//Wap in java to demonstrate function overloading and constructor overloading to find area of sphere , area of
// cylinder and area of cuboid.
import java.util.Scanner;
public class Overloading {
    public static void main(String[] args) {
        Shape a=new Shape();
        a.area(1,2);
        a.area(1,2,3);
        a.area(4);
    }
}
class Shape{
    int height;
    int radius;
    int length;
    int breadth;


    public Shape() {
        this.height=0;
        this.radius=0;
        this.length=0;
        this.breadth=0;
    }
    Shape(int h,int r){
        this.height=h;
        this.radius=r;
    }
    Shape(int r){
        this.radius=r;
    }
    Shape(int h,int l,int b){
        this.height=h;
        this.length=l;
        this.breadth=b;
    }


    // Function to calculate area of a sphere
    void area(double radius) {
        double sphere = 4 * Math.PI * Math.pow(radius, 2);
        System.out.println("Area of sphere: " + sphere);
    }

    // Function to calculate area of a cylinder
    void area(double radius, double height) {
        double cylinder= 2 * Math.PI * radius * (radius + height);
        System.out.println("Area of cylinder: "+cylinder );
    }

    // Function to calculate area of a cuboid
    void area(double length, double width, double height) {
        double cuboid= 2 * (length * width + length * height + width * height);
        System.out.println("Area of cuboid: "+cuboid );
    }

}