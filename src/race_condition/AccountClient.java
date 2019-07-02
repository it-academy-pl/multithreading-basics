package race_condition;

public class AccountClient implements Runnable {
    Account account = new Account();
    final int amount;

    public AccountClient(int amount) {
        this.amount = amount;
    }

    private void withdrawMoney() {

    }

    @Override
    public void run() {
        withdrawMoney();
    }
}
