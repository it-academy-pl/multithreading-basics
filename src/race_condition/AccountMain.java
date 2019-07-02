package race_condition;

public class AccountMain {
    public static void main(String[] args) {
        AccountClient accountClient = new AccountClient(10);

        Thread one = new Thread(accountClient);
        one.setName("one");
        one.start();

    }

}
