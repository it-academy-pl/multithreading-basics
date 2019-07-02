package race_condition;

public class Account {
    private int balance = 20;

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        balance = balance - amount;
    }
}
