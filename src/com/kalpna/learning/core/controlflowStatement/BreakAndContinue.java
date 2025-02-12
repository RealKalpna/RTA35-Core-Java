package com.kalpna.learning.core.controlflowStatement;

public class BreakAndContinue {
    public static void main(String[] args) {

        System.out.println("Using Break:::");
        for(int i = 1; i <= 5; i++){  // using break
            if(i == 3){
                break; // exit the loop when i is 3
            }
            System.out.println(" Itertion: " +i);
        }

        System.out.println("Using Continue:::");
        for(int j = 0; j <= 5; j++){
            if(j == 2) {
                continue; // skip iteration when j is 2
            }
                System.out.println(" Iteration: "+j);
            }
        }
    }

