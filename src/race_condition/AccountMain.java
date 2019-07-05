package race_condition;

public class AccountMain {
    public static void main(String[] args) {
        AccountClient accountClient = new AccountClient(10);

        Thread one = new Thread(accountClient);
        Thread two = new Thread(accountClient);
        Thread three = new Thread(accountClient);
        Thread four = new Thread(accountClient);
        one.setName("one");
        two.setName("two");
        three.setName("three");
        four.setName("four");
        one.start();
        two.start();
        three.start();
        four.start();

    }

}
