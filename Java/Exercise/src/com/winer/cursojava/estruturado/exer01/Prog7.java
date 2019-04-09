package com.winer.cursojava.estruturado.exer01;

/*
https://docs.oracle.com/javase/8/docs/api/ --> site java detalhamento de classes

Exercício:
Digite um nome e o sistema deverá imprimir o nome na tela apenas se esse nome 
iniciar-se com vogal, caso contrário imprima na tela a seguinte mensagem:
Esse nome não inicia com vogal
*/
import java.util.Scanner;

public class Prog7{
    public static void main(String [] args){
        //Iniciando o objeto Scanner
        Scanner ler;
        String nome;
         
         //Iniciando o objeto Scanner
        ler = new Scanner(System.in);
        
        System.out.print("Informe um nome: ");
        nome = ler.nextLine().toUpperCase();
        
        if((nome.charAt(0) == 'A') || (nome.charAt(0)== 'E') || (nome.charAt(0)== 'I') ||
           (nome.charAt(0)== 'O') || (nome.charAt(0)== 'U')){
            System.out.println(nome);
        }else{
               System.out.println("Esse nome nao se inicia com vogal");
        }
    }
}
