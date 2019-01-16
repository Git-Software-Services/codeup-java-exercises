import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson (Person[] teamMembers, Person teamMember) {
        final int NUMBER_OF_TEAMMEMBERS = teamMembers.length + 1;

        Person[] allTeamMembers = Arrays.copyOf(teamMembers, NUMBER_OF_TEAMMEMBERS);
        allTeamMembers[allTeamMembers.length - 1] = teamMember;

        for (Person individual : allTeamMembers) {
            System.out.println(individual.getName());
        }return allTeamMembers;
    }
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
//        System.out.println(Arrays.toString(numbers));

        Person[] teamMembers = new Person[3];
        teamMembers[0] = new Person("Dorian");
        teamMembers[1] = new Person("Sarah");
        teamMembers[2] = new Person("Justin");

        Person addMember = new Person("Jen");
//
//        for (Person teamMember: teamMembers) {
//            System.out.println(teamMember.getName());
//
//        }
            addPerson(teamMembers, addMember);
    }
}


//import util.Input;
//
//public class ArrayDemo {
//    public static void main(String[] args) {
//        // example: make an array of 4 integers
//        // declare an array of integers
//        int[] numbers = new int[4];
//        numbers[0] = 10;
//        numbers[1] = 9;
//        numbers[2] = 8;
//        numbers[3] = 7;
//
//        // java foreach
//        for(int x : numbers) {
//            System.out.println(x*1000);
//        }
//
//        Input input = new Input();
//        int numberOfNames = input.getInt("how many names?");
//
//        String[] names = new String[numberOfNames];
//
//        int i = 0;
//        do {
//            names[i] = input.getString("What is the name?");
//            i++;
//        } while(i < names.length);
//
//        // Java's forEach loop
//        for(String name: names) {
//            System.out.println("-----");
//            System.out.println(name);
//        }
//    }
//}