// MotorbikeTester.java
public class MotorbikeTester {
    public static void main(String[] args) {
        // Create a Motorbike object
        Motorbike bike = new Motorbike(10.5, 50.0, "ABC-1234");

        // Display initial state
        System.out.println("Initial State: " + bike);

        // Accelerate the motorbike
        bike.accelerate(20.0);
        System.out.println("After Acceleration: " + bike);

        // Decelerate the motorbike
        bike.decelerate(30.0);
        System.out.println("After Deceleration: " + bike);

        // Further deceleration to test speed limit
        bike.decelerate(50.0);
        System.out.println("After Excessive Deceleration: " + bike);
    }
}

