package exercise1;

public class Application {

    public static void main(String[] args) {
        int number = 1;
        System.
                out.println("The value of the variable 'number' in the main program: " + number);

        System.
                out.println("The value of the variable 'number' in the main program: " +  incrementByThree(number));
    }
    public static int incrementByThree(int number) {
        return number + 3;
    }}