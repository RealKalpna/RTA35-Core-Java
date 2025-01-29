package com.kalpna.learning.core.operators;

public class TernaryOperators {

    public static void main(String[] args) {


        int number = 1010;
        if (number % 2 == 0) {
            System.out.println("Number " + number + "is even.");
        } else {
            System.out.println("Number " + number + " is odd.");
        }

            boolean isOdd = number % 2 == 0 ? false : true;

        // or use in one line logic

        //( Ternary operator) ex: condition ? result1 : result2

           String isEvenOrOdd = number % 2 == 0 ? "Number " + number + "is even." : "Number " + number +" is odd.";
           System.out.println("Number " + number + "is " +isEvenOrOdd);

        }
    }

