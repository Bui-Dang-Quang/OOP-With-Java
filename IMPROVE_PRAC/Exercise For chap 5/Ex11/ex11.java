import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        // Read n and ensure it is greater than 0
        while (true) {
            System.out.println("Type n numbers: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Please enter a number greater than 0");
                continue;
            }
            break;
        }

        // Create a HashMap to store numbers and their frequencies
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Read n numbers and calculate their frequencies
        System.out.println("Enter the " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Find the number that occurs most frequently
        int mostFrequentNumber = -1;
        int maxFrequency = 0;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mostFrequentNumber = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }

        // Print the result
        System.out.println("The number that occurs most frequently is: " + mostFrequentNumber);
    }
}