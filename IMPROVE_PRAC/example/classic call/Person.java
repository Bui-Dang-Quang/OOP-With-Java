public class Person {
    String pname;
    String pAge;
    String pGender;

    // Constructor of Default value with meaningful parameter names
    Person(String pn, String pa, String pg) {
        pname = pn;     
        pAge = pa;
        pGender = pg;
    }


    public void walk() {
        System.out.println("Walk");
    }

    public void eat() {
        System.out.println("Eat");
    }

    public static void main(String args[]) {
        Person p1 = new Person("Quang", "20", "Male");
        System.out.println("Name: " + p1.pname + ", Age: " + p1.pAge + ", Gender: " + p1.pGender);
        p1.walk();
        p1.eat();
    }
}

































// public class Person {
//     public String pname = "Quang";
//     public int page = 20;
//     public String pgender = "Male";
// }