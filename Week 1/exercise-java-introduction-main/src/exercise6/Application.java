package exercise6;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Age: ");
        int age = scanner.nextInt();

        CheckAge(age);


    }

    public static void CheckAge(int age){
        if (age < 18){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
    }
}
