package movies;

import util.Input;

import java.util.Scanner;

public class MoviesApplication {

    public static void getMovieCategory(int movieCategorySelection) {
    Input input = new Input();

            String userInput = String.valueOf(movieCategorySelection);
                    System.out.format("user input is %s\n", userInput);

        if (movieCategorySelection < 6 || movieCategorySelection == 9){
                if(userInput.equals("0")) {
                }else if (userInput.equals("9")) {
                    System.out.println("adding a movie");
                    addMovie();
                }else if (userInput.equals("1")){
                    for(Movie singleMovie: MoviesArray.findAll()){
                        System.out.println(singleMovie.getName()  + " " + singleMovie.getCategory());
                    }
                }else if (userInput.equals("2")){
                    for(Movie singleMovie: MoviesArray.findAll()){
                        singleMovie.getCategory();
                        if(singleMovie.getCategory().equals("animated")){
                            System.out.println(singleMovie.getName());
                        }
                    }
                }else if (userInput.equals("3")){
                    for(Movie singleMovie: MoviesArray.findAll()){
                        singleMovie.getCategory();
                        if(singleMovie.getCategory().equals("drama")) {
                            System.out.println(singleMovie.getName());
                        }
                    }
                }else if (userInput.equals("4")){
                        for(Movie singleMovie: MoviesArray.findAll()){
                            singleMovie.getCategory();
                            if(singleMovie.getCategory().equals("horror")) {
                                System.out.println(singleMovie.getName());
                            }
                         }
                }else if (userInput.equals("5")){
                            for(Movie singleMovie: MoviesArray.findAll()) {
                                singleMovie.getCategory();
                                if (singleMovie.getCategory().equals("scifi")) {
                                    System.out.println(singleMovie.getName());
                                }
                            }
                }else {
                    System.out.println("Enter a valid option");

                }
        }  getMovieCategory(input.getInt("Choose another category or enter 1 to exit"));


    }

    public static void addMovie(){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");


        System.out.format("Input your movie title:");
        String userMovieTitle = scan.next();
        System.out.format("Input your movie category:");
        String userMovieCategory = scan.next();
        Movie newUserMovie = new Movie(userMovieTitle, userMovieCategory);
        String movieName = newUserMovie.getName();
        String movieCategory = newUserMovie.getCategory();
        System.out.format("You added %s to the %s category\n",movieName, movieCategory);
    }


    public static void main(String[] args) {
        Input input = new Input();

        getMovieCategory(input.getInt("What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "9 - Add another movie\n" +
                "\n" +
                "Enter your choice:"));
    }

}
