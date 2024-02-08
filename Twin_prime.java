import java.util.Scanner;

public class Twin_prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();
        scanner.close();

        // Check if the first number is prime
        int primeFlag1 = 1;
        if (number1 <= 1) {
            primeFlag1 = 0;
        } else {
            for (int i = 2; i * i <= number1; i++) {
                if (number1 % i == 0) {
                    primeFlag1 = 0;
                    break;
                }
            }
        }

        // Check if the second number is prime
        int primeFlag2 = 1;
        if (number2 <= 1) {
            primeFlag2 = 0;
        } else {
            for (int i = 2; i * i <= number2; i++) {
                if (number2 % i == 0) {
                    primeFlag2 = 0;
                    break;
                }
            }
        }

        // Check if the difference between the numbers is 2 and both are prime
        if (primeFlag1 == 1 && primeFlag2 == 1 && (number1 - number2 == 2 || number2 - number1 == 2)) {
            System.out.println("The numbers " + number1 + " and " + number2 + " are twin primes.");
        } else {
            System.out.println("The numbers " + number1 + " and " + number2 + " are not twin primes.");
        }
    }
}
