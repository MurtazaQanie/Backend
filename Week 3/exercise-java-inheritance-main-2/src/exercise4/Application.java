package exercise4;

public class Application {

    public static void main(String[] args) {

        TripleTacoBox tripleTacoBox = new TripleTacoBox();
        CustomTacoBox customTacoBox = new CustomTacoBox(5);
        System.out.println(tripleTacoBox);
        customTacoBox.eat();
        System.out.println(customTacoBox);
    }

}
