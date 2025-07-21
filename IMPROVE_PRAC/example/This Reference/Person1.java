public class Person1 {
    String pGender;
    String pName;

    Person1(){
        pName = "Anonymous";
    }

    Person1(String pg){
        this();
        pGender = pg;
    }
    
    public static void main(String[] args) {
        Person1 p1 = new Person1("Male");
        System.out.println("Name: " + p1.pName + ", Gender: " + p1.pGender);
    }
}
