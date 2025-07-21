public class Vector2Tester {
    public static void main(String[] args) {
        Vector2 v1 = new Vector2(3.0, 4.0);
        Vector2 v2 = new Vector2(5.0, 6.0);

        v1.addVector2(v2);
        v1.subtractVector2(v2);
        v1.mulVector2(v2);

        v1.showResult(v2);
    }   

}
