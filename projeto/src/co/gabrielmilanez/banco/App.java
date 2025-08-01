package co.gabrielmilanez.banco;

import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Banco santander = new Banco("0001");

        while(true){
            System.out.println("O que deseja fazer? C = Criar conta / E = Sair do App");
            String op = scanner.nextLine();

            if(op.equals("C")){
                System.out.println("Digite Seu Nome:");
                String name = scanner.nextLine();
                Account account = santander.generateAccount(name);
                santander.insertAccount(account);

                operateAccount(account);
            } else if (op.equals("E")){
                break;
            } else {
                System.out.println("Comando inadequado. Digite apenas C ou E");
            }
        }
        List<Account> accountList = santander.getAccounts();
        for(Account cc : accountList){
            System.out.println(cc);
        }
        santander.outputTotal();
    }
        static void operateAccount(Account account){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("O que deseja fazer? D = Depósito, S= Saque, E = Sair do App");
            String op = scanner.nextLine();

            if(op.equals("D")){
                System.out.println("Qual o valor desejado para o Depósito?");
                double value = scanner.nextDouble();
                account.deposit(value);
            } else if (op.equals("S")){
                System.out.println("Qual o valor desejado para o Saque?");
                double value = scanner.nextDouble();
                if(!account.withDraw(value)) {
                    System.out.println("Não foi possível realizar o saque pois o valor é maior que o saldo");
                }
            } else if (op.equals("E")) {
                break;
            } else {
                System.out.println("Digite alguma letra válida (D, S ou E)");
            }
            scanner = new Scanner(System.in);
        }
    }
}
