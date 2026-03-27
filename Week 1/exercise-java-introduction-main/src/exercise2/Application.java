package exercise2;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First Number: ");
        double n1 = scanner.nextDouble();
        System.out.println("Second Number: ");
        double n2 = scanner.nextDouble();
        System.out.println("Third Number: ");
        double n3 = scanner.nextDouble();


        System.out.println(" The sum is " + sum(n1,n2,n3) + " and average is "+ average(n1,n2,n3));


    }

    public static double sum(double n1, double n2, double n3){
        return n1 + n2 + n3;
    }

    public static double average(double n1, double n2, double n3){
        return sum(n1, n2, n3) / 3;
    }
}
