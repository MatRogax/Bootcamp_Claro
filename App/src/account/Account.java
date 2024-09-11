package account;

import java.math.BigDecimal;

public class Account {

    public int number;
    public String agency;
    public String name;
    public BigDecimal balance;

    public Account(int number,String agency,String name,BigDecimal balance){
        this.number = number;
        this.agency = agency;
        this.name = name;
        this.balance = balance;
    }

    public void printAccountInfo() {
        System.out.println("Número da conta: " + number);
        System.out.println("Agência: " + agency);
        System.out.println("Nome do titular: " + name);
        System.out.println("Saldo: " + balance);
    }
}
