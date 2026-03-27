package exercise4;

public class CustomTacoBox implements TacoBox{
    public int number;

    public CustomTacoBox(int number){
        this.number = number;
    }
    @Override
    public int tacosRemaining(){
        return number;
    }
    @Override
    public void eat(){
        number -=1;

    }

    @Override
    public String toString(){
        return "Remaining Taco: " + tacosRemaining();
    }
}
