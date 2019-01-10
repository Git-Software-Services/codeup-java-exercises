import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
    public static void main (String[] args) {

        int additionAnswer = add(5, 7);
        System.out.println(additionAnswer);

        int subtractionAnswer = sub(5, 7);
        System.out.println(subtractionAnswer);

        int multiplicationAnswer = multiply(5, 7);
        System.out.println(multiplicationAnswer);

        double divisionAnswer = divide(0, 14);
        System.out.println(divisionAnswer);

        int modulusAnswer = modulo(7, 5);
        System.out.println(modulusAnswer);

        int getIntegerAnswer = getInteger(2, 10);
        System.out.println("Get Integer Solution is: ");
        System.out.println(getIntegerAnswer);

        int userInput = getInteger(1, 10);
        System.out.format("The factorial for %s is: %s\n",userInput, getFactorial(userInput));

        rollDice(6);


    }
    public static int add (int num1, int num2) {
        return num1 + num2;
    }
    public static int sub (int num1, int num2) {
        return num1 - num2;
    }
//    public static int multiply (int num1, int num2) {
//        int product = 0;
//        for (int i = 1; i <= num2; i++) {
//            product = product + num1;
//        }return product;
//    }

    //multiplying without * operator from teacher (Does NOT work with doubles)
    public static long multiplying(long a, long b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        long product = 0;
        if (b > 1) {
            do {
                product +=a;
                b--;
            }while(b >= 1);
        }else {
            do {
                product-= a;
                b++;
            }while(b <= -1);
        }
        return product;
    }

    //multiply using recursion
    //Only works with a positive num2
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
    public static double divide (int num1, int num2) {

            return num1 / num2;
    }

    public static int modulo (int num1, int num2) {
        return num1 % num2;
    }

    public static int getInteger(int min, int max) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        System.out.format("Enter a number between %s and %s: \n", min, max);
        int userAnswer = scan.nextInt();
        if (userAnswer >= min && userAnswer <= max) {
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

    //Dice roll
    public static void rollDice (int diceNumber) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Would you like to roll the dice? [y/n]");
        String userConfirm = scan.next();
            System.out.print("Enter the number of sides for a pair of dice.");
        int numberOfSides = scan.nextInt();
        do {
            Random rand = new Random();
            int diceOneRoll = rand.nextInt(numberOfSides) + 1;
            int diceTwoRoll = rand.nextInt(numberOfSides) + 1;
            System.out.format("Your dice roll returned number %s and %s \n", diceOneRoll, diceTwoRoll);
            userConfirm = "n";
            System.out.println("Roll again? [y/n]");
            userConfirm = scan.next();

        }while (userConfirm.equalsIgnoreCase("y"));
    }

}
