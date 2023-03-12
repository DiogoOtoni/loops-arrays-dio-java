package br.edu.loops;

import java.util.Scanner;

/*
 * Faça um programa que leia e valide as seguintes informações:
  *  Nome: maior que 3 caracteres;
   * Idade: entre 0 e 150;
   * Salário: maior que zero;
   * Sexo: 'f' ou 'm';
   * Estado Civil: 's', 'c', 'v', 'd';
 */

public class Ex3Loops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome = new String();
        int idade = -1;
        double salario = -1;
        String sexo = new String();
        String estadoCivil = new String();
        boolean estadoCivilState = true;

        do{
            System.out.println("Digite o nome: ");
            nome = scan.next();
            if(nome.length() < 3){
                System.out.println("NOME MENOR QUE 3 CARACTERES");
            }
        }while(nome.length() < 3);
        do{
            System.out.println("Digite a idade: ");
            idade = scan.nextInt();
            if(idade < 0 || idade > 150){
                System.out.println("IDADE INVALIDA");
            }
        }while(idade < 0 || idade > 150);
        do{
            System.out.println("Digite o Salario: ");
            salario = scan.nextDouble();
            if(salario < 0){
                System.out.println("SALARIO NEGATIVO");
            }
        }while(salario < 0);
        do{
            System.out.println("Digite o sexo, f para FEMININO, m para MASCULINO: ");
            sexo = scan.next();
            if(!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m")){
                System.out.println("SEXO INVALIDO");
                System.out.println(sexo);
                System.out.println("TESTE:   " + sexo.equalsIgnoreCase("f"));
            }
        }while(!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m"));
        do{
            System.out.println("Digite o Estado civil: s - c - v - d");
            estadoCivil = scan.next();
            if(!estadoCivil.equalsIgnoreCase("s") && !estadoCivil.equalsIgnoreCase("c") && !estadoCivil.equalsIgnoreCase("v") && !estadoCivil.equalsIgnoreCase("d")){
                System.out.println("ESTADO CIVIL INVALIDO");
                estadoCivilState = false;
            }
        }while(!estadoCivilState);
    }
}
