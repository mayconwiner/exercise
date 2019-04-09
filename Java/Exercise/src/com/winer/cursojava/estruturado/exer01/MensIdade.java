package com.winer.cursojava.estruturado.exer01;

/*
https://docs.oracle.com/javase/8/docs/api/ --> site java detalhamento de classes

Exercício:
Faça uma aplicação no qual o usuário ditite a idade o sistema deverá apresentar
as seguintes mensagens:
Se for menor de 10 anos - Criança
Se for entre 10 e 13 anos - pré-adolecente
de 14 a 17 anos - adolecente
entre 18 e 30 anos - jovem
entre 31 e 65 anos - Adulto
Acima de 65 anos - idoso
*/
import java.util.Scanner;

public class MensIdade{
    public static void main(String [] args){
        //Iniciando o objeto Scanner
        Scanner ler;
        int id;
         
         //Iniciando o objeto Scanner
        ler = new Scanner(System.in);
        
        System.out.print("Digite a sua idade:  ");
        id = ler.nextInt();
        
        if(id < 10){
            System.out.println("Criança");
        }
        if((id >= 10) && (id <= 13)){
            System.out.println("Pré-adolecente");
        }
        
        if((id >= 14) && (id <= 17)){
            System.out.println("Adolecente");
        }
        if((id >= 18) && (id <= 30)){
            System.out.println("Jovem");
        }
       if((id >= 31) && (id <= 65)){
            System.out.println("Adulto");
        }
        if(id > 65){
            System.out.println("Idoso");
        }       
    }
}
