// public class CarTester {
//     public static void main(String[] args) {
//         // Create a Car object with test values
//         Car car1 = new Car("Toyota", "Corolla", 15000.0f, 24, 4);

//         // Display car details and calculated price
//         System.out.println("Car Details:");
//         car1.showCal();

//         // Creating another car for additional testing
//         Car car2 = new Car("Tesla", "Model S", 30000.0f, 18, 4);
//         System.out.println("\nSecond Car Details:");
//         car2.showCal();
//     }
// }

public class CarTester {
    public static void main(String[] args) {
        // Create an array of 5 Car objects
        Car[] cars = new Car[5];

        // Initialize the array with 5 Car objects
        cars[0] = new Car("Toyota", "Corolla", 15000.0f, 24, 4);
        cars[1] = new Car("Tesla", "Model S", 30000.0f, 18, 4);
        cars[2] = new Car("Ford", "Focus", 12000.0f, 30, 4);
        cars[3] = new Car("Chevrolet", "Malibu", 18000.0f, 25, 4);
        cars[4] = new Car("Honda", "Civic", 16000.0f, 28, 4);

        // Loop through the array and display the details for each car
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Car " + (i + 1) + " Details:");
            cars[i].showCal();
            System.out.println(); // Adds an empty line between car details
        }
    }
}
