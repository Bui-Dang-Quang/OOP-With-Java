
public class Automobile {
    private Double fuel;
    private Double speed;
    private String License;

    public Automobile(Double f,Double s ,String l){
        this.fuel = f;
        this.speed = s;
        this.License = l;
    }

    public void accelerate(double v){
        if (fuel>0) speed += v;
    }
    public void decelerate(double v){
        if (fuel<=0) speed -= v;
    }    

    public Double getFuel(){
        return fuel;
    }

    public Double getSpeed(){
        return speed;
    }

    public String getLicense(){
        return License;
    }
}
