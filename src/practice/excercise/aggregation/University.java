package practice.excercise.aggregation;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class University {
    /*
    Aggregation Assignment (University & Students)
    Scenario:
    A University has multiple students, but students can exist independently.
            Task:
    Create a Student class with name and rollNo.
    Create a University class containing multiple Student objects.
    Students should exist even if the University is removed.

     */
    List<Student> studentList;
public University(){
    studentList = new ArrayList<>();
    System.out.println("In the University!");
}
    public void addStudent(Student student ) {
    studentList.add(student);
        System.out.println("Student added: "+student);
    }
    public void removeStudent(Student student ) {
    studentList.remove(student);
        System.out.println("Student removed: "+student);
    }
 public void showStudentList(){
    if(studentList.isEmpty()) {
        System.out.println("Student list is empty!");
    }
    else{
        System.out.println(" Printing student list:");
        for(Student student : studentList)
            System.out.println(student);
    }

 }
 public void destroyUniversity(){
     System.out.println("Destroying University!");
    studentList.clear();
 }
}
