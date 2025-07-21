public class lecturers extends courses{
    protected String LecturerID;
    protected String LecturerName;

    public lecturers(String id, String CN, String lid, String ln) {
        super(id, CN);
        LecturerID = lid;
        LecturerName = ln;
    }

    public String toString() {
        return super.toString() +"Lecturer:<" + LecturerID + "," + LecturerName + ">";
    }
}
