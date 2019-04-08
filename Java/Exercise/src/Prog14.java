/*
Exemplo de uma construção basica em Java

https://docs.oracle.com/javase/8/docs/api/ --> site java detalhamento de classes
 
Faça um programa que digite duas palavras e verifique se as palavras digitadas
são iguais ou diferentes. Se forem iguais escreva iguais caso contrário escreva diferente
*/
import java.util.Scanner;

public class Prog14{
    public static void main(String [] args){
        //Iniciando o objeto Scanner
        Scanner ler;
        String nome, nome1;
 
         //Iniciando o objeto Scanner
        ler = new Scanner(System.in);
       
       System.out.print("Digite uma palavra1: ");
        nome = ler.nextLine();
         
        System.out.print("Digite uma palavra2: ");
        nome1 = ler.nextLine();
        
        //if(nome.equalsIgnoreCase(nome1)){
        if(nome.equalsIgnoreCase(nome1)){
            System.out.println("As palavras acima são iguais");
        }else{
            System.out.println("As palavras acima são diferentes");   
        }
      
    }
}
