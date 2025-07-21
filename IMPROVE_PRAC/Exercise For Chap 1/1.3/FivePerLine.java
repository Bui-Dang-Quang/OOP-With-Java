public class FivePerLine {
    public static void main(String[] args) {
        int START = 1000;
        int END = 2000;
        int PERLINE = 5;

        for(int i = START; i<=END; i++){
            System.out.print(i + " ");
            if ((i+1)%PERLINE == 0) {
                System.out.println();
            }
            
        }
        System.out.println();
    }
}
