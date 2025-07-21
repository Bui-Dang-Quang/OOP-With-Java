import java.util.Scanner;
import java.util.Arrays;

public class Ex10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 0;

        while (true){
            System.out.println("Type n numbers: ");
            n = sc.nextInt();
            if (n <= 0){
                System.out.println("Please enter a number greater than 0");
                continue;
            }
            break;
        }

        double numbers[] = new double[n];
        double sum = 0;

        for(int i = 0; i < n; i++){
            System.out.println("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextDouble();
            sum = sum + numbers[i];
        }

        double mean = sum / n;
        System.out.println("Average: " + mean);

        int index = 0;
        for(int i = 0; i < n; i++){
            if (numbers[i] > mean){
                index =  index + 1;
            }
        } 

        double numberGreater[] = new double[index];

        int count = 0;
        for(int i = 0; i < n; i++){
            if (numbers[i] > mean){
                numberGreater[count++] = numbers[i];
            }
        }

        System.out.println("Numbers greater than average: " + Arrays.toString(numberGreater));

    }
}

