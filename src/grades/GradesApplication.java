package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student dorian = new Student("Dorian");
        Student sarah = new Student("Sarah");
        Student justin = new Student("Justin");
        Student jennifer = new Student("Jennifer");
        justin.addGrade(97);
        justin.addGrade(71);
        justin.addGrade(82);
        sarah.addGrade(91);
        sarah.addGrade(82);
        sarah.addGrade(79);
        dorian.addGrade(90);
        dorian.addGrade(85);
        dorian.addGrade(71);
        jennifer.addGrade(60);
        jennifer.addGrade(85);
        jennifer.addGrade(91);
        students.put("kittyKat", dorian);
        students.put("snoopDog", justin);
        students.put("sassy", sarah);
        students.put("llamaBean", jennifer);
        printInfo(students);
    }

    public static void printInfo(HashMap<String, Student> students){

        System.out.println("Welcome!");
        System.out.println(students.keySet());
        Input input = new Input();
        String userInput = input.getString("What student would you like to see more information on?");
//        userInput = userInput.toLowerCase();
        if (students.keySet().contains(userInput)) {
            String studentName = students.get(userInput).getNames();
            double studentAverage = students.get(userInput).getGradeAverage();
            System.out.printf("%s - Github Username: %s\n Current Average: %.2f\n", studentName,userInput, studentAverage);
        }else {System.out.printf("Sorry, no student found with the github username of \"%s\"\n", userInput);
        }

        boolean confirmInput = input.yesNo("Would you like to see another student?");
        if (confirmInput == true){
            printInfo(students);
        }else{
            System.out.println("Goodbye, and have a wonderful day!");
        }
    }
}
