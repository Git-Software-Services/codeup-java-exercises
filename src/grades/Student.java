package grades;

import java.util.ArrayList;

public class Student {
    public static void main(String[] args) {
//        Student dorian = new Student("Dorian");
//        Student sarah = new Student("Sarah");
//        Student justin = new Student("Justin");
//        justin.addGrade(77);
//        justin.addGrade(71);
//        justin.addGrade(72);
//        sarah.addGrade(82);
//        dorian.addGrade(95);
//        System.out.println(justin.getNames());
//        System.out.println(sarah.grades);
//        justin.getGradeAverage();
//        System.out.println(justin.grades);

    }

    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    //constructor
    public Student(String names) {
        this.name = names;
    }

    // returns the student's name
    public String getNames() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double total = 0;
        double avg = 0;
        for (int i = 0; i < grades.size(); i++) {
            total += grades.get(i);
        }
            avg = total / grades.size();
//            System.out.printf("The Average IS: %.2f%n", avg);
            return avg;
    }

}
