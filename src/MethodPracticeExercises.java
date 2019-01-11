import java.util.Scanner;

public class MethodPracticeExercises {
    public static void main(String[] args){

       char resultOfLastChar = lastChar("Oh my!");
        System.out.println(resultOfLastChar);

        char resultOfFirstChar = firstChar ("What the mess");
        System.out.println(resultOfFirstChar);

        char resultOfSecondChar = secondChar ("What the mess");
        System.out.println(resultOfSecondChar);

        char resultOfSecondToLastChar = secondToLastChar("What in the world");
        System.out.println(resultOfSecondToLastChar);

        System.out.println("The user wants to continue: " + userWantsToContinue());

        System.out.println("The result of the isEven function is : " + isEven(3));

        System.out.println("The result of the isOdd function is : " + isOdd(3));

        System.out.println("The result of the countOdds function is : " + countOdds(3, 10));

        System.out.println("The result of the countEvens function is : " + countEvens(3, 10));

        System.out.println("The result of isVowel is: " + isVowel("g"));

        System.out.println("The result of hasVowel is: " + hasVowels("oh"));

        System.out.println("The result of countVowel is: " + countVowels("oh my goodness!"));

        System.out.println(fizzBuzz(20));
    } //end of main

    //Write a method named lastChar() that takes a string as an input and returns the last letter as a character data type.
    public static char lastChar(String userInput) {
        return userInput.charAt(userInput.length() - 1);
    }

        //Write a method named firstChar() that takes a string as an input and returns the first letter as a character data type.
        public static char firstChar(String userInput) {
            return userInput.charAt(0);
        }

    //Write a method named secondChar() that takes a string as an input and returns the first letter as a character data type.
    public static char secondChar(String userInput) {
        return userInput.charAt(1);
    }

    //Write a method named secondToLastChar() that takes a string as an input and returns the second to letter as a character data type.
    public static char secondToLastChar(String userInput){
        return userInput.charAt(userInput.length()-2);
    }

    //Write a method named userWantsToContinue(). This method should prompt the user if they want to continue and then return a boolean value if the user inputs "y" or "yes".
    public static boolean userWantsToContinue(){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Do you want to continue?[y or yes]");
        String userAnswer = scan.next();
        if(userAnswer.equalsIgnoreCase("y") || userAnswer.equalsIgnoreCase("yes")) {
            return true;
        }return false;
    }

    //Write a method named isEven() that takes in an integer and returns a boolean if the input is even or not.
    public static boolean isEven(int userInput){
        if (userInput % 2 == 0){
            return true;
        }return false;
    }

    //Write a method named isOdd() that takes in an integer and returns a boolean if the input is odd or not.
    public static boolean isOdd(int userInput){
        if (userInput % 2 != 0){
            return true;
        }return false;
    }

    //Write a method named countOdds(start, end) that returns an integer containing the integer that is the count of all odd numbers between the start and the end input integers.
    public static int countOdds(int start, int end) {
        int accumulator = 0;
        for (int i = start; i <= end; i++){
            if(isOdd(i)) {
                accumulator++;
            }
        } return accumulator;
    }

    //Write a method named countEvens(start, end) that returns an integer containing the integer that is the count of all even numbers between the start and the end input integers.
    public static int countEvens(int start, int end) {
        int accumulator = 0;
        for (int i = start; i <= end; i++){
            if(isEven(i)) {
                accumulator++;
            }
        } return accumulator;
    }

    //Write a method named isVowel() that accepts a String input of length 1 and returns a boolean if that string is a vowel other than "y".
    public static boolean isVowel(String input) {
        if (input.length() > 1) {
            return false;
        }return input.equalsIgnoreCase("a") ||
                input.equalsIgnoreCase("e") ||
                input.equalsIgnoreCase("i") ||
                input.equalsIgnoreCase("o") ||
                input.equalsIgnoreCase("u");
    }

    //Write a method named hasVowels() that accepts a string of any length and returns a boolean if there are any vowels in that string.
    public static boolean hasVowels(String checkForVowels) {
//

            for(int i =0; i <= checkForVowels.length()-1; i++){
                String letter = checkForVowels.charAt(i) + "";
                if(isVowel(letter)){
                    return true;
                }
            }
            return false;
        }

    //Write a method named countVowels() that accepts a string of any length and returns an integer count of the number of vowels in the provided input String.
    public static int countVowels(String userInput){
        int accumulator = 0;
        for (int i = 0; i <= userInput.length()-1; i++){
            String letter = userInput.charAt(i) + "";
            if(isVowel(letter)) {
                accumulator++;
            }
        } return accumulator;
    }

    //Write a solution to FizzBuzz using recursion instead of a loop.
    public static int fizzBuzz(int number) {
        if (number <= 0) {
            return 0;
        }else {
            if (number % 15 == 0) {
//                output += "FizzBuzz\n";
                System.out.println("FizzBuzz");
            } else if (number % 3 == 0) {
//                output += "Fizz\n";
                System.out.println("Fizz");
            } else if (number % 5 == 0) {
//                output += "Buzz\n";
                System.out.println("Buzz");
            } else if (number % 3 != 0 && number % 5 != 0) {
//                output += number + "\n";
                System.out.println(number);
            }
            number -= 1;
        }
        return fizzBuzz(number);

    }//end of fizzbuzz





    } //end of class













//Write a solution to FizzBuzz using recursion instead of a loop.
//
//Write a method named isPrime() that that accepts in an integer number and returns a boolean if the number is evenly divisible only by either 1 or the number itself.
//
//Write a method named getTwentyPrimes() that returns a string containing the first 20 prime numbers, each separated by a comma. Output: "1, 2, 3, 5, 7, 11, 13, 17, 19"... until we have a total count of 20 primes in the string.