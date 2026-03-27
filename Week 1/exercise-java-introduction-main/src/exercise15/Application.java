package exercise15;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("First: ");
        double first = scanner.nextDouble();

        System.out.print("Second: ");
        double second = scanner.nextDouble();

        System.out.println(sum1(first,second));
        System.out.println(sub1(first, second));
        System.out.println(mult1(first,second));
        System.out.println(dev1(first,second));


    }


    public static double sum1 (double n1, double n2){
        return n1 + n2;
    }
    public static double sub1 (double n1, double n2){
        return n1 - n2;
    }
    public static double mult1 (double n1, double n2){
        return n1 * n2;
    }
    public static double dev1 (double n1, double n2){
        return n1 / n2;
    }
}
