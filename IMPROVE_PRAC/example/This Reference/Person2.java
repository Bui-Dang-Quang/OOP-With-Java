public class Person2 {
    String pName;
    String pGender;
    String showInfo(Person2 po){
        return "Name: " + po.pName + ", Gender: " + po.pGender;
    }

    Person2(String pn, String pg){
        pName = pn;
        pGender = pg;

        System.out.println(showInfo(this));
    }

    public static void main(String[] args) {
        Person2 p2 = new Person2("Quang", "Male");
    }
}
