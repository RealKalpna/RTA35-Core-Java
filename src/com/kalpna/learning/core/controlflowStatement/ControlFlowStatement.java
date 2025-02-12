package com.kalpna.learning.core.controlflowStatement;

import java.sql.SQLOutput;

public class ControlFlowStatement {
    public static void main(String[] args) {
        System.out.println("Main method started");
        ifElseStatement();
        System.out.println("Main method ended");
    }

    public static void ifElseStatement() {
        System.out.println("Entering ifElseStatment");

        int age = 21;
        String name = new String("Kalpna");
        if (age >= 18 && name.equalsIgnoreCase("Kalpna") ) {
            System.out.println("Kalpna, You are an adult.");
        } else if (age >= 18) {
            System.out.println("You are an adult.");
        } else if (!name.equalsIgnoreCase("Kalpna")) {
            System.out.println("You are not Kalpna.");
        } else {
            System.out.println("You are minor.");
        }

        System.out.println("Exiting ifElseStatment");
    }


}
