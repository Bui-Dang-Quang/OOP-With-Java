import java.util.Scanner;
import java.util.InputMismatchException;
public class ex8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 0;

        while (true){
            try{
                System.out.println("Type n numbers (n > 1): ");
                n = sc.nextInt();

                if (n <= 1){
                    System.out.println("Please enter a number greater than 1.");
                    continue;
                }
                break;
            } catch (InputMismatchException e){
                System.out.println("Invalid input. Please enter a valid number for a1.");
                sc.nextLine();
            }
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            double a = sc.nextDouble();
            sum = sum + Math.pow(a, 2);
        }
        System.out.println("Sum: " + sum);

    }
}
