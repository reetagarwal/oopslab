package lab7;

//Wap in java to demonstrate nested try catch block

public class NestedTryCatching {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Accessing element at index 3...");

            try {
                System.out.println("Value at index 3: " + numbers[3]);
            } catch (ArrayIndexOutOfBoundsException innerException) {
                System.out.println("Inner catch: ArrayIndexOutOfBoundsException caught: " + innerException.getMessage());
            }

            System.out.println("End of inner try-catch block");

        }

        catch (Exception outerException) {
            System.out.println("Outer catch: Exception caught: " + outerException.getMessage());
        }

        System.out.println("End of program");
    }
}