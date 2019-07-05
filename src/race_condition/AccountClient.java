package race_condition;

public class AccountClient implements Runnable {
    Account account = new Account();
    final int amount;

    public AccountClient(int amount) {
        this.amount = amount;
    }

    private synchronized void withdrawMoney() {
        System.out.println("current thread is: " + Thread.currentThread().getName());
        if(account.getBalance()>=amount) {
            System.out.println("withdrawing money ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            account.withdraw(amount);
        } else {
            System.out.println("your account balance is too low: " + account.getBalance());
        }
        System.out.println("current balance is: " + amount);
    }

    @Override
    public void run() {

        withdrawMoney();
    }
}
