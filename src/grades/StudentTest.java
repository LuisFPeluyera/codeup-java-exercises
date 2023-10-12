package grades;

import java.util.HashMap;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("pedro");
        System.out.println(student1.getName());
        student1.addGrade(100);
        student1.addGrade(90);
        student1.addGrade(80);



        student1.getGradeAverage();


    }
}
