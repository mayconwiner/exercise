package com.winer.cursojava.estruturado.exer01;
import javax.swing.JOptionPane;



/*
Exemplo de uma construção basica em Java

https://docs.oracle.com/javase/8/docs/api/ --> site java detalhamento de classes

/*
Fazendo uma aplicação para inserção de nome e idade, sendo que esses
dados serão inseridos em tempo de execução
*/
import java.util.Scanner;
public class ScanerBasico{
    public static void main(String [] args){
 
        String nome;
        int id;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        nome = ler.nextLine();
        
        System.out.print("Digite sua idade: ");
        id = ler.nextInt();
        
        System.out.println("O nome digitado foi: " + nome);
        System.out.println("A idade digitada foi: "+ id);
    }
}
