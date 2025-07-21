public abstract class courses {
    protected String IDs;
    protected String CourseName;

    public courses(String id, String CN) {
        IDs = id;
        CourseName = CN;
    }
    public String toString(){
        return "Course:<" + IDs + "," + CourseName + ">";
    }
}
