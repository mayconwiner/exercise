/*
Faça um programa que ao receber uma palavra via teclado:
transforme o primeiro caracter dessa palavra para maiúscula e a reapresente na tela
 */
package Helder;

import java.util.Scanner;

public class PriLetrMaiuscula {
    public static void main(String[] args) {
        //iniciando o objeto Scanner
        Scanner leitor;
        String nome;
        //Iniciando o objeto Scanner
        leitor = new Scanner(System.in);
        System.out.println("Digite uma Palavra");
        nome = leitor.nextLine();
        
        nome = nome.substring(0,1).toUpperCase() + nome.substring(1);
        System.out.println(nome);
        
    }
    
}
