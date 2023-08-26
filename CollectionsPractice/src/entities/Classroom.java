package entities;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private List<Student> students;

    public Classroom(){
        students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(Student student){
        students.remove(student);
    }

    public double calculateAverage(){
        double media = 0.0;
        for (Student student : students) {
            media += student.calculateAverage();
        }
        media /= students.size();
        return media;
    }

    @Override
    public String toString(){
        String result = "# CLASSROOM PERFORMANCE #" + "\n" + "\n";
        for(int i = 0; i < students.size(); i++){
            result += "===== Student " + (i + 1) + " =====" + "\n";
            result += students.get(i) + "\n";
        }
        result += "Classroom average grade: " + String.format("%.1f", calculateAverage()) + "\n";
        return result;
    }
}
