package exercise1;

public class Student extends Person{
    int credits = 0;
    public Student(String name, String address){
        super(name,address);

    }


    public int credits(){
        return this.credits;

    }
    public int study(){
        return credits += 1;

    }


    @Override
    public String toString() {

        return super.toString() + "\n \tStudy credits " + credits;
    }
}
