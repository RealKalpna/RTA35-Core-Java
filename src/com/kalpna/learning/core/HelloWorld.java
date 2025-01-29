package com.kalpna.learning.core;

import java.io.File;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        int counter = 10;
        counter++;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, "+name);



        method1(counter);
    }

    public static void method1(int counter) {
        System.out.println("Inside method1!");
        counter++;
        System.out.println("Counter value after method1:"+counter);
        method2(counter);

    }
    public static void method2(int counter) {
        System.out.println("inside method2");
        counter++;
        System.out.println("counter value after method2:"+counter);


    }


}
