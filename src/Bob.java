import java.util.Scanner;

public class Bob {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Start a conversation with Bob? [y/n]");
        String userConfirm = scan.next();
        if(userConfirm.equalsIgnoreCase("y")){
//        System.out.print(userConfirm);
            System.out.print("Talk to Bob...\n");
//            String userContinue = "";
            do {
                String userInput = scan.next();
                if (userInput.endsWith("?")) {
                    System.out.print("Sure\n");
                } else if (userInput.endsWith("!")) {
                    System.out.print("Whoa, chill out!\n");
                } else if (userInput.equals("")) {
                    System.out.print("Fine. Be that way\n!");
                } else {
                    System.out.print("Whatever.\n");
        }

            System.out.print("Continue Conversation with Bob? [[y/n]");
             userConfirm = scan.next();
             if (userConfirm.equalsIgnoreCase("y")) {
                System.out.print("Talk to Bob...\n");
             }
            } while (userConfirm.equalsIgnoreCase("y"));

        }
    }
}
