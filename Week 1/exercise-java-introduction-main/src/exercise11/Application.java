package exercise11;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        double sum = 0;
        int count = 0;
        double average = 0;
        while (number > 0){
            count ++;
            sum += number;

            average= sum / count;

            number = scanner.nextDouble();


        }
        System.out.println(average);
    }
}
