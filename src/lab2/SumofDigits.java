package lab2;

//wap in java to find sum of digits of a number if the number is even or odd
// with the help of classes and obj

import java.util.*;

public class SumofDigits {
    int s;
    void digits(int a) {
        int sum = 0;

        // Loop through each digit and add it to the sum
        while (a != 0) {
            sum += a % 10;  // Get the last digit
            a /= 10;
        }
        s=sum;
    }

    void check() {

        if (s % 2 == 0) {
            System.out.println("The sum of the digits is even.");
        } else {
            System.out.println("The sum of the digits is odd.");
        }
    }

    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number.");
        int n=sc.nextInt();
        SumofDigits obj=new SumofDigits();
        obj.digits(n);
        obj.check();
    }
}