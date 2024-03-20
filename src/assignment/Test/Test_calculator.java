package assignment.Test;

//Write a program in java to create a package calculator having a class calculation. The calculation
//class contains all operations related to calculator like add(), sub(), mul(), div() etc. Now create another
//package called Test having a class Test_calculator. Import the package calculator. Now create an
//object of calculation class in Test_calculator class and call all the calculator functions

import assignment.Calculator.*;
public class Test_calculator {
    public static void main(String[] args) {
        Calculation c=new Calculation(25,5);
        c.add();
        c.sub();
        c.mul();
        c.div();
    }
}
