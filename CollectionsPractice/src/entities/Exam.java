package entities;

public class Exam {
    private double gradePart1;
    private double gradePart2;

    public Exam(double gradePart1, double gradePart2){
        this.gradePart1 = gradePart1;
        this.gradePart2 = gradePart2;
    }

    public double calculateExamGrade(){
        if(gradePart1 + gradePart2 > 10.0){
            return 10.0;
        }else{
            return gradePart1 + gradePart2;
        }
    }
}
