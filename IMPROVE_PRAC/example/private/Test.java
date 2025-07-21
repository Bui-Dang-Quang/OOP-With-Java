public class Test {
    public static void main(String[] args){
        Person_private pov = new Person_private();
        pov.setAge(15);
        pov.setGender("Male");
        pov.setName("Quang");

        System.out.println("Name: " + pov.getName());
        System.out.println("Age: " + pov.getAge());
        System.out.println("Gender: " + pov.getGender());

    }
}