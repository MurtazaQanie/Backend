package exercise12;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many stars do you want? ");
        int stars= scanner.nextInt();

        for (int i = 0; i < stars; i ++){
            for (int j = 0; j < i; j++){
                System.out.print("*");}
            System.out.println("*");
        }



    }
}
