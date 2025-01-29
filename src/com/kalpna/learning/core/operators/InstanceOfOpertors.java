package com.kalpna.learning.core.operators;

import java.util.Arrays;
import java.util.List;

public class InstanceOfOpertors {

    public static void main(String[] args) {

        Integer data = 10;
        // we cannot check instanceOfOperator on primitive data type int data = 10;
        String name = "Kalpna";
        if(name instanceof String){
            System.out.println(" Name is of type String");
        }

        if(data instanceof Integer){
            System.out.println(" data is of type Interger");
        }
        Person person1 = new Student();
        Person person2 = new Employee();
        Person person3= new Scientist();

        List<Person> personList = Arrays.asList(person1 , person2 , person3);
        for(Person person : personList) {
            if(person instanceof Student)
            {
                System.out.println("Apply the Scheme on instance of Student Type " );
            }
            else
            {
                System.out.println(" Don't apply the Scheme on instance of other Type " );

            }
        }


    }
}

class Person { }
class Student extends Person{ }
class Employee extends Person{ }
class Scientist extends Person{ }
