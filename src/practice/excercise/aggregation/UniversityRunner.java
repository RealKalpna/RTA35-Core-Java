package practice.excercise.aggregation;

import java.util.ArrayList;
import java.util.List;

public class UniversityRunner {
    public static void main(String[] args) {

        Student student1 = new Student("Harry", 1);
        Student student2 = new Student("Marry", 2);
        Student student3 = new Student("Jonh", 3);
        Student student4 = new Student("Adam", 4);


        University university = new University();
        university.addStudent(student1);
        university.addStudent(student2);
        university.showStudentList();
        university.destroyUniversity();

        university.showStudentList();
        university.addStudent(student2);
        university.showStudentList();
    }
}
