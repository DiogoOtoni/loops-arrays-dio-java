package br.edu.loops;

import java.util.Scanner;

/*
 * 2 - Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.
 */
public class Ex2Loops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nomeDoUsuario = new String();
        String senhaDoUsuario = new String();

        do {
            System.out.println("Digite o nome de usuário: ");
            nomeDoUsuario = scan.next();
            System.out.println("Digite a Senha do usuário: ");
            senhaDoUsuario = scan.next();
            if (nomeDoUsuario.equals(senhaDoUsuario)) {
                System.out.println("ERRO: SENHA IGUAL AO NOME DE USUÁRIO");
            }
        } while (nomeDoUsuario.equals(senhaDoUsuario));

        System.out.println("\nFim do código!!\n");
    }
}
