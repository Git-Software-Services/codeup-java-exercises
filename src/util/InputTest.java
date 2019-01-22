package util;


public class InputTest {
    public static void main(String[] args) {
        Input myInput = new Input();

//        myInput.getString();
//        myInput.getString("Enter your name: \n");
//        myInput.yesNo();
//        myInput.yesNo("Do you like dogs?\n");
//        myInput.getInt(4, 10);
//        myInput.getInt("Enter a number between 4 and 10: \n", 4, 10);
//        myInput.getInt();
//        myInput.getInt("Enter a number: \n");
        myInput.getDouble(2.3, 4.6);
//        myInput.getDouble("Enter a double number between 2.3 and 4.6:\n ",2.3, 4.6);
//        myInput.getDouble();
//        myInput.getDouble("Enter a double number: \n");
    }
}


//package util;
//
//public class InputTest {
//    public static void main(String[] args) {
//        // dataType variableName = new ClassName();
//        Input input = new Input();
//
//        if(input.yesNo("Do you want to enter a number?")) {
//            int favoriteNumber = input.getInt("What is your favorite number?");
//            System.out.println("You said " + favoriteNumber);
//
//        }
//
//        if(input.yesNo("Do you want to exit the application?")) {
//            System.exit(0);
//        }
//
//        String name = input.getString("What is your name?");
//        System.out.println("Hello, " + name + "!");
//
//    }
//}


//package util;
//
//        import java.util.Scanner;
//
//public class Input {
//    Scanner scanner;
//
//    // constructor returns an Input object
//    public Input() {
//        scanner = new Scanner(System.in).useDelimiter("\n");
//    }
//
//    public boolean yesNo() {
//        String input = getString();
//        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
//    }
//
//    public boolean yesNo(String prompt) {
//        System.out.println(prompt);
//        return yesNo();
//    }
//
//    public int getInt() {
//        return scanner.nextInt();
//    }
//
//    public int getInt(String prompt) {
//        System.out.println(prompt);
//        return getInt();
//    }
//
//    public int getInt(int min, int max) {
//        int userInt = getInt();
//        if(userInt >= min && userInt <= max) {
//            return userInt;
//        } else {
//            System.out.println("The integer must be between " + min + " and " + max);
//            return getInt(min, max);
//        }
//    }
//
//    public int getInt(int min, int max, String prompt) {
//        System.out.println(prompt);
//        return getInt(min, max);
//    }
//
//    public String getString() {
//        return scanner.next();
//    }
//
//    public String getString(String prompt) {
//        System.out.println(prompt);
//        return getString();
//    }
//
//    public double getDouble() {
//        return scanner.nextDouble();
//    }
//
//    public double getDouble(String prompt) {
//        System.out.println(prompt);
//        return getDouble();
//    }
//
//    public double getDouble(double min, double max) {
//        double userDouble = getDouble();
//        if(userDouble >= min && userDouble <= max) {
//            return userDouble;
//        } else {
//            System.out.println("The double must be between " + min + " and " + max);
//            return getDouble(min, max);
//        }
//    }
//
//    public double getDouble(double min, double max, String prompt) {
//        System.out.println(prompt);
//        return getDouble(min, max);
//    }
//}