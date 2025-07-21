import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while(true){
            System.out.println("Type n numbers: ");
            n = sc.nextInt();
            sc.nextLine();
            if (n < 0 ){
                System.out.println("Invalid amout of employee");
            }else if (n == 0){
                System.out.println("No employee enrolled, requiring more than one");
            }
            break;
        }

        String totalInfo[][] = new String[n][6];

        for(int i = 0; i < n; i++){
            System.out.println("Enter information for Employee " + (i+1));

            System.out.println("Employee's ID: ");
            totalInfo[i][0]= sc.nextLine();

            System.out.println("Fullname: ");
            totalInfo[i][1] = sc.nextLine();

            System.out.println("Department: ");
            totalInfo[i][2] = sc.nextLine();

            System.out.println("Basic Salary: ");
            totalInfo[i][3] = sc.nextLine();


            System.out.println("Extra Salary: ");
            totalInfo[i][4] = sc.nextLine();

        }

        System.out.println("\nStored Employee Information:");
        System.out.println("\n----------------------------");
        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.println("ID: " + totalInfo[i][0]);
            System.out.println("Name: " + totalInfo[i][1]);
            System.out.println("Department: " + totalInfo[i][2]);
            System.out.println("Basic Salary: " + totalInfo[i][3]);

            double basicSalary = Double.parseDouble(totalInfo[i][3]); 
            double extraSalary = Double.parseDouble(totalInfo[i][4]); 
            double income = basicSalary + (extraSalary * 2.5);
            System.out.println("Income: " + income);

            System.out.println("----------------------------");
        }

        try{
            FileWriter w = new FileWriter("employees.txt");
            for (int i = 0; i < n; i++) {
                w.write("Employee " + (i + 1) + ":\n");
                w.write("ID: " + totalInfo[i][0] + "\n");
                w.write("Name: " + totalInfo[i][1] + "\n");
                w.write("Department: " + totalInfo[i][2] + "\n");
                w.write("Basic Salary: " + totalInfo[i][3] + "\n");
                w.write("Extra Salary: " + totalInfo[i][4] + "\n");

                double basicSalary = Double.parseDouble(totalInfo[i][3]); 
                double extraSalary = Double.parseDouble(totalInfo[i][4]); 
                double income = basicSalary + (extraSalary * 2.5);
                w.write("Income: " + income);
                
                w.write("\n----------------------------\n");
            }
            w.close();
            System.out.println("\nEmployee information saved to employees.txt");    
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
