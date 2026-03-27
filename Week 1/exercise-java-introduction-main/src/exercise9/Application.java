package exercise9;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        checkAge(age);

    }
    public static void checkAge(int age){
        if (age <= 120 && age >= 0){
            System.out.println("Ok");
        }
        else {
            System.out.println("Impossible");
        }
    }
}
