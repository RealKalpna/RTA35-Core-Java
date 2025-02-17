package practice.excercise.abstraction;

public class ElectricCar extends Car{
    public ElectricCar(){
        System.out.println("This is Electric car!");
    }
    @Override
    public void startEngine(){
        System.out.println(" Electric Car Starts!");
    }


}
