package exercise7;

public class Item {
    private String product;
    private int qty;
    private int unitPirce;


    public Item(String product, int qty, int unitPirce){
        this.product= product;
        this.qty = qty;
        this.unitPirce = unitPirce;
    }


    public int price(){
        return qty * unitPirce;
    }

    public void increaseQuantity(){
        qty ++;
    }

    @Override
    public String toString() {
        return product + ": " + qty;
    }
}

