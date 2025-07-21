import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadEmployeeFile {
    public static void main(String[] args) {
        String fileName = "employeesbetter.txt"; // File to read

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Print each line of the file
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
