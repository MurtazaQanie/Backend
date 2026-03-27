package exercise4;

public class Flat {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Flat(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean largerThan(Flat toCompare){
        if (this.squareMeters > toCompare.squareMeters){
            return  true;
        }
        else {return false;}
    }

    public int priceDifference(Flat toCompare){
        return this.pricePerSquareMeter - toCompare.pricePerSquareMeter;
    }

    public static boolean largerThan(Flat f1, Flat f2){
        if (f1.squareMeters > f2.squareMeters){
            return true;
        }
        return false;
    }

    public static int priceDifference(Flat f1, Flat f2){
        return f1.pricePerSquareMeter- f2.pricePerSquareMeter;
    }



}
