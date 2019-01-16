package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    String getString() {
        return scanner.next();
    }

    String getString(String prompt){
        System.out.println(prompt);
        return scanner.next();
    }

    boolean yesNo() {
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

    boolean yesNo(String prompt) {
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
        int userAnswer = scanner.nextInt();
        if (userAnswer >= min && userAnswer <= max) {
            return userAnswer;
        } else {
          return getInt(min, max);
        }
    }

    public int getInt(String prompt, int min, int max) {

        System.out.println(prompt);
        int userAnswer = scanner.nextInt();
        if (userAnswer >= min && userAnswer <= max) {
            return userAnswer;
        } else {
            return getInt(min, max);
        }
    }

     public int getInt() {
        System.out.println("Enter a number...");
        return scanner.nextInt();
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        return scanner.nextInt();
    }

    double getDouble(double min, double max) {

        System.out.format("Enter a number between %s and %s: ", min, max);
        double userAnswer = scanner.nextDouble();
        if (userAnswer >= min && userAnswer <= max) {
            return userAnswer;
        } else {
            return getDouble(min, max);
        }
    }

    double getDouble(String prompt, double min, double max) {

        System.out.println(prompt);
        double userAnswer = scanner.nextDouble();
        if (userAnswer >= min && userAnswer <= max) {
            return userAnswer;
        } else {
            return getDouble(min, max);
        }
    }

    double getDouble(){
        System.out.println("Enter a double number...");
        return scanner.nextDouble();
    }

    double getDouble(String prompt){
        System.out.println(prompt);
        return scanner.nextDouble();
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
