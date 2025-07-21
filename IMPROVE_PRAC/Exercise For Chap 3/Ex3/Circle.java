package JAVA.LAB_3.ex3;

public class Circle extends Point implements Area{
    protected double rc;
    public Circle(double radius, double x, double y){
        super(x, y);
        rc = radius;
    }

    public double calArea(){
        if(rc >= 0.0){
            return Math.PI* rc* rc;
        }else{
            return 0.0;
        }
    }
    public String getName(){
        return "Circle";
    }

    public String toString(){
        return "Circle:" + super.toString() + ", Radius: " + rc;
    }
}
