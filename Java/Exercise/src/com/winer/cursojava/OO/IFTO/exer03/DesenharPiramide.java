package com.winer.cursojava.OO.IFTO.exer03;

import java.util.Scanner;

public class DesenharPiramide {

    int lin = 0, col = 0;

    public void desenharPiramide(int valor) {

        char matriz1[][] = new char[valor][valor];
        for (lin = 0; lin < valor; lin++) {
            for (col = 0; col < valor; col++) {
                if (lin == col || lin > col) {
                    matriz1[lin][col] = '*';
                }
            }
        }
        //  Parte de Baixo
        char matriz2[][] = new char[valor][valor];
        for (lin = 0; lin < valor; lin++) {
            for (col = 0; col < valor; col++) {
                if ((lin + col == valor - 1) || (lin + col < valor)) {
                    matriz2[lin][col] = '*';
                }
            }
        }

        for (lin = 0; lin < valor; lin++) {
            for (col = 0; col < valor; col++) {
                System.out.print(matriz1[lin][col]);
            }
            System.out.println("");
        }

        for (lin = 0; lin < valor; lin++) {
            for (col = 0; col < valor; col++) {
                System.out.print(matriz2[lin][col]);
            }
            System.out.println("");
        }
    }

    public void desenharMatriz(int valor) {
        char matriz3[][] = new char[valor][valor];
        for (lin = 0; lin < valor; lin++) {
            for (col = 0; col < valor; col++) {
                matriz3[lin][col] = '*';
                if (lin == col || lin < col) {
                    matriz3[lin][col] = '@';
                }
            }
        }

        for (lin = 0; lin < valor; lin++) {
            for (col = 0; col < valor; col++) {
                System.out.print(matriz3[lin][col]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int num;
        Scanner leia = new Scanner(System.in);
        DesenharPiramide d1 = new DesenharPiramide();
        System.out.print("Digite um numero: ");
        num = leia.nextInt();
        d1.desenharPiramide(num);
        System.out.print("Digite outro numero: ");
        num = leia.nextInt();
        d1.desenharMatriz(num);
    }
}
