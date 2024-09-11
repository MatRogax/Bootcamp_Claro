import account.Account;
import java.math.BigDecimal;



public class Main {
    public static void main(String[] args) {
        Account account = new Account(12345, "001", "João da Silva", new BigDecimal("1000.00"));
        account.printAccountInfo();
    }
}