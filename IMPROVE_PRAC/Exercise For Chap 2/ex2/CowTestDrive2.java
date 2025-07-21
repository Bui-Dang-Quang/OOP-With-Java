public class CowTestDrive2 {
    public static void main(String[] args) {
        Cow2 c1 = new Cow2("Kyle","Male");
        c1.setAge(2);

        System.out.println("Cow whose name is " + c1.getName() + ", it's a " + c1.getBreed() + ", He's now " + c1.geteAge() + " year old");
        c1.moo();
    }
}