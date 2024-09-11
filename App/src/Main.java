import account.Account;
import java.math.BigDecimal;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int number = scanner.nextInt();
        System.out.print("Digite a agência: ");
        String agency = scanner.next();
        System.out.print("Digite o nome do titular: ");
        String name = scanner.nextLine();
        System.out.print("Digite o saldo: ");
        BigDecimal balance = scanner.nextBigDecimal();

        Account account = new Account(number, agency, name, balance);
        account.printAccountInfo();
        scanner.close();
    }
}