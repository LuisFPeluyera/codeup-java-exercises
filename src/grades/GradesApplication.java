package grades;

import java.util.*;

public class GradesApplication {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        Student student1 = new Student("Pedro");
        student1.addGrade(100);
        student1.addGrade(90);
        student1.addGrade(80);

        Student student2 = new Student("Paul");
        student2.addGrade(50);
        student2.addGrade(60);
        student2.addGrade(78);

        Student student3 = new Student("Steve");
        student3.addGrade(72);
        student3.addGrade(79);
        student3.addGrade(78);

        Student student4 = new Student("Kevin");
        student4.addGrade(100);
        student4.addGrade(98);
        student4.addGrade(97);


        HashMap<String, Student > students = new HashMap<>();

       students.put("github",student1);
       students.put("paul@github",student2);
       students.put("Steventhecoder",student3);
       students.put("kevingit",student4);




        System.out.println("Enter \"grades\" to see all students grades ** Enter \"average\" to see full class report ** Enter \"report\" to see full class report.");

        for (String usernames: students.keySet()) {
            System.out.print("|" + usernames + "| ");


        }
        System.out.println("\n");





        boolean flag = true;

         do {
             System.out.println("What student would you like to see more information on?");
             String userInput = myScanner.nextLine();

            if (students.containsKey(userInput)) {

                System.out.println("Name: " + students.get(userInput).getName() + " - GitHub Username: " + userInput);
                System.out.println("Current Average: " + students.get(userInput).getGradeAverage());
                System.out.println(Arrays.toString(students.get(userInput).getGrade()));
            } else if (userInput.equals("grades")){
                students.forEach((k, v) -> System.out.println( "Name: " + v.getName() + ", GitHub: " + k + ", Grades: " + Arrays.toString(v.getGrade())));

            } else if(userInput.equals("average")){

                //todo create method to get all students average************************************
                System.out.println("method coming soon");

            } else if(userInput.equals("report")){
                System.out.println("name,github_username,average");
                students.forEach((k, v) -> System.out.println( v.getName() +", "+  k +", " + Arrays.toString(v.getGrade())));

                //todo fix the getAverage or create new method for all students*****************************
                System.out.println("averages coming soon");

            } else {

                System.out.println("Sorry, no student found with the GitHub username of \"" + userInput + "\".");

            }

            System.out.println("Would you like to see another student?");
            userInput = myScanner.nextLine().toLowerCase();
            flag = !userInput.equals("n");




        } while (flag);

    }
}
