package JAVA.LAB_3.ex3;

public class Cylinder extends Circle implements Volume {
    protected double hc;
    public Cylinder(double radius, double xp, double yp, double height){
        super(radius, xp, yp);
        hc = height;
    }
    public double calArea(){
        if (rc >= 0.0 && hc >= 0.0) {
            return 2 * Math.PI *rc + 2 * Math.PI * rc * rc;
        }else{
            return 0.0;
        }
    }

    public double calVolume(){
        if (rc >= 0.0 && hc >= 0.0) {
            return Math.PI * rc * rc * hc;
        }else{
            return 0.0;
        }
    }
    public String getName(){
        return "Cylinder";
    }

    public String toString(){
        return "Point : " + "[" + xp + "," + yp + "," + hc + "]" +"; Radius = " + rc ;
    }
}
