package com.winer.cursojava.estruturado.exer01;

/*
Exemplo de uma construção basica em Java

https://docs.oracle.com/javase/8/docs/api/ --> site java detalhamento de classes

Faça uma aplicação no qual o usuário informa um número e o programa deverá informar se o número é positivo ou negativo e se o número é par ou impar.
 */
import java.util.Scanner;
public class ImpPar{
    public static void main(String [] args){
        
        System.out.print("Digite um numero: ");
        int x= new Scanner(System.in).nextInt();

        if ((x >= 0) && (x%2==0))
            System.out.println(x + " é um numero positivo e par");
        
        if ((x >=0) && (x%2 !=0))
            System.out.println(x + " é um numero positivo e impar");
        
        if ((x <=0) && (x%2 ==0))
            System.out.println(x + " é um numero negativo e par");
        
        if ((x <=0) && (x%2 !=0))
            System.out.println(x + " é um numero negativo e impar");
    }
}
