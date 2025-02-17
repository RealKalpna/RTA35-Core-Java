package practice.excercise.aggregation;

public class Student {
    /*Aggregation Assignment (University & Students)
Scenario:
A University has multiple students, but students can exist independently.
Task:
Create a Student class with name and rollNo.
Create a University class containing multiple Student objects.
Students should exist even if the University is removed.
     */
private String name;
private int rollNo;

public Student(String name, int rollNo){
    this.name = name;
    this.rollNo = rollNo;

}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

}
