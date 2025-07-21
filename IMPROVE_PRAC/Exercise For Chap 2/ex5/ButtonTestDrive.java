
public class ButtonTestDrive {
    public static void main(String[] args) {
        Button button1 = new Button();
        Button button2 = new Button();

        button1.setLabel("Play ");
        button1.setColor("White ");
        button2.setLabel("Pause ");
        button2.setColor("Black ");

        button1.dePress();
        button1.unDepress();

        button2.dePress();
        button2.unDepress();
        
        
    }
}
