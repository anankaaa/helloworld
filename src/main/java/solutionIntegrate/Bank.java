package solutionIntegrate;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("What is your name?");
        String owner= scanner.nextLine();

        System.out.println("What is the account nr?");
        String accountNumber = scanner.nextLine();

        System.out.println("What is the balance?");
        int balance = scanner.nextInt();

        BankAccount bankAccount=new BankAccount(accountNumber, owner, balance);
        System.out.println(bankAccount.getInfo());
    }
}
