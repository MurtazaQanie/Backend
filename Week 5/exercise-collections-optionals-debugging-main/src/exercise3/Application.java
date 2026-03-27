package exercise3;

import java.util.ArrayList;
import java.util.HashMap;

public class Application {



    public static void main(String[] args) {
        LicensePlate p1 = new LicensePlate("BE", "1-SUT-515");
        LicensePlate p2 = new LicensePlate("BE", "1-YEN-645");
        LicensePlate p3 = new LicensePlate("D", "B WQ-431");

        ArrayList<LicensePlate> plates = new ArrayList<>();
        plates.add(p1);
        plates.add(p2);

        LicensePlate newPlate = new LicensePlate("BE", "1-SUT-515");
        if (!plates.contains(newPlate)) {
            plates.add(newPlate);
        }
        System.out.println("plates: " + plates);
        // If the equals method is not implemented, the license plate will be added again



        HashMap<LicensePlate, String> owners = new HashMap<>();
        owners.put(p1, "Dirk");
        owners.put(p3, "Roel");

        System.out.println("owners:");
        System.out.println(owners.get(new LicensePlate("BE", "1-SUT-515")));
        System.out.println(owners.get(new LicensePlate("D", "B WQ-431")));
        // If the hashCode method is not implemented, the owner will not be found
    }
}
