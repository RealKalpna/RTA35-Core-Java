package com.kalpna.learning.core.operators;

public class BitwiseOperators {


    public static void main(String[] args) {

    int num1 = 5; // Binarry representation of 5 is 0000 0101
    int num2 = 3; // Binary representation of 3 is  0000 0011

        //---------------------------------------
        // Bitwise AND 5 & 3 = 1                    00000001
        // Bitwise OR  5 | 3 = 7                    00000111
        // Bitwise NOT ~num1 ~5 = -6                11111010
        // Bitwise XOR 5 ^ 3 =  6                    00000110

        System.out.println("num1 & num2 ::"+(num1 & num2));
        System.out.println("num1 | num2 ::"+(num1 | num2));
        System.out.println("num1 ^ num2 ::"+(num1 ^ num2));
        System.out.println("~num1 ::"+(~num1));

    int newNumber =  -405;
        System.out.println("Binary newNUmber is ::"+newNumber);
        System.out.println("Binary String of newNUmber::"+Integer.toBinaryString(newNumber));

    }


}
