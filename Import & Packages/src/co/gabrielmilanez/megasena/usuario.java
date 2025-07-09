package co.gabrielmilanez.megasena;

import java.util.Scanner;

public class usuario {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");

        String nome = scanner.nextLine();

        System.out.println("Ola, " + nome);
    }
}
