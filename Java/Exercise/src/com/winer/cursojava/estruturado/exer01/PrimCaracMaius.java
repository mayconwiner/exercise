package com.winer.cursojava.estruturado.exer01;

/*
Exemplo de uma construção basica em Java

https://docs.oracle.com/javase/8/docs/api/ --> site java detalhamento de classes


Faça um programa que ao receber uma palavra via teclado:
transforme o primeiro caracter dessa palavra para maiúscula e a reapresente na tela
*/
import java.util.Scanner;

public class PrimCaracMaius{
    public static void main(String [] args){
        //Iniciando o objeto Scanner
        Scanner ler;
        String nome;
        
         //Iniciando o objeto Scanner
        ler = new Scanner(System.in);
        
        System.out.print("Digite uma palavra: ");
        nome = ler.nextLine();
       
        nome = nome.substring(0, 1).toUpperCase() + nome.substring(1);
       
        System.out.println(nome);
    }
}
