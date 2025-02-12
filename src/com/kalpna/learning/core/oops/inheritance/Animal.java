package com.kalpna.learning.core.oops.inheritance;

public class Animal {
    String species;
    public  void makeSound(){
        System.out.println("Animal makes a sound.");
    }
    public void dancing(){
        System.out.println("Default behaviour.");

    }
}


class Dog extends Animal {
    @Override
    public void makeSound(){
        System.out.println("Dog is barking!");
    }
    public void dancing(){
        System.out.println(" Dog is dancing.");

    }
}
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println(" Cat is Meawing!");
    }
    @Override
    public void dancing(){
        System.out.println(" Lion is dancing.");

    }
}
class Lion extends Animal {
    @Override
    public void makeSound(){
        System.out.println(" Lion is roring!");
    }
    @Override
    public void dancing(){
        System.out.println(" Lion is dancing.");
    }
   }

class Crocodile extends Animal {

    @Override
    public void dancing(){
        System.out.println("Crocodile is dancing");
    }
}

class Dyno extends Animal{

}
class Runner{
    public static void main(String[] args) {
        Animal tomy = new Dog();
        Animal kitty = new Cat();
        Animal king = new Lion();
        Animal croc1 = new Crocodile();
        Crocodile croc2 = new Crocodile();

        // better idea is to have less impacton the user make good use of maximum code reusability
                //Animal animal = new Dyno();


        tomy.makeSound();
        kitty.makeSound();
        king.makeSound();
        croc1.makeSound();
        croc2.dancing();
        croc2.makeSound();
        croc1.dancing();
        //animal.makeSound();








    }
}



