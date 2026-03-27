package exercise4;

import java.util.HashMap;

public class Application {

    public static void main(String[] args) {


        HashMap<String, String> fullName= new HashMap<>();
        fullName.put("matthew", "matt");
        fullName.put("michael", "mix");
        fullName.put("arthur","artie");

        System.out.println(fullName.get("matthew"));


    }
}
