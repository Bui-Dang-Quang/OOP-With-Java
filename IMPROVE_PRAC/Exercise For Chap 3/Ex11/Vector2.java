public class Vector2 {
    private Double X;
    private Double Y;

    public Vector2(Double x, Double y){
        this.X = x;
        this.Y = y;
    }

    // Getters
    public Double getX(){
        return X;
    }

    public Double getY(){
        return Y;
    }

    public Vector2 addVector2(Vector2 v ){
        return new Vector2(this.X + v.X, this.Y + v.Y);
    }

    public Vector2 subtractVector2(Vector2 v){
        return new Vector2(this.X - v.X, this.Y - v.Y);
    }

    public Vector2 mulVector2(Vector2 v){
        return new Vector2(this.X * v.X, this.Y * v.Y);
    }

    
    public void showResult(Vector2 v){
        System.out.println("Vector v1: " + "(" + this.X + "," + this.Y + ")");
        System.out.println("Vector v2: " + "(" + v.X + "," + v.Y + ")");
        System.out.println("Sum: " + addVector2(v));
        System.out.println("Subtract: " + subtractVector2(v));
        System.out.println("Multiply: " + mulVector2(v));
    }
    public String toString() {
        return "(" + X + ", " + Y + ")";
    }
}
