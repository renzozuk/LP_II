package application;

import entities.Classroom;
import entities.Exam;
import entities.Student;

import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Classroom classroom = new Classroom();
        classroom.addStudent(new Student("Yoshio", new Exam(10.0, 10.0), new Exam(10.0, 10.0)));
        classroom.addStudent(new Student("Michelle", new Exam(0.5, 1.5), new Exam(4.0, 3.5)));
        classroom.addStudent(new Student("Peter", new Exam(0.5, 1.0), new Exam(2.0, 1.5)));
        classroom.addStudent(new Student("Maria", new Exam(1.0, 6.0), new Exam(2.5, 2.5)));
        System.out.print(classroom);
    }
}
