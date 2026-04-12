import java.util.*;

public class Student {

    int rollno;
    String name;

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    void display() {
        System.out.println(rollno + " " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(7, "Harshita");
        Student s2 = new Student(10, "Messi");

        s1.display();
        s2.display();
    }
}