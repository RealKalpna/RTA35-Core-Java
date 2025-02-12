package com.kalpna.learning.core.oops.encapsulation;

import java.time.LocalDate;

public class Person {
    public static void main(String[] args) {
        startEngine();
    }

    // properties, attributes, data
    private int age;
    private String name;
    private LocalDate dob;

    // methods , behaviours
    public void sing(){

    }
    public void program(){

    }

    public static void startEngine(){  // this only access the public method not the private variable or methods
        // and tis way providing the controlled access and secutity
        Engine engine = new Engine();
        engine.start();
    }
}
