import java.util.Scanner;
// import java.util.Arrays;
public class ex13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = 0;
        while(true){
            System.out.println("Type n numbers: ");
            n = sc.nextInt();
            if(n <= 1){
                System.out.println("Please enter a number greater than 1");
                continue;
            }
            break;
        }

        double a[] = new double[n];
        double b[] = new double[n];

        for(int i = 0; i < n; i++){
            System.out.println("Enter value " + i + "for a: ");
            a[i] = sc.nextDouble();
        }

        for(int i = 0; i < n; i++){
            System.out.println("Enter value " + i + "for b: ");
            b[i] = sc.nextDouble();
        }

        double sumdotProduct = 0;
        for(int i = 0; i < n; i++){
            sumdotProduct = sumdotProduct + a[i]*b[i];
        }

        double sumSquareRootA = 0;
        double sumSquareRootB = 0;

        for(int i = 0; i < n; i++){
            sumSquareRootA = sumSquareRootA + Math.pow(a[i], 2);
            sumSquareRootB = sumSquareRootB + Math.pow(b[i],2);
        }

        double MagnitudeA = Math.sqrt(sumSquareRootA);
        double MagnitudeB = Math.sqrt(sumSquareRootB);

        // Compute angle:
        double angleRadians = Math.acos(sumdotProduct/(MagnitudeA*MagnitudeB));
        double angleDegree = Math.toDegrees(angleRadians);

        System.out.printf("The angle between the vectors is: " + angleDegree);
    }
}
