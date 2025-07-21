import java.util.Scanner;
import java.util.InputMismatchException;

public class EuclideanDistancebetter2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a1 = 0, b1 = 0, a2 = 0, b2 = 0;
        
        // Get input for a1
        while (true) {
            try {
                System.out.print("Type a number for a1: ");
                a1 = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number for a1.");
                sc.nextLine(); // Clear the buffer
            }
        }
        
        // Get input for b1
        while (true) {
            try {
                System.out.print("Type a number for b1: ");
                b1 = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number for b1.");
                sc.nextLine();
            }
        }
        
        // Get input for a2
        while (true) {
            try {
                System.out.print("Type a number for a2: ");
                a2 = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number for a2.");
                sc.nextLine();
            }
        }
        
        // Get input for b2
        while (true) {
            try {
                System.out.print("Type a number for b2: ");
                b2 = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number for b2.");
                sc.nextLine();
            }
        }
        
        // Compute Euclidean distance
        double distance = Math.sqrt(Math.pow((a2 - a1), 2) + Math.pow((b2 - b1), 2));
        System.out.println("Euclidean Distance between (" + a1 + ", " + b1 + ") and (" + a2 + ", " + b2 + ") is: " + distance);
    }
}





