package exercise5;

public class Box implements Packable{

    private double maxWight;
    private Packable[] items = new Packable[3];
    private int count =0;


    public Box(double maxWight) {
        this.maxWight = maxWight;
    }

    public void add(Packable item){
        if (count ==3)return;
        if (item==null)return;
        if (itemweight() + item.weight() > maxWight) return;

        items[count] = item;
        count++;
    }

    public double itemweight(){
        double sum =0;

        for (int i =0; i < count; i++){
            sum += items[i].weight();
        }
        return sum;
    }




    public double weight(){
        return itemweight();
    }

    @Override
    public String toString() {
        return "Box: " + count + " items, total weight " + itemweight() + " kg";
    }
}
