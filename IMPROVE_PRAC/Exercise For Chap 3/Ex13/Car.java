public class Car {
    private String manufacturer;
    private String model;
    private Float productionExpense;
    private Integer productionTime;
    private Integer wheelNumber;

    public Car(String manu, String m, Float pe, Integer pt, Integer w){
        this.manufacturer = manu;
        this.model = m;
        this.productionExpense = pe;
        this.productionTime = pt;
        this.wheelNumber = w;
    }

    public String getManufacturer(){
        return manufacturer;
    }

    public String getModel(){
        return model;
    }

    public Float getPE(){
        return productionExpense;
    }
    public Integer getPT(){
        return productionTime;
    }

    public Integer getWE(){
        return wheelNumber;
    }
    
    public Float price(){
        return 2 * productionExpense * (float)Math.sqrt(productionTime);
    }
    

    public void showCal(){
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Production Expense: " + productionExpense);
        System.out.println("Production Time: " + productionTime);
        System.out.println("Wheel Number: " + wheelNumber);
        System.out.println("Price: " + price());
        
    }

    
}
