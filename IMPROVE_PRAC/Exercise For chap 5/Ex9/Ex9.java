import java.util.Scanner;
public class Ex9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a String: ");
        String s = sc.nextLine();

        String string_target = "OOP course";
        if (s.contains(string_target)) {
            System.out.println("String ' " + s + " ' contains " + string_target);
        } else {
            System.out.println("String ' " + s + " ' does not contain " + string_target);
        }
    }
}
