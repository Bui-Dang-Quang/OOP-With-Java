public class Person_private {
    private String pName;
    private int pAge;
    private String pGender;

    public void setName(String pn){
        pName = pn;
    }

    public void setAge(Integer pa){
        pAge = pa;
    }

    public void setGender(String pg){
        pGender = pg;
    }

    public String getName(){
        return pName;
    }
    public Integer getAge(){
        return pAge;
    }

    public String getGender(){
        return pGender;
    }

    // Display information of Card
    public void showInfo(){
        System.out.println("Name: " + pName + ", Age: " + pAge + ", Gender: " + pGender);
    }

}
