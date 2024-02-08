import java.util.Scanner;

public class Spy_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int temp = number;
        int sum = 0;
        int product = 1;

        // Calculate sum and product of digits
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }

        // Check if the sum equals the product
        if (sum == product) {
            System.out.println("This is a Spy Number");
        } else {
            System.out.println("This is not a Spy Number");
        }
    }
}
