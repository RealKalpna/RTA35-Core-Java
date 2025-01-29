package com.kalpna.learning.core.operators;

public class LogicalOperators {
    public static void main(String[] args) {

        // && , || , !

        int a = 10, b = 50;
        System.out.println("Logical operator And :: "+(a > 10 && b > 10));
        System.out.println("Logical operator OR :: "+(a > 10 || b > 10));
        System.out.println("Logical operator NOT :: "+!(b > a));

    }

}
