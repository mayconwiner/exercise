package com.winer.cursojava.estruturado.exer01;

/*
 https://docs.oracle.com/javase/8/docs/api/ --> site java detalhamento de classes

 Exercício:
 Faça uma aplicação no qual o usuário digite uma sigla do estado e programa 
 apresente na tela o nome do estado
 */

import java.util.Scanner;

public class Equals {

    public static void main(String[] args) {
        //Iniciando o objeto Scanner
        Scanner ler;
        String dado;

        //Iniciando o objeto Scanner
        ler = new Scanner(System.in);

        System.out.print("Digite a sigla do estado:  ");
        dado = ler.nextLine();
        
        if(dado.equalsIgnoreCase("TO")){
            System.out.println("Tocantins");
        }else{
            if(dado.equalsIgnoreCase("MA")){
                 System.out.println("Maranhao");
            }else{
                if(dado.equalsIgnoreCase("PA")){
                     System.out.println("Para");
                }else{
                    if(dado.equalsIgnoreCase("GO")){
                        System.out.println("Goias");
                    }else{
                        System.out.println("Associação nao encontrada");
                    }
                }
            }
        }
    }
}
