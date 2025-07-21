public class Person {
    void Showinfo(String pn) {
        System.out.println("Name: " + pn);
    }
    void Showinfo(String pn, Integer pa) {
        System.out.println("Name: " + pn + " ,Age: " + pa);
    }
    
    public static void main(String[] args){
        Person po = new Person();
        po.Showinfo("Henry");
        po.Showinfo("Wale", 19);
    }
}
