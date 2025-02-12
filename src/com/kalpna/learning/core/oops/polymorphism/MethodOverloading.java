package com.kalpna.learning.core.oops.polymorphism;

class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;

    }

    public double add(double a, double b) {
        return a + b;
    }
}


public class MethodOverloading{
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(10, 20));
        System.out.println(calculator.add(20,30,40));
        System.out.println(calculator.add(10.20,10.30));



    }


}



