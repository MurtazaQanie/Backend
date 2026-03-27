package exercise1;

public class Person {
    private String name;
    private String address;


    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getAddress(){
        return address;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  getName() + "\n \t" + getAddress();
    }
}
