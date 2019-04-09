 package com.winer.cursojava.estruturado.exer01;
import java.util.Scanner;
import java.util.InputMismatchException;
 
public class Argumentos
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) //throws ArithmeticException //aplica tratamento de exceção
    {
        // TODO code application logic here
        String nome;
        int id=0;
       
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        nome = ler.nextLine();
        
        System.out.print("Digite sua idade: ");
        try{
            id = ler.nextInt();
        }catch (InputMismatchException e){
            System.out.println(e.getMessage().toString());
            System.out.println("ERRO: Digite apenas número");
        }
        
        System.out.println("O nome digitado foi: " + nome);
        System.out.println("A idade digitada foi: "+ id);

    }
    
}
