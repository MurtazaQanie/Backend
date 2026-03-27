package exercise10;

public class Application {
    public static void main(String[] args) {
        int width = 0;
        int length = 40;


        if (width != 0) {
            double ratio = (double) length / width;
            System.out.println(ratio);


        }
        else {
            throw new ArithmeticException("what the fuck!");

        }



    }

}
