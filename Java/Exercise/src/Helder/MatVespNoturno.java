/*
 Prog6.java e Prog7.java
 Faça um programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou 
 N - Noturno. Imprima a mensagem"Bom Dia!", 
 "Boa Tarde!" ou "Boa Noite!"ou "Valor Inválido" * and open the template in the editor.
 */
package Helder;

import java.util.Scanner;

public class MatVespNoturno {

    public static void main(String[] args) {
        String dado;
        System.out.println("Responda o questionamento abaixo com ");
        System.out.println("M - Matutino , V - Vespertino, N - Noturno");
        System.out.println("qual turno você estuda ? ");
        dado = new Scanner(System.in).nextLine().toUpperCase().substring(0, 1);
        if (dado.equals("M")) {
            System.out.println("Bom dia");
        } else if (dado.equals("V")) {
            System.out.println("Boa tarde ");
        } else if (dado.equals("N")) {
            System.out.println("boa noite");
        } else {
            System.out.println("Valor invalido");
        }

    }
}
//String dado;
//        
//        System.out.println("Responda o questionamento abaixo com:");
//        System.out.println("M - Matutino -> V - Vespertino -> N - Noturno");
//        
//        System.out.print("Qual turno você estuda? ");
//        dado = new Scanner(System.in).nextLine().toUpperCase().substring(0,1);
//        
//        switch (dado) {
//            case "M": {
//                System.out.println("Bom dia!");
//                break;
//            }
//            case "V": {
//                System.out.println("Boa tarde!");
//                break;
//            }
//            case "N": {
//                System.out.println("Boa Noite!");
//                break;
//            }
//            default: {
//                System.out.println("Valor inválido");
//            }
//        }