public class Point extends Shape{
    protected double X, Y;

    public Point(double x, double y) {
        X = x;
        Y = y;
    }

    public double calArea(){
        return 0.0;
    }

    public double calVolume(){
        return 0.0;
    }

    public String getName(){
        return "Point";
    }

    public String toString(){
        return "(" + X + ", " + Y + ")";
    }
}
