package com.kalpna.learning.core.oops.encapsulation;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EncapsulationExample {

    public static void main(String[] args) {

        Student kalpna = new Student();
       // kalpna.name = "Kalpna"; we cant access private variables of the class using object, only by using public getters and setters we can acces
        kalpna.setName("Kalpna");
        kalpna.setAge(30);
        kalpna.setRollNumber(9);
        System.out.println(kalpna);

        Student bharati = new Student();
        bharati.setName("Bharati");
        bharati.setAge(20);
        bharati.setRollNumber(3);
        System.out.println(bharati);


        Student krish = new Student();
        krish.setName("Karish");
        krish.setAge(37);
        krish.setRollNumber(19);
        System.out.println(krish);

        //Taking inputs from users
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the student name: ");
        String name = scan.nextLine();

        System.out.println("Enter the student age: ");
        int age = scan.nextInt();

        System.out.println("Enter the student roll number: ");
        int rollNumber = scan.nextInt();

        System.out.println(" The student details are: "+ name +", "+age+ ", "+rollNumber );

    }
}

class Student{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        if(age <1){
            throw new RuntimeException("Age should be positive number.");
        }
        this.age = age;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    private int age;
    private int rollNumber;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollNumber=" + rollNumber +
                '}';
    }
}