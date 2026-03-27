package exercise6;

public class Address {
    private String street;
    private int housenumber;
    private int postalcode;
    private String municipality;


    public Address(String street, int housenumber, int postalcode, String municipality) {
        this.street = street;
        this.housenumber = housenumber;
        this.postalcode = postalcode;
        this.municipality = municipality;
    }


    @Override
    public String toString() {
        return street + " " + housenumber+ ", " +postalcode+ " " + municipality;
    }
}

