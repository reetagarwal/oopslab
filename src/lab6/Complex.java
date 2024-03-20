package lab6;

public class Complex {
    double real, img;
    public Complex() {
        this.real = 0;
        this.img = 0;
    }
    public Complex(double real, double img) {
        this.real = real;
        this.img = img;
    }
    public void swap() {
        double temp = real;
        real = img;
        img = temp;
    }
    public Complex sum(Complex c) {
        double newReal = this.real + c.real;
        double newImg = this.img + c.img;
        return new Complex(newReal, newImg);
    }
    public void display() {
        System.out.println(real + " + " + img + "i");
    }
    public static void main(String[] args) {
        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(1, 2);
        System.out.println("Before swapping:");
        c1.display();
        c2.display();
        c1.swap();
        System.out.println("After swapping c1:");
        c1.display();
        c2.display();
        Complex c3 = c1.sum(c2);
        System.out.println("Sum of c1 and c2:");
        c3.display();
    }
}
