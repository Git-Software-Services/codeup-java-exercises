import java.sql.SQLOutput;
import java.util.Scanner;

public class MethodsExercises {
    public static void main (String[] args) {

        int additionAnswer = add(5, 7);
        System.out.println(additionAnswer);

        int subtractionAnswer = sub(5, 7);
        System.out.println(subtractionAnswer);

        int multiplicationAnswer = multiply(5, 7);
        System.out.println(multiplicationAnswer);

        int divisionAnswer = divide(14, 0);
        System.out.println(divisionAnswer);

        int modulusAnswer = modulo(7, 5);
        System.out.println(modulusAnswer);

        int getIntegerAnswer = getInteger(2, 10);
        System.out.println("Get Integer Solution is: ");
        System.out.println(getIntegerAnswer);

        Scanner scan = new Scanner(System.in).useDelimiter("\n");
//        System.out.println("Enter a number between 1 and 10");
        int userInput = getInteger(1, 10);

        System.out.format("The factorial for %s is: %s\n",userInput, getFactorial(userInput));

    }
    public static int add (int num1, int num2) {
        return num1 + num2;
    }
    public static int sub (int num1, int num2) {
        return num1 - num2;
    }
//    public static int multiply (int num1, int num2) {
//        int num = 0;
//        for (int i = 1; i <= num2; i++) {
//            num = num + num1;
//        }return num;
//    }

    //multiply using recursion
public static int multiply (int num1, int num2) {
    if (num1 == 0 || num2 == 0){
        return 0;
    }else {
        if (num1 == 1) {
            return num2;
        }else {
            return num1 + (multiply(num1, num2 - 1));
        }
    }

}
    public static int divide (int num1, int num2) {
        if (num2 == 0){
            System.out.println("Number can't be 0!");
        }else {
            return num1 / num2;
        }return 0;
    }
    public static int modulo (int num1, int num2) {
        return num1 % num2;
    }

    public static int getInteger(int min, int max) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        System.out.format("Enter a number between %s and %s: \n", min, max);
        int userAnswer = scan.nextInt();
        if (userAnswer >= min && userAnswer <= max) {
            System.out.println("This is the correct answer");
            return userAnswer;
        }else {
            int userInput = scan.nextInt(getInteger(min, max));
            return userInput;
        }
    }
    public static long getFactorial(int number) {

        if (number < 1){
            return 1;
        }
        long factorial = number * getFactorial(number - 1);
        return factorial;
    }
}
