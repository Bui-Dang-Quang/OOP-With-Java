public class EmployeeInfo {
    private String EmployeeID;
    private String EmployeeFullName;
    private String EmployeeDepartment;
    private Double BasicSalary;
    private Double ExtraSalary;

    public EmployeeInfo(String ID, String FullName,String Department, Double BasicSalary, Double ExtraSalary){
        this.EmployeeID = ID;
        this.EmployeeFullName = FullName;
        this.EmployeeDepartment = Department;
        this.BasicSalary = BasicSalary;
        this.ExtraSalary = ExtraSalary;
    }

    // SETTER
    public void setID(String id){
        this.EmployeeID = id;
    }

    public void setFullName(String Name){
        this.EmployeeFullName = Name;
    }

    public void setDepartment(String d){
        this.EmployeeDepartment = d;
    }

    public void setBasicSalary(Double bSal){
        this.BasicSalary = bSal;
    }

    public void setExtraSalary(Double eSal){
        this.ExtraSalary = eSal;
    }

    //GETTER

    public String getID(){
        return EmployeeID;
    }

    public String getFullName(){
        return EmployeeFullName;
    }

    public String getDepartment(){
        return EmployeeDepartment;
    }

    public Double getBasicSalary(){
        return BasicSalary;
    }

    public Double getExtraSalary(){
        return ExtraSalary;
    }

    // Income value
    public double INCOME(){
        return BasicSalary + ExtraSalary * 2.5;
    }

    public String toString(){
        return String.format("ID: %s, Name: %s, Department: %s, Income: %.2f",EmployeeID,EmployeeFullName,EmployeeDepartment,INCOME());
    }
}
