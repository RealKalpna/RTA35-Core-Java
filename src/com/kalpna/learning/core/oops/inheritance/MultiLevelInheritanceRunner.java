package com.kalpna.learning.core.oops.inheritance;

// first, level 1
class Vehicle {
    void drive(){
        System.out.println("Vehicle is moving");
    }
}

//Intermediate class (Level 2)
class Car extends Vehicle {

    void music() {
        System.out.println("Music playing in car");
    }
}

// Child class level 3
class ElectricCar extends Car {
    void charging(){
        System.out.println("Electric Car is charging");
    }
}



public class MultiLevelInheritanceRunner{
    public static void main(String[] args) {

        Vehicle electricCar = new ElectricCar();// always create a subclass object and assign it to parent class type of reference variable
        electricCar.drive();
        //electricCar.music(); cannot access this super class behavoiur
        // to access this we need to do CASTING concept
       ((ElectricCar) electricCar).music();
        ((ElectricCar) electricCar).charging();

        //  or other way is by instanceof

        if(electricCar instanceof ElectricCar)
        {
            ((ElectricCar) electricCar).music();
            ((ElectricCar) electricCar).charging();
        }


    }
    
    
}
