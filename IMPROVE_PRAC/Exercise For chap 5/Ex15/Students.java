import java.lang.invoke.StringConcatFactory;

public class Students extends courses{
    protected String StudentID;
    protected String StudentName;
    protected Double midterm;
    protected Double final_mark;
    public Students(String id, String CN, String sid, String sn) {
        super(id, CN);
        StudentID = sid;
        StudentName = sn;
    }
    public String Status(){
        double average = (midterm + final_mark) / 2;
        if (average >=10 && midterm > 7){
            return "Grade Passing Student";
        }else{
            return "Retake Student";
        }
    }

    public String toString() {
        return super.toString() 
        + "Student:<" + StudentID + "," + StudentName + ", midterm: " 
        + midterm + ", final_mark: " + final_mark + ", Status: " + Status() + ">";
    }

}
