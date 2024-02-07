import java.util.Scanner;

public class array_for_loop {
    public static void main(String[] args) {
        
        int[] arr = new int[5];
        
       
        Scanner o = new Scanner(System.in);
        
        
        System.out.println("Enter five elements:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Element " + i + " ");
            arr[i] = o.nextInt();
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Element " + i+ " " + arr[i]);
        }
        
       
        o.close();
    }
}
