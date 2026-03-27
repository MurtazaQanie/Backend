package exercise3;

public class Dog extends Animal implements CanMakeSound{
    public Dog(String name){
        super(name);
    }

    public Dog() {
        super("Dog");
    }

    public void bark(){
        System.out.println(getName() + " barks");
    }


    public void createSound() {
        bark();

    }
}
