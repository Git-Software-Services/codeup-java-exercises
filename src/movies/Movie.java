package movies;

public class Movie {
    private String name;
    private String category;

    //constructor
    public Movie(String name, String category) {
        this.name = name;
        this.category = category;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static void main(String[] args) {
////        create a new object Movie >> instantiate Movie class >> give it parameters
//        Movie citizen = new Movie("Citizen Kane", "Drama");
////        check if have constructor and getter method >> know data type of return >> call get method on object
//        String movieName = citizen.getName();
////        sout variable if string
//        System.out.println(movieName);
    }
}
