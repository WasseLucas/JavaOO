package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        /*
        Account acc = new Account(1001,"Alex",0.0);
        BusinessAccount bacc = new BusinessAccount(1002,"Maria",0.0,500.00);

        //UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003,"Bob",0.0,200.0);
        Account acc3 = new SavingsAccount(1004,"Ana",0.0,0.01);

        //DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount ) acc2;
        acc4.loan(100.00);

        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 =(SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update");
        }

         */

        //Polimorfismo
        /*

        Account x = new Account(1020, "Alex", 1000.0);
        Account y = new SavingsAccount(1023, "Juka", 1000.0, 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);
        System.out.println(x.getBalance());
        System.out.println(y.getBalance());

         */

        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
        list.add(new BusinessAccount(1002, "Maria", 1000.0,400.0));
        list.add(new SavingsAccount(1003, "Wasse", 300.00,0.01));
        list.add(new BusinessAccount(1005, "Fernanda",600.0,500.0));

        //Função criada para totalizar o saldo das contas
        double sum = 0.0;
        for (Account acc : list){ //
            sum += acc.getBalance();
        }

        System.out.printf("Total balance: %.2f%n ",  sum);

        for (Account acc : list){
            acc.deposit(10.0);
        }

        for (Account acc : list){
            System.out.printf("Update balance for account %d: %.2f%n ", acc.getNumber(), acc.getBalance());
        }

    }
}