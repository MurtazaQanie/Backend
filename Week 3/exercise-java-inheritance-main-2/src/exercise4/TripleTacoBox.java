package exercise4;

public class TripleTacoBox implements TacoBox{
    public int number = 3;

    @Override
    public int tacosRemaining() {
        return number;
    }

    @Override
    public void eat() {
        number -=1;

    }

    @Override
    public String toString(){
        return "Remaining Taco: " + tacosRemaining();
    }
}
