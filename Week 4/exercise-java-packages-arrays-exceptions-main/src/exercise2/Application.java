package exercise2;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String word = scanner.nextLine();
            if (!word.isEmpty()) {
                String[] splitong = word.split(" ");
                System.out.println(splitong[splitong.length-1]);
            }
            else{
                break;
            }


        }

        }
    }

