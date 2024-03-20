package lab4;

//Wap in Java to create a class distance having data members feet and inches. Use constructors and functions to
// initialize feet and inches , and convert feet to inches and inches to feet with functions.
public class Distance {
    public static void main(String[] args) {
        dist f=new dist(1,'f');
        f.convertFeettoInch();

    }
}

class dist {
    float feet;
    float inches;

    public dist() {
        this.feet = 0;
        this.inches = 0;
    }

    public dist(float f, float i) {
        this.feet = f;
        this.inches = i;
    }

    dist(float f, char ch) {
        if (ch == 'f') {
            this.feet = f;
            this.inches = 0;
        } else {
            this.feet = 0;
            this.inches = f;
        }
    }

    void convertFeettoInch(){
        inches=feet*12;
        System.out.println("Feet converted to inches: "+inches);
    }
    void convertInchtoFeet(){
        feet=inches*12;
        System.out.println("Inches converted to feet: "+feet);
    }

}
