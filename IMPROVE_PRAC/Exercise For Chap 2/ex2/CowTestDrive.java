
public class CowTestDrive {
    public static void main(String[] args) {
        Cow c1 = new Cow();
        c1.setName("Kyle");
        c1.setBreed("Male");
        c1.setAge(2);

        System.out.println("Cow whose name is " + c1.getName() + ", it's a " + c1.getBreed() + ", He's now " + c1.geteAge() + " year old");
        c1.moo();
    }
}
