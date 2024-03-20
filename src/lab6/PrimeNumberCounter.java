package lab6;

import java.util.Scanner;

public class PrimeNumberCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int primeCount = 0;

        // Check if there are enough command-line arguments
        if (args.length >= 3) {
            // Get three integers from command-line arguments
            for (int i = 0; i < 3; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }
        } else {
            System.out.println("Please provide three integers as command-line arguments.");
            return;
        }

        // Get two integers from user input
        for (int i = 3; i < 5; i++) {
            System.out.print("Enter an integer: ");
            numbers[i] = scanner.nextInt();
        }

        // Check if each number is prime
        for (int num : numbers) {
            if (isPrime(num)) {
                primeCount++;
            }
        }

        System.out.println("Number of prime numbers: " + primeCount);
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}