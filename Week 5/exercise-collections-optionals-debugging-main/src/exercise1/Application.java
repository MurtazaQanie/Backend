package exercise1;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int largest= 0;

        while (true){
            int number = scanner.nextInt();
            if (number!=-1){
                if (number > largest){
                    largest = number;
                }
            }
            else {
                break;
            }

        }
        System.out.println("Largest: " + largest);

    }
}
