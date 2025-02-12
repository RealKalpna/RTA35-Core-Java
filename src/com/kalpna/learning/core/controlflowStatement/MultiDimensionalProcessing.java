package com.kalpna.learning.core.controlflowStatement;

public class MultiDimensionalProcessing {
    public static void main(String[] args) {
        starPattern();
    }
    private static void starPattern(){
        int rows = 10;
        for (int i = 1; i <= rows; i++){ //row
            for (int j = 1; j <= i; j++){ //column
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

