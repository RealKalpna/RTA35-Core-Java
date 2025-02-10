package PracticeExcercise;

import java.util.Scanner;

public class Day1Excercise {

    public static void main(String[] args) {
        System.out.println("Entering main method");

        //Print Numbers from 1 to 10:
        System.out.println("Entering for loop for printing 1-10 number");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //Write a program to print numbers from 10 to 1 using a loop.
        System.out.println("Entering for loop for printing 10-1 number");
        for (int x = 10; x >= 1; x--) {
            System.out.println(x);
        }

        //Print Numbers from 1 to 10 using a while loop.
        System.out.println("Entering while loop");
        int j = 1;
        while (j <= 10) {
            System.out.println(j);
            j++;
        }

        //Print Numbers from 1 to 10 using a do while loop.
        System.out.println("Entering do-while method");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        }
        while
        (k <= 10);

        //Write a program to print even numbers between 1 and 20.
        System.out.println(" Printing even numbers : ");
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(" Number is even " + i);
        }

        //Modify the program to print odd numbers between 1 and 20.
        System.out.println(" Printing odd numbers : ");
        for (int i = 1; i <= 20; i += 2) {
            System.out.println(" Number is odd " + i);
        }

        //Write a program to calculate the factorial of a number using a for loop.
        System.out.println(" Enter number to provide factorial : ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
            System.out.println(" Factorial of n Number is " + factorial);
        }

        //to print the sun of N numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to provide the sum of natural number: ");
        int number = sc.nextInt();
        int sum = 0;
        for(int i = 0 ; i <= number; i++){
            sum += i;
        }
        System.out.println("The sum of first "+number+ " natural number is "+sum);
        sc.close();
    }
}

