package exercise5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        float count = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers, type end to stop.");

        List<Integer> lists = new ArrayList<>();

        while (true){
            String numbers = scanner.nextLine();

            if (!numbers.equals("end")){
                try{
                lists.add(Integer.parseInt(numbers));}
                catch (NumberFormatException e){
                    System.out.println("You may enter numbers or end.");}
                }

            else {
                break;
            }}
        for (int i: lists){
            count = count + i;

        }
        System.out.println("average: " + count/lists.size());





    }}