package br.edu.loops;
/*
 * Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.
 */

import java.util.Scanner;

public class Ex1Loops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nExercícios 1 de Loops.\n");
        int nota = -1;
        do{
            System.out.println("Digite uma nota entre 0 e 10, inclusos: ");
            nota = scan.nextInt();
            if(nota < 0 || nota > 10){
                System.out.println("\nValor INVÁLIDO\n");
            }
        }while(nota < 0 || nota > 10);
    }
}