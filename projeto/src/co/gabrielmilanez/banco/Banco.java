package co.gabrielmilanez.banco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {

    private String ag;
    private List<Account> accounts;
    private int lastAccount = 1;

    public Banco(String ag){
        this.ag = ag;
        this.accounts = new ArrayList<>();
    }

    public Account generateAccount(String name){
        Account account = new Account(ag, "" + lastAccount, name);
        lastAccount++;
        return account;
    }

    public void insertAccount(Account account){
        accounts.add(account);
    }

    public void outputTotal(){
        double total = 0;
        for(Account account : accounts){
            double balance = account.getBalance();
            total += balance;
        }
        System.out.println("Banco possui agora: R$" + total);
    }

    public List<Account> getAccounts() {
        return null;
    }
}