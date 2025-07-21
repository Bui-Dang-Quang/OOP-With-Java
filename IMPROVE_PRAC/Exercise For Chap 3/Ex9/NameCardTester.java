public class NameCardTester {
    public static void main(String[] args){
        NameCard nc1 = new NameCard();
        NameCard nc2 = new NameCard();
        // NameCard ncErr = new NameCard();

        nc1.setName("Quang");
        nc1.setPhone(12345678);
        nc1.setMail("abc@example.com");

        nc2.setName("John");
        nc2.setPhone(987654321);
        nc2.setMail("KtR5d@example.com");

        // ncErr.setPhone(012345678);
        // ncErr.setMail("def@example.com");  
        // ncErr.setName("Atoine");

        nc1.showInfo();
        nc2.showInfo();
        // ncErr.showInfo();
    }
}
