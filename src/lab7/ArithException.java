package lab7;

//wap in java to handle arithmetic exception(divide by 0) number format exception
// array index out of bounds nullpointer exception

public class ArithException {
    public static void main(String[] args) {
        try {
            int result = divideByZero(10, 0);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }

        try {
            String str = "abc";
            int num = Integer.parseInt(str);
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }

        try {
            int[] arr = {1, 2, 3};
            System.out.println("Value at index 3: " + arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }

        try {
            String str = null;
            System.out.println("Length of string: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }

    public static int divideByZero(int numerator, int denominator) {
        return numerator / denominator;
    }
}