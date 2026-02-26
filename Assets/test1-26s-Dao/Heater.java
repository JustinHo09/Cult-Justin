/**
 * A Modified implementation of the Heater class, 
 * described in exercises 2.92-93.
 * 
 * @author William H. Hooper
 * @version 01-24-2024
 */
public class Heater{
    // Temperature of the heater in Fahrenheit
    private double temperature;
    
    //Q9 
    public Heater()
    {
        temperature = 90.5;
    }
    
    public Heater(int b){
        temperature = b;
    }
    
    public void raiseTemperature(double amount){
        //Q6
        temperature = temperature + amount;
    }
    
    public void lowerTemperature(double amount){
        temperature = temperature - amount;
    }
    
    public void setTemperature(double temp){
        temperature = temp;
    }
    
    public double getTemperature(){
        return temperature;
    }
    
    public void print(){
        System.out.println("");
    }
}
