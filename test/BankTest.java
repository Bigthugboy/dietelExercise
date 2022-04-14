import bank.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import bank.Bank;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


    public class BankTest {
        private Bank WemaBank;

        @BeforeEach
        public void setUp() {
            WemaBank = new Bank("WemaBank", 10);
        }

        @Test
        public void bankCanBeCreated() {
            Bank gtBank = new Bank("WemaBank", 10);
            assertNotNull(gtBank);
            assertEquals("WemaBank", gtBank.getName());
            assertEquals(10, gtBank.getMaximumNumberOfCustomers());

        }

        @Test
        public void bankCanCreatedAccount() {
            WemaBank.createAccountFor("Saheed", "Osupa", "1234");
            WemaBank.createAccountFor("wasiu", "Osupa", "1234");
            WemaBank.createAccountFor("love", "Olanrewaju", "7684");
            assertEquals(3, WemaBank.getNumberOfCustomers());
        }

        @Test
        public void createAccountCheckForCustomerByAccountNumberTest() {
            WemaBank.createAccountFor("Saheed", "Osupa", "1234");
            WemaBank.createAccountFor("wasiu", "Osupa", "1334");
            WemaBank.createAccountFor("deji", "thug", "7684");
            assertEquals(3, WemaBank.getNumberOfCustomers());
            Account account = WemaBank.findAccount(3);
            assertEquals(3, WemaBank.getNumberOfCustomers());

        }

        @Test
        public void bankCanDepositMoneyTest() {
            WemaBank.createAccountFor("deji", "thug", "1234");
            WemaBank.deposit(1200, "1");
            Account account = WemaBank.findAccount(1);
            assertEquals(1200, account.getBalance("1234"));

        }

        @Test
        public void bankCanWithDrawMoneyTest() {
            WemaBank.createAccountFor("deji", "thug", "1234");
            WemaBank.deposit(1200, "1");
            Account account = WemaBank.findAccount(1);
            assertEquals(1200, account.getBalance("1234"));

            WemaBank.withDraw(200, "1");
            assertEquals(1000, account.getBalance("1234"));


        }
        @Test
        public void transfer(){
            WemaBank.createAccountFor("deji","thug","1234");
            WemaBank.createAccountFor("amaka","amazing","1234");
            WemaBank.deposit(12000, "1");

            Account account = WemaBank.findAccount(1);
            assertEquals(12_000,account.getBalance("1234"));

            WemaBank.transfer(200,"1","2", "1234");
            account = WemaBank.findAccount(1);
            assertEquals(11800,account.getBalance("1234"));

            account = WemaBank.findAccount(2);
            assertEquals(200,account.getBalance("1234"));





        }

    }

