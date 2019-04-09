package com.winer.cursojava.estruturado.exer01;
/*
Exemplo de uma construção basica em Java

https://docs.oracle.com/javase/8/docs/api/ --> site java detalhamento de classes


Aplicação em Java: Ver qual o valor padrão de inicialização das variaveis 
primitivas.
O programa dá erro porque as variáveis dos métodos não são inicializadas 
automaticamente apenas as variáveis de classe;
*/
public class Variaveis2{
    public static void main(String [] args){
        
        //Prog3 ab = new Prog3();
        //tipos inteiros
        byte a1 = 0;
        short a2 = 0;
        int a3 = 0;
        long a4 = 0;
        
        //tipos que aceitam ponto flutuante
        float a5 = 0;
        double a6 = 0;
        
        //tipo caractere
        char a7 = 0;
        
        //tipo booleano
        boolean a8 = false;
             
        System.out.println("Os valor da variave a1 = "+a1);
        System.out.println("Os valor da variave a2 = "+a2);
        System.out.println("Os valor da variave a3 = "+a3);
        System.out.println("Os valor da variave a4 = "+a4);
        System.out.println("Os valor da variave a5 = "+a5);
        System.out.println("Os valor da variave a6 = "+a6);
        System.out.println("Os valor da variave a7 = "+a7);
        System.out.println("Os valor da variave a8 = "+a8);
        
    }
}