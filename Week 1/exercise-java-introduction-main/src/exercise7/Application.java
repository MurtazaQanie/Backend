package exercise7;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First Number: ");
        double first = scanner.nextDouble();
        System.out.print("Second Number: ");
        double second = scanner.nextDouble();

        bigger(first,second);

    }

    public static void bigger(double n1, double n2){
        if (n1 == n2){
            System.out.println("Both are equal");;
        }
        else if (n1 > n2){
            System.out.println(n1);
        }
        else{
            System.out.println(n2);
        }
    }
}
