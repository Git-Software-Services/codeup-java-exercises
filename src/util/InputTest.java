package util;


public class InputTest {
    public static void main(String[] args) {
        Input myInput = new Input();

//        myInput.getString();
        myInput.getString("Enter your name: \n");
//        myInput.yesNo();
        myInput.yesNo("Do you like dogs?\n");
//        myInput.getInt(4, 10);
        myInput.getInt("Enter a number between 4 and 10: \n", 4, 10);
//        myInput.getInt();
        myInput.getInt("Enter a number: \n");
//        myInput.getDouble(2.3, 4.6);
        myInput.getDouble("Enter a double number between 2.3 and 4.6:\n ",2.3, 4.6);
//        myInput.getDouble();
        myInput.getDouble("Enter a double number: \n");
    }
}
