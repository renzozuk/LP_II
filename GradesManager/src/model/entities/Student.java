package model.entities;

public class Student {
    private String name;
    private Exam exam1;
    private Exam exam2;

    public Student(String name, Exam exam1, Exam exam2) {
        this.name = name;
        this.exam1 = exam1;
        this.exam2 = exam2;
    }

    public double calculateAverage(){
        return (exam1.calculateExamGrade() + exam2.calculateExamGrade()) / 2.0;
    }

    @Override
    public String toString(){
        return "Name: " +  name + "\n"
                + "Exam 1: " + String.format("%.1f%n", exam1.calculateExamGrade())
                + "Exam 2: " + String.format("%.1f%n", exam2.calculateExamGrade())
                + "Average grade: " + String.format("%.1f%n", calculateAverage());
    }
}
