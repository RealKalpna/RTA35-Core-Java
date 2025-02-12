package com.kalpna.learning.core.controlflowStatement;

import com.sun.security.jgss.GSSUtil;

public class WhileLoopExamples {
    public static void main(String[] args) {
        System.out.println("In for loop");
        int i = 0;
        for (; i < 10; ){ // this is basically using for loop as while loop
            System.out.println(i);
            i++;
        }
        System.out.println("In while loop");
        int j = 0;
        while (j < 10){
            System.out.println(j);
            j++;
        }

    }
}
