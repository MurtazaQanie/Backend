package exercise13;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Till which number: ");
        int number= scanner.nextInt();


        sum(number);

    }


    public static void sum(int number){

        int something = 0;
        int newnumber = 0;
        while (newnumber < number){
            something ++;

            newnumber += something;

            System.out.print(something + "+");
        }






//       for (int i = 0; i < number; i++){
//           if (i != number){
//               System.out.println(i + " + " + i);
//           }
//           else {
//               break;
//           }
       }

       }
