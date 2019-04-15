/*
 Faça um programa que receba via teclado duas notas parciais de um aluno.O programa deve calcular a média alcançada pelo aluno e apresentar:
 - A mensagem "Aprovado" se a média calculada for maior ou igual a 7;
 - A mensagem "Reprovado"  se a média for menor que 7
 - A mensagem "Aprovado com Distinção", se a média for igual a 10
 */
package Helder;

import java.util.Scanner;

public class MediaAluno {

    public static void main(String[] args) {
        Scanner leitor;
        float n1, n2, media;
        leitor = new Scanner(System.in);
        System.out.println("Digite a primeira nota");
        n1 = leitor.nextFloat();
        System.out.println("Digite a segunda nota");
        n2 = leitor.nextFloat();
        media = (n1 + n2) / 2.0f;
        if (media >= 7.0) {
            if (media != 10) {
                System.out.println("Aprovado");
            }
        }
        if (media < 7.0) {
            System.out.println("Reprovado");
        }
        if (media == 10) {
            System.out.println("Aprovado com Distinção");
        }

    }
}
