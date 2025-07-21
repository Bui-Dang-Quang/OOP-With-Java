package JAVA.LAB_3.ex3;

public class Point extends Shape implements Name {
    protected double xp,yp;
    public Point(double x, double y){
        this.xp = x;
        this.yp = y;
    }

    public String getName(){
        return "Point";
    }

    public String toString(){
        return "[" + xp + "," + yp + "]";
    }
}
