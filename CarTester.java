import java.util.Scanner;
public class CarTester{
    //Write your methods here
    
    public static Car addCar(){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Please enter the car's name: ");
        String carName = scanner.nextLine();
        System.out.println("Please enter car's miles: ");
        int milesDriven = scanner.nextInt();
        System.out.println("Please enter car's gallons: ");
        double gallonsUsed = scanner.nextDouble();
        
        Car car = new Car (carName, milesDriven, gallonsUsed);
        return car;
    }
    public static void main (String[] args){
        Car car1 = addCar();
        System.out.println(car1.toString());
        Car car2 = addCar();
        System.out.println(car2.toString());
        
    }
}

