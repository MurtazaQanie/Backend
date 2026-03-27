package exercise8;

public class Application {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        System.out.println(phoneBook.getName("Anna"));
        System.out.println(phoneBook.getPhone("123456"));

    }
}
