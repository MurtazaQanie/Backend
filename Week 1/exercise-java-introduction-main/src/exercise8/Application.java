package exercise8;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First Word: ");
        String first = scanner.nextLine();
        System.out.print("Second Word: ");
        String second = scanner.nextLine();


        if (first.equals(second)){
            System.out.println("They are equal");
        }
        else {
            System.out.println("They are not equal");
        }
    }
}
