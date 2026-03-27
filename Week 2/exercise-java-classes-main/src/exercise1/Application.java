package exercise1;

public class Application {

    public static void main(String[] args) {

        Account account = new Account("Murtaza", 100);

        System.out.println(account.balance());
        account.deposit(20);
        account.withdraw(40);
        System.out.println(account.balance());

    }
}
