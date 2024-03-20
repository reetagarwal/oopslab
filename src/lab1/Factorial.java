package lab1;

import java.util.Scanner;
public class Factorial {

        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            int n;//entered number by the user
            int fact=1;//to store the factorial
            System.out.println("Enter any positive number");
            n=sc.nextInt();
            //to find the factorial of the entered number
            for(int i=1;i<=n;i++){
                fact*=i;
            }
            System.out.println("the factorial of the entered number is"+ fact);
        }

    }


