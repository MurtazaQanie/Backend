package exercise7;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Integer> cart;
    private Map<String, Integer> qty;
    public ShoppingCart() {
        this.cart = new HashMap<>();
        this.qty = new HashMap<>();
    }


    public void add(String product, int price){
        cart.put(product,price );
        if (qty.containsKey(product)){
            qty.put(product, qty.get(product) +1);
        }
        else{
            qty.put(product,1);
        }
    }

    public int price(){
        int sum = 0;

        for (String i: cart.keySet()){
            sum += cart.get(i) * qty.get(i);
        }
        return sum;
    }


    public void print(){
        for (String i: qty.keySet()){
            System.out.println(i+ ": " + qty.get(i));
        }
    }
}
