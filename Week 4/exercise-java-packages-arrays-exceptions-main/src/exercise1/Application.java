package exercise1;


import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while(true){
            String message = scanner.nextLine();

            String[] spliting = message.split(" ");

            if(!message.isEmpty()){

            for (String i: spliting){
                if (i.contains("av") || i.contains("AV")){
                    System.out.println(i);
                }

            }

            }

        }


    }


}
