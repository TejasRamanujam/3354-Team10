package bank;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    
    @Test
    public void testWithdraw() {
        BankAccount account = new BankAccount(1000.00);
        
        boolean result = account.withdraw(250.00);
        
        assertTrue(result);
        assertEquals(750.00, account.getBalance(), 0.01);
    }
}