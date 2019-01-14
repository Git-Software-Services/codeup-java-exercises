public class Person {

    private String name;

    public String getName(){
          return name;
    }

    public void sayHello(){
        System.out.format("hello there, %s", this.name);
    }

    //Constructor
    public Person(String name){
        this.name = name;
    }

    public static void main (String [] args) {

//        Person person1 = new Person();
//        person1.setName("Dorian");
//        System.out.println(person1.name);

    }//end of main

}//end of class
