package grades;

import java.util.ArrayList;
import java.util.Objects;

public class Student {

    private String name;
    private ArrayList<Integer> grade;

    Student(String name){
        this.name = name;
        this.grade =  new ArrayList<Integer>();
    }

    public String getName(){
        return this.name;
    }
    public Object[] getGrade(){
        return this.grade.toArray();
    }

    public void addGrade(int grade){
        this.grade.add(grade);
    }



    public double getGradeAverage(){

        int gradeAverage = 0;
        for (Integer grade:this.grade) {
            gradeAverage += grade;
        }
        return (gradeAverage/this.grade.size());
    }





}
