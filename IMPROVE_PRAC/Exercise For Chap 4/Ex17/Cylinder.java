public class Cylinder extends Circle {
    protected double height;
    public Cylinder(double x, double y, double radius, double height) {
        super(x,y,radius);
        this.height = height;
    }

    public double calArea(){
        if (radius >= 0 && height >= 0){
            return 2 * Math.PI * radius * (radius + height);
        }else{
            return 0.0;
        }
    }

    public double calVolume(){
        if (radius >= 0 && height >= 0){
            return super.calArea() * height;
        }else{
            return 0.0;
        }
    }

    public String getName(){
        return "Cylinder";
    }

    public String toString(){
        return super.toString() + ", height = " + height;
    }

}
