public class Circle extends Point implements Shape{
    protected double rc;
    public Circle(Double x, Double y, Double radius){
        super(x, y);
        rc = radius;
    }

    public Double calArea(){
        if ( rc >= 0.0){
            return Math.PI * rc * rc;
        }else{
            return 0.0;
        }
    }

    public String getName(){
        return "Circle";
    }

    public String toString(){
        return super.toString() + ", radius = " + rc;
    }

}
