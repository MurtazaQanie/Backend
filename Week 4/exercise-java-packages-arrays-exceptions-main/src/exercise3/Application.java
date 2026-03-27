package exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;

        while (true){
            String name = scanner.nextLine();
            if (!name.isEmpty()){
                String[] names = name.split(",");
                int ages = Integer.parseInt((names[1]));

                if (ages>oldest){
                    oldest=ages;

                }






            }
            else{
                break;

            }


        }
        System.out.println("Age of the oldest: "+  oldest);


    }
}
