package exercise4;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter in C: ");
        double degree = scanner.nextDouble();

        System.out.println("Degree in C: "+ degree);
        System.out.println("Degree in F: "+ CtoF(degree));
        System.out.println("Degree in K: "+CtoK(degree));

    }

    public static double CtoF(double degree){
        return (degree * 9/5) +32;

    }
    public static double CtoK(double degree){
        return (degree + 273.15);

    }
}
