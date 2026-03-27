package exercise5;

public class User {
    private String name;
    private String lastName;
    private int age;


    public User(String name, String lastName, int age){
        this.name = name;
        this.lastName =lastName;
        this.age= age;
    }

    public User(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
        age = 0;
    }

    public void age(){
        age +=1;
    }

    public void age(int number){
        age += number;

    }

    @Override
    public String toString() {
        return name + " " + lastName + " " + age;
    }
}
