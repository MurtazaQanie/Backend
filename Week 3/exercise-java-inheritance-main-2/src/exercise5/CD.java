package exercise5;

public class CD implements Packable{
    private String artist;
    private String nameCD;
    private int publicationYear;
    private double wight = 0.1;

    public CD(String artist, String nameCD, int publicationYear){
        this.artist = artist;
        this.nameCD= nameCD;
        this.publicationYear=publicationYear;
    }

    public String getArtist() {
        return artist;
    }

    public String getNameCD() {
        return nameCD;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public double weight(){
        return wight;

    }

    @Override
    public String toString() {
        return getArtist() + ": " + getNameCD() + " (" + getPublicationYear() + ")";
    }
}
