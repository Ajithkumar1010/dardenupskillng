package day2;

import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    public int id;
    private int marks;

    public Student(String name, int id, int marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", marks=" + marks +
                '}';
    }
}
public class Main {
    public static void main(String[] args) {
        // Create a list of student objects
        List<Student> students = new ArrayList<>();

        // Add students to the list
        students.add(new Student("John", 1, 85));
        students.add(new Student("Emma", 2, 95));
        students.add(new Student("Michael", 3, 92));
        students.add(new Student("Sophia", 4, 88));
        students.add(new Student("William", 5, 97));

        // Print students with marks above 90
        System.out.println("Students with marks above 90:");
        for (Student student : students) {
            if (student.getMarks() > 90) {
                System.out.println(student);
            }
        }

        // Print students with marks less than 90
        System.out.println("Students with marks less than 90:");
        for (Student student : students) {
            if (student.getMarks() < 90) {
                System.out.println(student);
            }
        }
    }
}

