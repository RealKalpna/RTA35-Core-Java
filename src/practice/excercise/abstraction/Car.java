package practice.excercise.abstraction;

public abstract class Car {
    /*
    4. Abstraction Assignment (Car Engine System)
    Scenario:
    Different cars have different engine start mechanisms.
            Task:
    Create an abstract class Car with an abstract method startEngine().
    Implement startEngine() in ElectricCar and PetrolCar.
    Hide internal details of starting the engine from the user.
    */
    public abstract void startEngine();

}
