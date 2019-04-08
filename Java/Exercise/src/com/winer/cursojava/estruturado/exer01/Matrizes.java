package com.winer.cursojava.estruturado.exer01;

public class Matrizes {
    //Imprimir * em 5 linhas e 5 colunas   

    void imprime5x5() {
        char[][] matrizes = new char[5][5];
        int lin = 0, col = 0;
        for (lin = 0; lin < 5; lin++) {
            for (col = 0; col < 5; col++) {
                matrizes[lin][col] = '*';
            }
        }
        //utilizando o foreach
        for (char[] matriz : matrizes) {
            for (char mat : matriz) {
                System.out.print(mat + " ");
            }
            System.out.println();
        }       //utilizando o for normal 
//        for (lin = 0; lin < 5; lin++) {
//            for (col = 0; col < 5; col++) {
//                System.out.print(matrizes[lin][col]);
//            }
//            System.out.println();
//
//        }

    }

    void imprimirDiagonalEsquerda() {
        //imprimir @ em diagonal esquerda para direita 
        char[][] matrizes = new char[5][5];
        int col = 0, lin = 0, tam = 5;
        for (lin = 0; lin < tam; lin++) {
            for (col = 0; col < tam; col++) {
                matrizes[lin][col] = '*';
                if (lin == col) {
                    matrizes[lin][col] = '@';
                }
            }
        }
        for (char[] matriz : matrizes) {
            for (char m : matriz) {
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }

    void imprimeDiagonalDireita() {
        char[][] matrizes = new char[5][5];
        int lin = 0, col = 0;
        for (lin = 0; lin < 5; lin++) {
            for (col = 0; col < 5; col++) {
                matrizes[lin][col] = '*';
                if (lin + col == 4) {
                    matrizes[lin][col] = '@';
                }
            }
        }
        for (char[] matriz : matrizes) {
            for (char m : matriz) {
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }

    void imprimirCruz() {
        char[][] matrizes = new char[5][5];
        int lin = 0, col = 0;
        for (lin = 0; lin < 5; lin++) {
            for (col = 0; col < 5; col++) {
                matrizes[lin][col] = '*';
                if (lin == 2 || col == 2) {
                    matrizes[lin][col] = '@';
                }
            }

        }
        for (char[] matriz : matrizes) {
            for (char m : matriz) {
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }

    void imprimirLadoEsquerdo() {
        char[][] matrizes = new char[5][5];
        int lin = 0, col = 0;
        for (lin = 0; lin < 5; lin++) {
            for (col = 0; col < 5; col++) {
                matrizes[lin][col] = '*';
                if (lin > col || lin == col) {
                    matrizes[lin][col] = '@';
                }
            }
        }
        for (char[] matriz : matrizes) {
            for (char m : matriz) {
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Matrizes matriz = new Matrizes();
        matriz.imprimirLadoEsquerdo();

    }

}
