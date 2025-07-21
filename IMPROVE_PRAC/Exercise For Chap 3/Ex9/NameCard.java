public class NameCard {
    private String name;
    private Integer phone;
    private String mail;

    public String getName() {
        return name;
    }

    public Integer getPhone() {
        return phone;
    }

    public String getMail() {
        return mail;
    }

    // Mutable
    public void setName(String nm) {
        this.name = nm;
    }

    public void setPhone(Integer ph) {
        this.phone = ph;
    }

    public void setMail(String m) {
        this.mail = m;
    }

    public void showInfo(){
        System.out.println("Name: " + name + ", Phone: " + phone + ", Mail: " + mail);
    }
}

