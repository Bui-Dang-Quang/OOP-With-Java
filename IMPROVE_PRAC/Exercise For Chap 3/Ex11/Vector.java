public class Vector {
    private Double X;
    private Double Y;

    // Getters
    public Double getX(){
        return X;
    }

    public Double getY(){
        return Y;
    }

    // Setters

    public void setX(Double X){
        this.X = X;
    }

    public void setY(Double Y){
        this.Y = Y;
    }
    
    /**
     * Example: v1(3.0, 4.0), v2(5.0, 6.0)
     * 
     */
    public Vector add (Vector v){ 
        Vector sum = new Vector();
        sum.setX(this.X + v.X); // sum of vector = x1 + x2
        sum.setY(this.Y + v.Y); // sum of vector = y1 + y2
        return sum;
    }

    public Vector subtract(Vector v){
        Vector diff = new Vector();
        diff.setX(this.X - v.X);
        diff.setY(this.Y - v.Y);
        return diff;
    }

    public Vector multiply(Vector v){
        Vector mul = new Vector();
        mul.setX(this.X * v.X);
        mul.setY(this.Y * v.Y);
        return mul; 
    }

    public void showResult(Vector v){
        System.out.println("Vector v1: " + "(" + this.X + "," + this.Y + ")");
        System.out.println("Vector v2: " + "(" + v.X + "," + v.Y + ")");
        System.out.println("Sum: " + add(v));
        System.out.println("Subtract: " + subtract(v));
        System.out.println("Multiply: " + multiply(v));
    }
    public String toString() {
        return "(" + X + ", " + Y + ")";
    }
}
