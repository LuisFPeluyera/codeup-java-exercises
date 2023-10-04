import java.util.Scanner;

public class Bob {

    public static void main (String[] args) {

        boolean continueFlag = false;

        do {
            System.out.println("Hello user I'm Bob!");
            Scanner myScanner = new Scanner(System.in);

            String userInput = myScanner.nextLine();

            if (userInput.endsWith("?")) {

                System.out.println("Sure");
            } else if (userInput.endsWith("!")) {

                System.out.println("Whoa, chill out!");
            } else if (userInput.equals("")) {

                System.out.println("Fine. be that way!");
            } else {
                System.out.println("Whatever.");
            }

            System.out.println("Do you still want to chat? YES/NO");

            String answer = myScanner.nextLine();

            if (answer.toLowerCase().equals("yes")) {
                continueFlag = true;
            } else {
                continueFlag = false;
            }

        } while(continueFlag);
    }

}
