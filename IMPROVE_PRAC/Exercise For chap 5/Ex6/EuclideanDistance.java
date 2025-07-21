import java.util.Scanner;

public class EuclideanDistance{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number for a1: ");
        double a1 = sc.nextDouble();

        System.out.println("Type a number for b1: ");
        double b1 = sc.nextDouble();

        System.out.println("Type a number for a2: ");
        double a2 = sc.nextDouble();

        System.out.println("Type a number for b2: ");
        double b2 = sc.nextDouble();

        double distance = Math.sqrt(Math.pow((a2 - a1),2) + Math.pow((b2 - b1), 2));

        System.out.println("Euclidean Distance between (" + a1 + ", " + b1 + ") and (" + a2 + "," + b2 + ") is:" + distance);
    }    
}
