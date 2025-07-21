public class Vector {
    private Integer x;
    private Integer y;
    

    public Vector(Integer x,Integer y){
        this.x = x;
        this.y = y;
    }
    // set setter
    public void setVector_x(Integer x){
        this.x = x;
    }

    public void setVector_y(Integer y){
        this.y = y;
    }

    // set getter
    public Integer getVector_x(){
        return x;
    }

    public Integer getVector_y(){
        return y;
    }

    // Method
    public Vector addVector(Vector other){
        return new Vector(this.x + other.x,this.y + other.y);
    }

    public int mulVector(Vector other){
        return this.x * other.x + this.y * other.y;
    }

    public Vector subVector(Vector other){
        return new Vector(this.x - other.x,this.y - other.y);
    }
}
