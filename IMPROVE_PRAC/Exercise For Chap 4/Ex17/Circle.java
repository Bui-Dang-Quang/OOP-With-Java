public class Circle extends Point{
    protected double radius;
    public Circle(Double x, Double y, Double radius) {
        super(x,y);
        this.radius = radius;
    }   

    public double calArea(){
        if (radius >= 0 ){
            return Math.PI * radius * radius;
        }else{
            return 0.0;
        }
    }

    public double calVolume(){
        return 0.0;
    }

    // Inherit Point class
    public String getName(){
        return "Circle";
    }

    public String toString(){
        return super.toString() + ", radius = " + radius;
    }
}

