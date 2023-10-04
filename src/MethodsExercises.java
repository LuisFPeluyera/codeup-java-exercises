import java.util.Scanner;

public class MethodsExercises {

//   public static int addition(int num1, int num2){
//
//      return num1 + num2;
//   }
//
//   public static int subtraction(int num1, int num2){
//
//      return num1-num2;
//   }
//
//   public static int multiplication(int num1, int num2){
//      return num1 * num2;
//   }
//
//   public static int division(int num1, int num2){
//      return num1/num2;
//   }
//
//   public static int modulus(int num1, int num2){
//      return num1 % num2;
//   }
//
//   public static int noMultiplication(int num1, int num2){
//
//      int result = 0;
//      for (int i = 0; i < num2; i++) {
//         result += num1;
//
//      }
//      return result;
//   }



//   public static long getInteger(int min, int max){
//
//      System.out.printf("Enter a number between %d and %d: ",min, max);
//      Scanner myScanner = new Scanner(System.in);
//      int userInput = myScanner.nextInt();
//      long factorial = 1;
//      for (int i = 1; i <= userInput; i++) {
//         factorial *= i;
//
//      }
//
//      if (userInput<min || userInput>max) {
//         getInteger(min,max);
//      }
//
//      System.out.println(factorial);
//      return factorial;
//
//   }

//   public static long myFactorial (long input){
//      long bucket = 1;
//
//       bucket *= (bucket+1);
//      System.out.println(bucket);
//
//
//      if (bucket<input) {
//         myFactorial(input);
//      }
//      return bucket;
//   }


   public static void main(String[] args) {


      myFactorial(10);


   }


}
