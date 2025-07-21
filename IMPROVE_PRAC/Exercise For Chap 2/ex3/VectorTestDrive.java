public class VectorTestDrive {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1,2);
        Vector vector2 = new Vector(2, 3);

        System.out.println("Vector 1: " +  "(" + vector1.getVector_x() + "," + vector1.getVector_y() + ")");
        System.out.println("Vector 2: " +  "(" + vector2.getVector_x() + "," + vector2.getVector_y() + ")");
        Vector Sum = vector1.addVector(vector2);
        System.out.println("Add vector: (" + Sum.getVector_x() + "," + Sum.getVector_y() + ")");

        System.out.println("Multiplication vector: " + vector1.mulVector(vector2));

        Vector Subtraction = vector1.subVector(vector2);
        System.out.println("Subtraction vector: (" + Subtraction.getVector_x() + "," + Subtraction.getVector_y() + ")");
    }
}
