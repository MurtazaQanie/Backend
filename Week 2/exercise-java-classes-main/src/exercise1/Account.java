package exercise1;

public class Account {

    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(double amount) {

        if (balance < amount){
            System.out.println("You do no have money!");
        }
        else{
            balance = balance - amount;
        }
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public double balance() {
        return balance;
    }

    @Override
    public String toString() {
        return name + ": " + balance;
    }
}
