package practice.excercise.abstraction;

public class CarRunner {
    public static void main(String[] args) {
        Car car;
        car = new ElectricCar();
        car.startEngine();
        car = new PetrolCar();
        car.startEngine();
    }
}
