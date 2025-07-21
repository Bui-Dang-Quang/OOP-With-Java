
public class Button {
    private String Label;
    private String Color;

    //setter
    public void setLabel(String l){
        this.Label = l;
    }

    public void setColor(String c){
        this.Color = c;
    }


    // getter
    public String getLabel(){
        return Label;
    }
    public String getColor(){
        return Color;
    }
    
    public void dePress(){
        System.out.println("\n Button Pressed!");
        System.out.println("Button's label: " + getLabel());
        System.out.println("Button's Color: " + getColor());
    }
    
    public void unDepress(){
        System.out.println("Button released!");
    }
}
