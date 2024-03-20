package assignment.Calculator;

//Write a program in java to create a package calculator having a class calculation. The calculation
//class contains all operations related to calculator like add(), sub(), mul(), div() etc. Now create another
//package called Test having a class Test_calculator. Import the package calculator. Now create an
//object of calculation class in Test_calculator class and call all the calculator functions

public class Calculation{
    int a,b;

    public Calculation(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void add(){
        int sum;
        sum=a+b;
        System.out.println("sum is:"+sum);
    }
    public void sub() {
        int sub;
        sub = a - b;
        System.out.println("subtraction is:" + sub);
    }
    public void mul(){
        int mul;
        mul=a*b;
        System.out.println("multiplication is:"+mul);
    }
    public void div(){
        int div;
        div=a/b;
        System.out.println("division is:"+div);
    }
}
