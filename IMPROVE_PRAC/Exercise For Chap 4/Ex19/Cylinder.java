public class Cylinder extends Circle implements Shape {
    protected double h;
    public Cylinder(Double x, Double y, Double radius, Double height){
        super(x,y,radius);
        h = height;
    }

    public Double calArea(){
        if (rc >= 0 && h >= 0){
            return 2 * Math.PI * rc * (rc + h);
        }else{
            return 0.0;
        }
    }

    public Double calVolume(){
        if (rc >= 0 && h >= 0){
            return super.calArea() * h;
        }else{
            return 0.0;
        }
    }

    public String getName(){
        return "Cylinder";
    }

    public String toString(){
        return super.toString() + ", height = " + h;
    }

}
