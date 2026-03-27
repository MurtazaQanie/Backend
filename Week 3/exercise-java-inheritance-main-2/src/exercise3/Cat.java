package exercise3;

public class Cat extends Animal implements CanMakeSound{
    public Cat(String name){
        super(name);
    }

    public Cat(){
        super("Cat");
    }

    public void meow(){
        System.out.println(getName() + " meows");
    }


    public void createSound(){
      meow();
    }
}


