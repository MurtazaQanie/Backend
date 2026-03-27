package exercise3;

public class Application {

    public static void main(String[] args) {

//        Dog dog  = new Dog();
//        dog.bark();
//        dog.eat();
//
//        Dog najeeb = new Dog("najeeb");
//        najeeb.bark();

//        Cat cat = new Cat();
//        cat.meow();
//        cat.eat();
//
//        Cat garfield = new Cat("Garfield");
//        garfield.meow();

        CanMakeSound a = new Dog();
        a.createSound();

        CanMakeSound b = new Cat("Garfield");
        b.createSound();

    }
}
