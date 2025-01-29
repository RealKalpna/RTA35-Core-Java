package com.kalpna.learning.core.operators;

public class LargestOfThreeNUmbersUsingTernaryOrperators
{
    public static void main(String[] args) {

        int num1 = 10, num2 = 55, num3 = 30;
         int largestOfThree = num1 > num2 ? num1 > num3 ? num1: num3: num2 > num3 ? num2 : num3;
          System.out.println("Largets of three is : "+largestOfThree);

    }
}
