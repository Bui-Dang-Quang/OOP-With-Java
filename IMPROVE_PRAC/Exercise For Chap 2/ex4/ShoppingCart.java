import java.util.ArrayList;
public class ShoppingCart {
    public ArrayList<String> cartContent= new ArrayList<String>();

    public void addToCart(String item){
        cartContent.add(item);
    }

    public void removeFromCart(String item){
        cartContent.remove(item);
    }

    public void checkOut(){
        for(int i = 0; i < cartContent.size(); i++){
            String content = cartContent.get(i);
            System.out.println(content);
        }
    }
}
