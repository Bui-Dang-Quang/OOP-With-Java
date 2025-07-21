import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class EmployeeInput {
    public static void main(String[]arg){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        EmployeeInfo[] employees = new EmployeeInfo[n];
        for(int i = 0; i< n; i++ ){
            System.out.println("Enter information for employee #" + (i+1) + ":");
            System.out.print("Employee ID: ");
            String EmployeeID = scanner.nextLine();

            System.out.print("Full Name: ");
            String EmployeeFullName = scanner.nextLine();

            System.out.print("Department: ");
            String EmployeeDepartment = scanner.nextLine();

            System.out.print("Basic Salary: ");
            double BasicSalary = scanner.nextDouble();

            System.out.print("Extra Salary: ");
            double ExtraSalary = scanner.nextDouble();

            scanner.nextLine();
            
            employees[i] = new EmployeeInfo(EmployeeID, EmployeeFullName, EmployeeDepartment, BasicSalary, ExtraSalary);
        }
        // info of n employees to a text file
        try{
            BufferedWriter w = new BufferedWriter(new FileWriter("employee.txt"));
            for (int i = 0; i < employees.length; i++) {
                EmployeeInfo employee = employees[i];
                w.write(String.format("%s,%s,%s,%.2f,%.2f%n", employee.getID(), employee.getFullName(), employee.getDepartment(), employee.getBasicSalary(), employee.getExtraSalary()));
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\nEmployee Information:");
        for (int i = 0; i < employees.length; i++) {
            EmployeeInfo employee = employees[i];
            System.out.println(employee);
    }
    

}
}
