

public class NameCardTestDrive {
    
    public static void main(String[] args) {
        // Assign values for instance variables
        NameCard nc1 = new NameCard();
        nc1.setName("Quang");
        nc1.setPhone("09181818181");
        nc1.seteMail("lmao@gmail.com");

        //Get values of instance variables
        System.out.println("Name: " + nc1.getName());
        System.out.println("Phone: " + nc1.getPhone());
        System.out.println("eMail: " + nc1.geteMail());
    
    }
}
