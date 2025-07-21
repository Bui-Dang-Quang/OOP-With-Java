
public class AutomobileTestDrive {
    public static void main(String[] args) {
        Automobile auto1 = new Automobile(4.5, 34.0, "29JAD");
        System.out.println("Initial fuel: " + auto1.getFuel());
        System.out.println("Initial speed: " + auto1.getSpeed());
        System.out.println("Initial licence: " + auto1.getLicense());

        auto1.accelerate(4);
        auto1.decelerate(5);

        System.out.println("\nFinal fuel: " + auto1.getFuel());
        System.out.println("Final speed: " + auto1.getSpeed());
        System.out.println("Final licence: " + auto1.getLicense());
    }
}
