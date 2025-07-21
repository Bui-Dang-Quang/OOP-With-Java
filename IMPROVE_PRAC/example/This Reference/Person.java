public class Person {
    String pName;
    int pAge;
    Person(String pName, Integer pAge){

        // Name with ambiguity
        pName = pName;
        //Age without ambiguity
        this.pAge = pAge;
    }

    public static void main(String[] args){
        Person po = new Person("John", 20);
        System.out.println("Name: " + po.pName);
        System.out.println("Age: " + po.pAge);
    }
}
