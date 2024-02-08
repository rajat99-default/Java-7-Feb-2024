import java.util.Scanner;

public class Unique_number_program_in_java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = scanner.nextInt();
        scanner.close();

        int[] visited = new int[10]; 
        int temp = number;
        boolean isUnique = true;
        while (temp > 0 && isUnique) {
            int digit = temp % 10;
            if (visited[digit] == 1) {
                isUnique = false;
            } else {
                visited[digit] = 1;
            }
            temp /= 10;
        }

        if (isUnique) {
            System.out.println("This is a unique number.");
        } else {
            System.out.println("This is not a unique number.");
        }
    }
}
