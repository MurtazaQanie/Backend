package exercise8;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PhoneBook {
    private Map<String, String> nameToNumber;
    private Map<String, String> numberToName;


    public PhoneBook() {
        this.nameToNumber = new HashMap<>();
        this.numberToName = new HashMap<>();

        nameToNumber.put("Anna", "123456");
        nameToNumber.put("Murtaza", "7890");

        numberToName.put("123456", "Anna");
        numberToName.put("7890", "Murtaza");
    }

    public String getName(String name){
        return findByName(name).orElseThrow(()->new IllegalArgumentException("No phone number was found"));
    }

    public String getPhone(String phone){
        return findByNumber(phone).orElseThrow(()->new IllegalArgumentException("No name were found"));
    }
    public Optional<String> findByName(String name){
        if (nameToNumber.containsKey(name)){
            return Optional.of(nameToNumber.get(name));
        }
        return Optional.empty();
    }


    public Optional<String> findByNumber(String phone){
        if (numberToName.containsKey(phone)){
            return Optional.of(numberToName.get(phone));
        }
        return Optional.empty();
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "nameToNumber=" + nameToNumber +
                ", numberToName=" + numberToName +
                '}';
    }
}
