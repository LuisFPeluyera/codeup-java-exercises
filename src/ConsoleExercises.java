import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        //       double pi = 3.14159;

//        System.out.println("The value of pi is ");
//        ////////////////////////////////////////////
//
//        System.out.println("What's the value of pi?");

//         Scanner myScanner = new Scanner(System.in);
//         System.out.println("Enter an integer: ");
//         int userInput = myScanner.nextInt();
//         System.out.println(userInput);

//        System.out.printf("The value of pi is %s", userInput);

        ////////////////////////////////////////////

//        System.out.println("Enter three words: ");
//        Scanner myScanner = new Scanner(System.in);
//
//        String userInput1  = myScanner.next();
//        System.out.println(userInput1);
//
//        String userInput2 = myScanner.next();
//        System.out.println(userInput2);
//
//        String userInput3 = myScanner.next();
//        System.out.println(userInput3);
        Scanner myScanner = new Scanner(System.in);
//        System.out.println("Enter a sentence: ");


//        myScanner.useDelimiter("\n");
//        String mySentence = myScanner.nextLine();
//        System.out.println("you entered " + mySentence);

        System.out.println("Enter length and width");


        int myLength = Integer.parseInt(myScanner.next());
        int myWidth = Integer.parseInt(myScanner.next());

        System.out.printf("You enter %s and %s as length and width. your perimeter is %s and your area is %s",myLength,myWidth, ((myWidth*myLength)* 2),(myLength*myWidth));


    }
}
