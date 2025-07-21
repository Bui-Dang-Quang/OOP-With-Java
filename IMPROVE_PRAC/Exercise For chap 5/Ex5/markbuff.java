import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class markbuff {
    public static void main(String[] args){
        try{
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader b = new BufferedReader(in);
            System.out.println("Type a score: ");
            String s = b.readLine();

            int t = Integer.parseInt(s);
            System.out.println("The number you typed in: " + t);
            if (t>= 0 & t <= 9){
                System.out.println("Fail");
            }else if (t >= 10 & t <= 12){                
                System.out.println("Average");
            }else if (t >= 13 & t <= 14){
                System.out.println("Above Average");
            }else if (t >= 15 & t <= 16){
                System.out.println("Good");
            }else if (t >= 17 & t <= 18){
                System.out.println("Excellent");
            }else if (t >= 19 & t <= 20){
                System.out.println("Outstanding");
            }else{
                System.out.println("Invalid score");
            }
        } 
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
