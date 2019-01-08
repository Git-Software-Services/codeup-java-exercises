import java.util.Scanner;

public class ConsoleExercises {
    public static void main (String[] args) {
        double pi = 3.14159f;
//        System.out.print("The value of pi is approximately " + pi);
        System.out.format("The value of pi is approximately %.2f\n", pi);

        Scanner scanner = new Scanner (System.in).useDelimiter("\n");
//

        System.out.print("Enter a number.");
        int userInput = scanner.nextInt();
        System.out.format("The number you entered is %d \n", userInput);


        System.out.print("Enter a word: ");
        String firstWord = scanner.next();
        System.out.print("Enter a second word: ");
        String secondWord = scanner.next();
        System.out.print("Enter a third word: ");
        String thirdWord = scanner.next();
        System.out.format("The words you entered were: \n%s \n%s \n%s\n", firstWord, secondWord, thirdWord);

        System.out.print("Enter a sentence: ");
        String userSentence = scanner.next();
        System.out.format("The sentence you entered was: \n%s", userSentence);


        System.out.print("Guess classroom width:");
        double userWidthGuess = Double.parseDouble(scanner.next());
        System.out.print("Guess classroom length:");
        double userLengthGuess = Double.parseDouble(scanner.next());
        System.out.print("Guess classroom height:");
        double userHeightGuess = Double.parseDouble(scanner.next());
        double perimeter = (userWidthGuess + userWidthGuess) * (userLengthGuess + userLengthGuess);
        double area = userLengthGuess * userWidthGuess;
        double volume = userLengthGuess * userHeightGuess * userWidthGuess;
        System.out.format("The user width and length:\nWidth is %s \n Length is %s\n height is %s\n perimeter is %s\n area is %s \n volume is %s", userWidthGuess, userLengthGuess, userHeightGuess, perimeter, area, volume);

    }
}
