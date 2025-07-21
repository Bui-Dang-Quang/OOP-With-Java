public class Point extends Object implements Shape{
    protected double x, y;
    public Point(double X, double Y){
        x = X;
        y = Y;
    }

    public Double calArea(){
        return 0.0;
    }
    public Double calVolume(){
        return 0.0;
    }
    public String getName(){
        return "Point";
    }

    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}
