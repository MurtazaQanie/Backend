package exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> lists = new ArrayList<>();
        int number = scanner.nextInt();
        while (number != -1){
                lists.add(number);
                number = scanner.nextInt();
        }
        System.out.print("Start index? ");
        int start = scanner.nextInt();

        System.out.print("End index? ");
        int end = scanner.nextInt();

        for (int i = start;i<= end;i++){
            System.out.println(lists.get(i));

        }





    }
}
