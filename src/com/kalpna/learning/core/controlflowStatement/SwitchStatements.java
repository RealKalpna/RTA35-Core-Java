package com.kalpna.learning.core.controlflowStatement;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        System.out.println("Main method Started");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name for the application");
        String name = scan.nextLine();
        switchStatement(name);
        System.out.println("Enter the age");
        int age = scan.nextInt();
        ifSwitchStatement(age);
        System.out.println(" Main method ended");
    }

        private static void switchStatement (String name){
            System.out.println("Entering switchStatement method ");

            switch (name) {
                case "Abby":
                    System.out.println(" I am good at data analysis");
                    break;
                case "Betty":
                    System.out.println(" I am good at management");
                    break;
                case "John":
                    System.out.println(" I am ready to work");
                    break;
                case "Mary":
                    System.out.println(" I have experienced in Java");
                    break;
                default:
                    System.out.println("I am learning!");
                    break;
            }
            System.out.println("Exiting switchStatement");

        }


    private static void ifSwitchStatement(int age) {
        System.out.println("Entering switchStatement method ");

        switch (age) {
            case 20:
                System.out.println(" You are minor");
                break;
            case 21:
                System.out.println(" You are adult");
                break;
            case 26:
                System.out.println(" You are an adult");
                break;
            default:
                System.out.println("Wrong input,Please enter the age!");
                break;
        }
        System.out.println("Exiting ifSwitchStatement");


    }
}

