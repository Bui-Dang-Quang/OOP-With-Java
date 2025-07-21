
public class NameCard {
    private String cName;
    private String cPhone;
    private String ceMail;
    

    // public setter
    public void setName(String cn){
        this.cName = cn;
    }
    public void setPhone(String cp){
        this.cPhone = cp;
    }
    public void seteMail(String ce){
        this.ceMail = ce;
    }

    // public getter
    public String getName(){
        return cName;
    }
    public String getPhone(){
        return cPhone;
    }
    public String geteMail(){
        return ceMail;
    }
}
