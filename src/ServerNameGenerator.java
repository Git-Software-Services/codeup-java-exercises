import java.util.Random;

public class ServerNameGenerator {

    static String[] nouns = {"mustard", "lollipop", "screen", "float", "sheep", "cloud", "male", "female", "dog", "llama"};

    static String[] adjectives = {"cute", "nice", "hilarious", "infamous", "toxic", "poisoned", "annoying", "floppy", "stern", "sleepy"};

    public static void serverNameGenerator(String[] array) {
        Random rand = new Random();
        int index = rand.nextInt(array.length);
        System.out.println(array[index]);
    }
    public static void serverNameGenerator(String[] array, String[] secondArray) {
        Random rand = new Random();
        int index = rand.nextInt(array.length);
        System.out.println(array[index] + "-" + secondArray[index]);
    }

    public static void main(String[] args) {
        serverNameGenerator(adjectives, nouns);
    }
}
