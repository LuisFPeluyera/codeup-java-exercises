package util;

import java.util.Scanner;

public class Input {


    private final Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        String userInput = scanner.nextLine();
        System.out.println(userInput);
        return userInput;
    }

    public boolean yesNo(){
        System.out.println("Enter yes or no!");
        String userInput = scanner.nextLine();
        System.out.println(userInput.equalsIgnoreCase("yes"));
        return (userInput.equalsIgnoreCase("yes"));
    }

    public int getInt(int min, int max){
        System.out.printf("Enter a number between %d and %d%n", min, max);
        int userInput = scanner.nextInt();

        if(userInput < min || userInput> max) {
           return getInt(min,max);

        }
        System.out.println(userInput);
        return userInput;

    }

    public int getInt(){
        System.out.println("Enter number");
        int userInput = scanner.nextInt();
        System.out.println(userInput);
        return userInput;
    }

    public double getDouble(double min, double max){
        System.out.printf("Enter a number between %f and %f%n", min, max);
        double userInput = scanner.nextDouble();

        if(userInput < min || userInput> max) {
            getDouble(min,max);

        }
        System.out.println(userInput);
        return userInput;
    }

    public double getDouble(){
        System.out.println("Enter number");
        int userInput = scanner.nextInt();
        System.out.println(userInput);
        return userInput;
    }



    public static void main(String[] args) {

        Input myInput = new Input();
//        myInput.getString();
//        myInput.yesNo();
//        myInput.getInt(1,10);
//        myInput.getInt();
        myInput.getDouble(0,1);
//        myInput.getDouble();
    }
}


