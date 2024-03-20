package assignment;

//Write a program to create a class named shape. It should contain 2 methods- draw() and erase()
//which should print “Drawing Shape” and “Erasing Shape” respectively. For this class we have three
//sub classes- Circle, Triangle and Square and each class override the parent class functions- draw
//() and erase (). The draw() method should print “Drawing Circle”, “Drawing Triangle”, “Drawing
//Square” respectively. The erase() method should print “Erasing Circle”, “Erasing Triangle”, “Erasing
//Square” respectively. Create objects of Circle, Triangle and Square and observe the polymorphic
//nature of the class by calling draw() and erase() method using each object.
public class Sh {
    public static void main(String[] args) {
        Shape c=new Circle();
        c.draw();
        c.erase();
        Shape t=new Triangle();
        t.draw();
        t.erase();
        Shape sq = new Square();
        sq.draw();
        sq.erase();
    }
}

class Shape{
    void draw(){
        System.out.println("Drawing shape");
    }
    void erase(){
        System.out.println("Erasing Shape");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing circle");
    }
    void erase(){
        System.out.println("Erasing circle");

    }
}

class Triangle extends Shape{
    void draw(){
        System.out.println("Drawing triangle");
    }
    void erase(){
        System.out.println("Erasing triangle");

    }
}

class Square extends Shape{
    void draw(){
        System.out.println("Drawing square");
    }
    void erase(){
        System.out.println("Erasing square");

    }
}
