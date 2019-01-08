import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
//
        //while loop example
//        int i = 5;
//        while (i <= 15){
//            System.out.print(i);
//            i++;
//        }
//        //do while loop example
////        int j = 0;
//        int j = 100;
//        do{
////            System.out.println(j);
////            j+= 2;
//            System.out.print("\n" +j);
//            j-= 5;
//        }
////        while (j <= 100);
//        while (j >= -10);
//
//    //another do while loop example
//    long x = 2;
//        do{
//        System.out.println(x);
//        x = x * x;
//    }
//        while (x < 1000000);
//
//
//    //for loop example
//        for (int y = 5; y <= 15; y++){
//            System.out.print(y);
//        }
//        //another for loop example
////        for (int z = 0; z <= 100; z+=2){
////            System.out.println(z);
//            for (int w = 100; w >= -10; w-=5){
//            System.out.print("\n" + w);
//        }
//        //another for loop example
//        for (long d = 2; d <= 1000000; d *= d) {
//            System.out.println(d);
//        }

//    //Fizzbuzz
//        for (int e = 1; e <= 100; e++){
//            if (e % 3 == 0 && e % 5 == 0) {
//                System.out.println("FizzBuzz yo!");
//                continue;
//            }
//            if (e % 3 == 0) {
//                System.out.println("Fizz");
//                continue;
//
//            }if (e % 5 == 0) {
//                System.out.println("Buzz");
//                continue;
//
//            }
//                System.out.println(e);
//            }

        //Display a table of powers
        String userChoice;
        do {

            System.out.print("What number would you like to go up to?");
            int userInput = scan.nextInt();
            System.out.println("Here is your table!");
            System.out.println("------ | ------ | -----");
            for (int i = 1; i <= userInput; i++) {
                int userInputSquared = (int) Math.pow(i, 2);
                int userInputCubed = (int) Math.pow(i, 3);
                System.out.format("%-6d | %-7d | %-5d%n", i, userInputSquared, userInputCubed);

            }
            System.out.println("Do you want to print another number?");
            userChoice = scan.next();
        } while (userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes"));

    }//end main
}//end class


