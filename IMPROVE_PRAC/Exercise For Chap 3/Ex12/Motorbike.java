public class Motorbike {
    private  Double fuel;
    private Double speed;
    private String license;

    public Motorbike(double f , double s, String l){
        this.fuel = f;
        this.speed = s;
        this.license = l;
    }

    public Double getFuel(){
        return fuel;
    }

    public Double getSpeed(){
        return speed;
    }

    public String getLicense(){
        return license;
    }

    public void accelerate(Double d){
        this.speed = this.speed + d;
    }

    public void decelerate(Double d){
        if (this.speed - d >= 0) {
            this.speed = this.speed - d; 
        }else{
            this.speed = 0.0;
        }
    }

    public String toString() {
        return "Motorbike [Fuel: " + fuel + ", Speed: " + speed + ", License: " + license + "]";
    }


}
