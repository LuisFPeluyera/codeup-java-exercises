package practice;

import java.util.Objects;
import java.util.Scanner;

public class CodeRunner{



    public static void main(String[] args){

        boolean flag = true;

        do {
            Scanner myScanner = new Scanner(System.in);
            System.out.println("Enter a Number:");
            int userInput = myScanner.nextInt();

            System.out.println(userInput % 5 == 0 && userInput % 3 == 0 ? "FizzBuzz" : userInput % 5 == 0 ? "Fizz" : userInput % 3 == 0 ? "Buzz" : userInput);
            myScanner.nextLine();
            System.out.println("Would you like to continue? Y/N");
            String input = myScanner.nextLine();

            flag = (Objects.equals(input, "Y") || Objects.equals(input, "y"));

        } while(flag);

    }
}
