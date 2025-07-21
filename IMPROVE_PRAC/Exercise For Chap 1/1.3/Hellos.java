public class Hellos {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for(int i = 1; i <= n; i++){
            System.out.println(i);

            if (i >=11 && i <= 20) {
                System.out.println("th");
            }else if (i%10 == 1 || i < 11 && i >20) {
                System.out.println("st");
            }else if (i%10 ==2 || i < 11 && i >20) {
                System.out.println("nd");
            }else if (i%10 == 3 || i < 11 && i >20) {
                System.out.println("rd");
            }else System.out.println("th");
            
            System.out.println(" Hello");
            }
    }
}
