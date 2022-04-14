package bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AccountTest {
    @Test
    public void accountCanBeCreated(){
        Account account = new Account("12345", "dammy", "thug", "3333");
        assertNotNull(account);
    }
@Test
    public void accountNumber(){
        Account account = new Account("12345", "dammy", "thug", "3333");
        assertEquals("12345", account.getAccountNumber());
        assertEquals("dammy thug", account.getAccountName());
}
@Test
    public void accountPin(){
    Account account = new Account("12345", "dammy", "thug", "3333");
    assertEquals("12345", account.getAccountNumber());
    assertEquals("dammy thug", account.getAccountName());
    assertEquals("3333", account.getPin());
}
@Test
    public void accountDeposit(){
    Account account = new Account("12345", "dammy", "thug", "3333");
    account.deposit(500);
    assertEquals(500,account.getBalance("3333"));
}
@Test
    public void accountDepositTwices(){
    Account account = new Account("12345", "dammy", "thug", "3333");
        account.deposit(500);
        account.deposit(500);
        assertEquals(1000,account.getBalance("3333"));
}
@Test
    public void accountWithdrawn(){
    Account account = new Account("12345", "dammy", "thug", "3333");
    account.deposit(1000);
    account.withdrawm(200);
    assertEquals(800,account.getBalance("3333"));

}
@Test
    public void accountCanDepositManyTimes(){
        Account account = new Account("12345" , "dammy","thug", "3333");
        account.deposit(10000);
        account.deposit(10000);
        account.deposit(10000);
        account.deposit(10000);
        assertEquals(40000,account.getBalance("3333"));

}
@Test
    public void accountCanWithdrawnManyTime(){
        Account account = new Account("12345", "dammy", "thug","3333");
        account.deposit(10000);
        account.withdrawm(1000);
        account.withdrawm(1000);
        account.withdrawm(1000);
        assertEquals(7000,account.getBalance("3333"));

}
@Test
    public void wrongPinCantDeposit(){
        Account account = new Account("12345","dammy","thug","3333");
        account.deposit(10000);
        assertEquals(0,account.getBalance("3232"));

}
@Test
    public void wrongPinCantWithdrawn(){
        Account account = new Account("12345","dammy","thug","3333");
        account.deposit(1000);
        account.withdrawm(500);
        assertEquals(500,account.getBalance("3233"));

}
}
