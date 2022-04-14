package bank;

public class Account {

    private final String ACCOUNT_NUMBER;
    private  String accountName;
    private String pin;
    private int balance;

    public Account(String accountNum, String firstName, String lastNme, String pin) {
        ACCOUNT_NUMBER = accountNum;
        accountName = firstName + " " + lastNme;
        this.pin = pin;
    }


    public String getAccountNumber() {
        return ACCOUNT_NUMBER;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getPin() {
        return pin;
    }

    public void deposit(int amount) {
         balance = amount + balance;
    }

    public int getBalance(String pin) {
        if(pin.equals(this.pin)) return balance;
        return 0;
    }

    public void withdrawm(int amount) {if(pin.equals(this.pin)) balance -= amount;}


}

