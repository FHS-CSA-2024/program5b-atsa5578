import java.util.Scanner;
public class Car {
    private String carName;
    private int milesDriven;    
    private double gallonsUsed;
    
    public Car(){
        carName = ("");
        milesDriven = 0;
        gallonsUsed = 0;
    }
    public Car(String name, int miles, double gallons){
        carName = name;
        milesDriven = miles;
        gallonsUsed = gallons;
    }
    public String getcarName(){
        return carName;
    }
    public int getmilesDriven(){
        return milesDriven;
    }
    public double getgallonsUsed(){
        return gallonsUsed;
    }
    
    public void setName (String newName){
        newName = carName;
    }
    public void setMiles (int newMilesDriven){
        newMilesDriven = milesDriven;
    }
    public void setGallons (double newGallons){
        newGallons = gallonsUsed;
    }
    public double calculateAverage(){
        return Math.round(milesDriven/gallonsUsed * 10)/10.0;
    }
    public String toString (){
        return carName + " averaged " + calculateAverage() + " m/g ";
    }
    }

