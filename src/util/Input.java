package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    String getString() {
        return scanner.next();
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return scanner.next();
    }

    public boolean yesNo() {
        String userInput = scanner.next();
        if (userInput.equalsIgnoreCase("yes") ||
                userInput.equalsIgnoreCase("y") ||
                userInput.equalsIgnoreCase("yea") ||
                userInput.equalsIgnoreCase("yep")
        ) {
            return true;
        }
        return false;
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String userInput = scanner.next();
        if (userInput.equalsIgnoreCase("yes") ||
                userInput.equalsIgnoreCase("y") ||
                userInput.equalsIgnoreCase("yea") ||
                userInput.equalsIgnoreCase("yep")
        ) {
            return true;
        }
        return false;
    }



    public int getInt(int min, int max) {

        System.out.format("Enter a number between %s and %s: \n", min, max);
        int userAnswer = 0;
        try {
            userAnswer = Integer.valueOf(scanner.next());

            if (userAnswer >= min && userAnswer <= max) {
                return userAnswer;
            } else {
                return getInt(min, max);
            }
        }
        catch(NumberFormatException e){
            System.out.println("Invalid entry, please enter a number");
        }return userAnswer;
    }



    public int getInt(String prompt, int min, int max) {

        System.out.println(prompt);
        int userAnswer = 0;
        try {
            userAnswer = Integer.valueOf(scanner.next());
            if (userAnswer >= min && userAnswer <= max) {
                return userAnswer;
            } else {
                return getInt(min, max);
            }
        }
        catch(NumberFormatException e){
            System.out.println("Invalid entry, please enter a number");
        }
        catch(InputMismatchException e){
            System.out.println("Invalid entry, please enter a number");
        }return userAnswer;
    }



     public int getInt() {
        String userInput;
        System.out.println("Enter a number...");
        try {
            userInput = scanner.next();
            return Integer.valueOf(userInput);
        }
        catch (Exception e){
            System.out.println("Invalid entry, please enter a number");
            return getInt();
        }
    }



    public int getInt(String prompt) {
        System.out.println(prompt);
        return getInt();
    }



    public double getDouble(double min, double max) {
        double userAnswer;
        System.out.format("Enter a number between %s and %s: ", min, max);
        try {
             userAnswer = Double.valueOf(scanner.next());
            if (userAnswer >= min && userAnswer <= max) {
                return userAnswer;
            } else {
                return getDouble(min, max);
            }
        }
        catch (NumberFormatException e){
            System.out.println("Invalid entry, please enter a number");
            return getDouble();
        }
    }



    public double getDouble(String prompt, double min, double max) {
        double userAnswer = 0;
        System.out.println(prompt);
        try {
            userAnswer = Double.valueOf(scanner.next());
            if (userAnswer >= min && userAnswer <= max) {
                return userAnswer;
            } else {
                return getDouble(min, max);
            }
        }
        catch (NumberFormatException e){
            System.out.println("Invalid entry, please enter a double number");
        }return userAnswer;
    }



    public double getDouble() {
        String userAnswer;
        try {
            userAnswer = scanner.next();
            return Double.valueOf(userAnswer);
        }
        catch (Exception e){
            System.out.println("Invalid entry, please enter a double number");
            return getDouble();
        }
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
       return getDouble();
    }


    public Input(){
        scanner = new Scanner(System.in).useDelimiter("\n");
    }


    public static void main(String[] args) {
        Input myInput = new Input();
//
//////        myInput.getString();
////        myInput.getString("Enter your name: \n");
//////        myInput.yesNo();
////        myInput.yesNo("Do you like dogs?\n");
//////        myInput.getInt(4, 10);
////        myInput.getInt("Enter a number between 4 and 10: \n", 4, 10);
//////        myInput.getInt();
        myInput.getInt("Enter a number: \n");
//////        myInput.getDouble(2.3, 4.6);
////        myInput.getDouble("Enter a double number between 2.3 and 4.6:\n ",2.3, 4.6);
//////        myInput.getDouble();
////        myInput.getDouble("Enter a double number: \n");

    }//End of main

}//End of Class
