package bank;


public class Bank {
        private String name;
        private Account[] accounts;
        private int numberOfCustomer;



        public Bank(String bankName,int numberOfCustomer){
            name = bankName;
            accounts = new Account[numberOfCustomer];
        }

        public Bank() {

        }

        public String getName() {
            return name;
        }

        public int getMaximumNumberOfCustomers() {
            return accounts.length;
        }

        public Account createAccountFor(String firstName, String lastName, String pin) {
            String accountNumber = (numberOfCustomer+1)+"";
            Account account= new Account("accountNumber","firstName","lastName","pin");
            accounts[numberOfCustomer]=account;
            numberOfCustomer++;

            return account;
        }

        public int getNumberOfCustomers() {
            return numberOfCustomer;
        }

        public Account findAccount(int accountNumber) {
            int indexOfAccount = accountNumber -1;
            return accounts[indexOfAccount];
        }

        public void deposit(int amount, String accountNumber ) {
            Account account = findAccount(Integer.parseInt(accountNumber));
            account.deposit(amount);
        }

        public void withDraw(int amount, String accountNumber) {
            Account account =findAccount(Integer.parseInt(accountNumber));
            account.withdrawm(amount);
        }
        public void transfer(int amount,String from,String to, String sendersPin){
            Account senderAccount = findAccount(Integer.parseInt(from));
            Account receiverAccount = findAccount(Integer.parseInt(to));
            senderAccount.withdrawm(amount);
            receiverAccount.deposit(amount);
        }
    }

