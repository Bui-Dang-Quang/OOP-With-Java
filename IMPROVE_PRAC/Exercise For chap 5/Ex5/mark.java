import java.io.IOException;
import java.util.Scanner;

public class mark{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type an integer: ");
        int i = sc.nextInt();
        System.out.println("The number you typed in: " + i);

        if (i >= 0 && i <= 9) {
            System.out.println("Fail");
        } else if (i >= 10 && i <= 12) {
            System.out.println("Average");
        } else if (i >= 13 && i <= 14) {
            System.out.println("Above Average");
        } else if (i >= 15 && i <= 16) {
            System.out.println("Good");
        } else if (i >= 17 && i <= 18) {
            System.out.println("Excellent");
        } else if (i >= 19 && i <= 20) {
            System.out.println("Outstanding");
        } else {
            System.out.println("Invalid score");
        }

    }
}