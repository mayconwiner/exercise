//Faça um programa que peça ao usuário que informe os três lados de um triangulo.
package com.winer.cursojava.estruturado.exer01;

import java.util.Scanner;

public class LadosTriangulo {

    public static void main(String[] args) {
        int l1, l2, l3;
        int opcao = 1;
        while (opcao == 1) {
            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite o valor do lado 1:");
            l1 = leitor.nextInt();
            System.out.println("##################################################");
            System.out.println("Digite o valor do lado 2:");
            l2 = leitor.nextInt();
            System.out.println("##################################################");
            System.out.println("Digite o valor do lado 3:");
            l3 = leitor.nextInt();
            System.out.println("#####################################################");
            if ((l1 < l2 + l3) && (l2 < l1 + l3) && (l3 < l1 + l2)) {
                if (l1 == l2 && l1 == l3) {
                    System.out.println("Triangulo Equilatero");
                } else if ((l1 == l2) || (l1 == l3)) {
                    System.out.println("Triangulo Isosceles");
                } else {
                    System.out.println("Triângulo Escaleno");
                }
            } else {
                System.out.println("Não é um triangulo!");
            }
            System.out.println("################################################");
            System.out.println("Digite 1 para continuar ou 2 para sair : 1 = sim, 2 = não");
            opcao = leitor.nextInt();
            System.out.println("##################################################");
        }
        System.out.println("Good By, exercicio concluido com sucesso!!");
    }
}
