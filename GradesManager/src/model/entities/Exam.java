package model.entities;

import model.exceptions.InvalidGradeException;

public class Exam {
    private double gradePart1;
    private double gradePart2;

    public Exam(double gradePart1, double gradePart2){
        if(gradePart1 < 0.0 || gradePart2 < 0.0){
            throw new InvalidGradeException();
        }
        this.gradePart1 = gradePart1;
        this.gradePart2 = gradePart2;
    }

    public double calculateExamGrade(){
        return Math.min(gradePart1 + gradePart2, 10.0);
    }
}
