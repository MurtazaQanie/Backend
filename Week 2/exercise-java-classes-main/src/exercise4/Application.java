package exercise4;

public class Application {

    public static void main(String[] args) {

        Flat flat = new Flat(4,1000,200);
        Flat flat2 = new Flat(3,50,120);

        System.out.println(flat.largerThan(flat2));
        System.out.println(Flat.largerThan(flat,flat2));


    }
}
