package exercise6;

public class Application {

    public static void main(String[] args) {
        Address address= new Address("Tiensesteenweg", 69, 3800,"Sint-Truidn");
        User user = new User("Murtaza", "Qanie", 22, address);


        System.out.println(user);

    }
}
