public class VectorTester {
    public static void main(String[] args){
        Vector v1 = new Vector();
        Vector v2 = new Vector();

        v1.setX(3.0);
        v1.setY(4.0);

        v2.setX(5.0);
        v2.setY(6.0);

        v1.add(v2);
        v1.subtract(v2);
        v1.multiply(v2);

        v1.showResult(v2);
        v1.toString();
    }
}
