import java.util.Scanner;
import java.util.Arrays;
public class AV_STD{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Type n real numbers: ");
        int n = sc.nextInt();

        // This part for calculating Average, storing number into array
        double number[] = new double[n]; // Assume 3 numbers you typed in: [1, 2, 3]
        double sum = 0;

        for(int i = 0; i < n; i++){
            System.out.println("Type a number for iteration " + i + ": ");
            number[i] = sc.nextDouble();
            sum = sum + number[i];
        }

        double mean = sum/(double) n;
        System.out.println("Average of " + Arrays.toString(number) + " is: " + mean);



        // This part for calculating Standard Deviation
        double sumOfSquares = 0;

        for(int i = 0; i < n; i++){
            sumOfSquares = sumOfSquares + Math.pow(number[i] - mean, 2);
        }

        double SSD = Math.sqrt(sumOfSquares/(n - 1));
        System.out.println("Standard Deviation of " + Arrays.toString(number) + " is: " + SSD);

    }
}