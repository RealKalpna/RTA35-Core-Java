package com.kalpna.learning.core.operators;

public class ArthmeticOpertors {
    public static void main(String[] args) {
        int number1 = 2;
        int number2 = 4;
        int sum = number1+number2;
        int sub = number1-number2;
        int mul = number1*number2;


        sum += mul; // sum = sum+mul;
        System.out.println(sum);

    }
}
