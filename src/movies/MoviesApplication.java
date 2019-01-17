package movies;

import util.Input;

import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {

    public static void getMovieCategory(int movieCategorySelection) {
    Input input = new Input();

        int numberOfMovies = MoviesArray.findAll().length;
        Movie [] newMoviesArray = Arrays.copyOf(MoviesArray.findAll(), numberOfMovies);

            String userInput = String.valueOf(movieCategorySelection);
                    System.out.format("user input is %s\n", userInput);

        if (movieCategorySelection < 6 || movieCategorySelection == 9){
                if(userInput.equals("0")) {
                    System.exit(0);
                }else if (userInput.equals("9")) {
                    System.out.println("adding a movie");
//                    addMovie();

                    Scanner scan = new Scanner(System.in).useDelimiter("\n");
                    System.out.format("Input your movie title:");
                    String userMovieTitle = scan.next();
                    System.out.format("Input your movie category:");
                    String userMovieCategory = scan.next();
                    numberOfMovies = newMoviesArray.length;
                    newMoviesArray = Arrays.copyOf(newMoviesArray, numberOfMovies);

                    Movie newUserMovie = new Movie(userMovieTitle, userMovieCategory);
                    newMoviesArray [newMoviesArray.length - 1] = newUserMovie;


//                    String movieName = newUserMovie.getName();
//                    String movieCategory = newUserMovie.getCategory();
                    System.out.format("You added %s to the %s category\n",userMovieTitle, userMovieCategory);

                }else if (userInput.equals("1")){
                    for(Movie singleMovie: newMoviesArray){
                        System.out.println(singleMovie.getName()  + " " + singleMovie.getCategory());
                    }
                }else if (userInput.equals("2")){
                    for(Movie singleMovie: newMoviesArray){
                        if(singleMovie.getCategory().equals("animated")){
                            System.out.println(singleMovie.getName());
                        }
                    }
                }else if (userInput.equals("3")){
                    for(Movie singleMovie: newMoviesArray){
                        if(singleMovie.getCategory().equals("drama")) {
                            System.out.println(singleMovie.getName());
                        }
                    }
                }else if (userInput.equals("4")){
                        for(Movie singleMovie: newMoviesArray){
                            if(singleMovie.getCategory().equals("horror")) {
                                System.out.println(singleMovie.getName());
                            }
                         }
                }else if (userInput.equals("5")){
                            for(Movie singleMovie: newMoviesArray) {
                                if (singleMovie.getCategory().equals("scifi")) {
                                    System.out.println(singleMovie.getName());
                                }
                            }
                }else {
                    System.out.println("Enter a valid option");

                }
        }  getMovieCategory(input.getInt("Choose another category or enter 0 to exit"));


    }

//    public static void addMovie(){
//        int numberOfMovies = MoviesArray.findAll().length + 1;

//        Movie [] newMoviesArray = Arrays.copyOf(MoviesArray.findAll(), numberOfMovies);
//        Scanner scan = new Scanner(System.in).useDelimiter("\n");
//        System.out.format("Input your movie title:");
//        String userMovieTitle = scan.next();
//        System.out.format("Input your movie category:");
//        String userMovieCategory = scan.next();
//        Movie newUserMovie = new Movie(userMovieTitle, userMovieCategory);
//        newMoviesArray [newMoviesArray.length - 1] = newUserMovie;
//        String movieName = newUserMovie.getName();
//        String movieCategory = newUserMovie.getCategory();
//        System.out.format("You added %s to the %s category\n",movieName, movieCategory);
//    }


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
