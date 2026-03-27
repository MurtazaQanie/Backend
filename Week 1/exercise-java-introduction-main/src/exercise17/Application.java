package exercise17;

public class Application {


    public static void main(String[] args){
        greet();
        System.out.println(isEven(3));
        System.out.println(welcomeMessage("Murtaza"));
        System.out.println(isPositive(3));



    }

    public static void greet() {
        System.out.println("Hello, welcome to the Java course!");
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0){
            return true;
        }
        else {
            return false;
        }
    }

    public static String welcomeMessage(String name) {
        return "Welcome, " + name;
    }

    public static boolean isPositive(int number) {
        if (number > 0) {
            return true;
        }
        else{ return false;}
    }}

