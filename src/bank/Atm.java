
package bank;

import java.util.Scanner;

public class Atm {
    private static Scanner scanner = new Scanner(System.in);
    private  static Bank thugBank = new Bank("thugBank",10);

    public static void main(String[] args) {
        runApp();
    }

        public static void runApp () {
            System.out.println("Welcome to OGbank");
            System.out.println("if dem born u well,complain say our service no good");
            System.out.println("you go collect wotowoto");
            System.out.println("kindly face front");
            String promt = """
                    Welcom to OGBank(4_senior_men)
                    1 - to create account
                    2 - to put money
                    3 - to commot money
                    4 - to send urgent 2k
                    5 - to check balance
                    6 - to Exit
                    """;

            System.out.println(promt);
            int userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    createAccount();
                    break;
            case 2:putMoney();
                    break;
           case 3:toCommotMoney();
                     break;
            case 4:toSendUrgent2k();
            break;
            case 5:toCheckBalance();
            break;
                case 6:toExit();
            default:  runApp();
        }
    }

    private static void toExit() {
        System.out.println("Thank you for banking with us");
        System.exit(0);
    }

    private static void toCheckBalance() {
        System.out.println("Enter account number");
        String accountNumber = scanner.nextLine();

        System.out.println("Your pin");
        String pin = scanner.next();
        Account account = thugBank.findAccount(Integer.parseInt(accountNumber));
        System.out.println("Your balance is: " + account.getBalance(pin));
        scanner.next();
        runApp();
    }

    private static void toSendUrgent2k() {
        System.out.println("account number");
        String sendAccountNumber = scanner.nextLine();
        System.out.println("to send to");
        String receieveAccountNumber = scanner.nextLine();
        System.out.println("enter pin");
        String pin = scanner.nextLine();
        System.out.println("how much");
        int amount = scanner.nextInt();
        thugBank.transfer(amount,sendAccountNumber,receieveAccountNumber,pin);
        Account fromAccount = thugBank.findAccount(Integer.parseInt(sendAccountNumber));
        System.out.println("your balance is"+ fromAccount.getBalance(pin));
        runApp();
    }

    private static void toCommotMoney() {
        System.out.println("Which account: ");
        String accountNumber = scanner.nextLine();
        System.out.println("Enter pin");
        String pin = scanner.nextLine();
        System.out.println("How much: ");
        int amount = scanner.nextInt();
        thugBank.withDraw(amount, accountNumber);
        System.out.println("successful!!!");
        Account account = thugBank.findAccount(Integer.parseInt(accountNumber));
        System.out.println();
        System.out.println("New balance is " + account.getBalance(pin));
        System.out.println();
        scanner.next();
        runApp();

    }

    private static void putMoney() {
        System.out.println("what account");
        String accountNumber = scanner.nextLine();
        Account account = thugBank.findAccount(Integer.parseInt(accountNumber));
        System.out.println("the account name is "+ account.getAccountName());
        System.out.println("how much");
        int amount = scanner.nextInt();
        thugBank.deposit(amount,accountNumber);
        System.out.println();
        System.out.println(account);
        System.out.println();
        scanner.next();
        runApp();
    }

    private static void createAccount() {
        System.out.println("enter first name");
        String firstName = scanner.nextLine();
        System.out.println();
        System.out.println("enter last name ");
        String lastName = scanner.nextLine();
        System.out.println();
        System.out.println("enter ya pin");
        String pin = scanner.nextLine();
        System.out.println();
        System.out.println();
        Account savedAccount = thugBank.createAccountFor("firstName","lastName","pin");
        System.out.println(savedAccount);
        System.out.println();
        System.out.println();
                runApp();



    }
}


