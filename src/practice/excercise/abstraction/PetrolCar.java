package practice.excercise.abstraction;

public class PetrolCar extends Car {

    public PetrolCar(){
        System.out.println("This is Petrol car!");
    }
    @Override
    public void startEngine(){
        System.out.println(" Petrol Car Starts!");
    }
}
