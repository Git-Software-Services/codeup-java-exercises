import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main (String[] args) {
        highLowGame();

    }
    public static void highLowGame () {
        int userGuess = 0;
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        Random rand = new Random();
        int randNumber = rand.nextInt(100) + 1;
        System.out.println("Hi there, Guess a number between 1 and 100. You only get 10 tries!");
        int accumulator = 0;

        do{
            accumulator++;
            userGuess = scan.nextInt();
            if (accumulator == 10){
                System.out.println("You've had 10 guesses! \n Try again later...");
            }else {
                if (userGuess < 1 || userGuess > 100) {
                    System.out.println("That number is not between 1 and 100! \nTry again...");
                } else if (userGuess < randNumber) {
                    System.out.format("The number is higher than: %s\n", userGuess);
                } else if (userGuess > randNumber) {
                    System.out.format("The number is lower than: %s\n", userGuess);
                } else if (userGuess == randNumber) {
                    System.out.format("GOOD GUESS!! ... cheater. The number was %s\n", randNumber);
                    System.out.format("The number of guesses was %s\n", accumulator);
                }
            }
        }while(userGuess > 0 && userGuess < 101 && userGuess != randNumber && accumulator < 10);
    }

}
