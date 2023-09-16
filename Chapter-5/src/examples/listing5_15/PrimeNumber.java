package examples.listing5_15;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIME = 50;
        final int NUMBER_OF_PRIME_PER_LINES = 10;
        int count = 0;
        int number = 2;

        System.out.println("The first 50 prime numbers are \n");

        while (count < NUMBER_OF_PRIME) {
            boolean isPrime = true;

            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;

                if (count % NUMBER_OF_PRIME_PER_LINES == 0) {
                    // Display the number and advance to the new line
                    System.out.println(number);
                }
                else
                    System.out.print(number+ " ");
            }

            number++;
        }
    }
}
