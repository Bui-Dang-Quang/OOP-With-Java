// import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;
public class Ex12 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int n = 0;
        int m = 0;
        while (true){
            System.out.println("Type a number for a (a is even number):");
            a = sc.nextInt();

            if (a%2 == 0){
                break;
            }else{
                System.out.println("Please type an even number");
            }
        }


        while (true){
            System.out.println("Type a number for b (b is odd number):");
            b = sc.nextInt();

            if (b%2 != 0){
                break;
            }else{
                System.out.println("Please type an odd number");
            }
        }

        Random rand = new Random();
        int c = rand.nextInt(1000) + 1;
        System.out.println("Random c (1-1000): "+ c);

        while(true){
            System.out.println("Type a number for n (n is positive): ");
            n = sc.nextInt();

            if (n <= 0){
                System.out.println("Please type a positive number");
                continue;
            }
            break;
        }

        while(true){
            System.out.println("Type a number for m (n is positive): ");
            m = sc.nextInt();

            if (m <= 0){
                System.out.println("Please type a positive number");
                continue;
            }
            break;
        }

        System.out.println("Enter value for x: ");
        int x = sc.nextInt();

        double result = a * Math.pow(x,n) + b * Math.pow(x,m) + c;
        System.out.println("f(x) = " + a + "X^" + n + " + " +  b + "X^" + m + " + " + c + ", with x = " + x + " is equal to: " + result);
    }
}
