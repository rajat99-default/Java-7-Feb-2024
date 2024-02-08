import java.util.Scanner;

public class Twisted_prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int temp = number;
        int reversed = 0;

        // Check if the number is prime
        int primeFlag = 1;
        if (number <= 1) {
            primeFlag = 0;
        } else {
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    primeFlag = 0;
                    break;
                }
            }
        }

        // If the number is prime, reverse it
        if (primeFlag == 1) {
            while (temp != 0) {
                int digit = temp % 10;
                reversed = reversed * 10 + digit;
                temp /= 10;
            }

            // Check if the reversed number is prime
            int reversedPrimeFlag = 1;
            if (reversed <= 1) {
                reversedPrimeFlag = 0;
            } else {
                for (int i = 2; i * i <= reversed; i++) {
                    if (reversed % i == 0) {
                        reversedPrimeFlag = 0;
                        break;
                    }
                }
            }

            // Output the result
            if (reversedPrimeFlag == 1) {
                System.out.println(number + " is a Twisted Prime.");
            } else {
                System.out.println(number + " is not a Twisted Prime.");
            }
        } else {
            System.out.println(number + " is not a Prime Number.");
        }
    }
}
