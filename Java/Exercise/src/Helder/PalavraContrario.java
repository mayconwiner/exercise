/*
 Exemplo de uma construção basica em Java

 https://docs.oracle.com/javase/8/docs/api/ --> site java detalhamento de classes



 /*
 Faça um programa no qual o usuário digite uma palavra e o
 programa deverá reapresentar essa palavra ao contrário
 */
package Helder;

import java.util.Scanner;

public class PalavraContrario {

    public static void main(String[] args) {
        char[] nome;
        int lim;
        char x;

        System.out.print("Digite um nome: ");
        nome = new Scanner(System.in).nextLine().toCharArray();

        for (int i = nome.length - 1; i >= 0; i--) {
            System.out.print(nome[i]);
        }
        System.out.println();

    }

}
