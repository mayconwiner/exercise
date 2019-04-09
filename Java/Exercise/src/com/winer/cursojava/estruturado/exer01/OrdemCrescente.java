package com.winer.cursojava.estruturado.exer01;

/*
https://docs.oracle.com/javase/8/docs/api/ --> site java detalhamento de classes

Exercício:
Faça uma aplicação no qual digita-se três valores e o sistema deverá reapresentar
esses valores em ordem crescente
*/
import java.util.Scanner;

public class OrdemCrescente{
    public static void main(String [] args){
        //Iniciando o objeto Scanner
        Scanner ler;
        int n1,n2, n3, aux;
         
         //Iniciando o objeto Scanner
        ler = new Scanner(System.in);
        
        System.out.print("Informe n1: ");
        n1 = ler.nextInt();
        
        System.out.print("Informe n2: ");
        n2 = ler.nextInt();
        
        System.out.print("Informe n3: ");
        n3 = ler.nextInt();
        
        if((n1 < n2) && (n1 < n3)){
            if(n2 < n3){
                System.out.println("Ordem crescente: "+n1+" < "+n2+" < "+n3);
            }else{
                System.out.println("Ordem crescente: "+n1+" < "+n3+" < "+n2);
            }
        }
        
        if((n2 < n1) && (n2 < n3)){
            if(n1 < n3){
                System.out.println("Ordem crescente: "+n2+" < "+n1+" < "+n3);
            }else{
                System.out.println("Ordem crescente: "+n2+" < "+n3+" < "+n1);
            }
        }
        
        if((n3 < n1) && (n3 < n2)){
            if(n1 < n2){
                System.out.println("Ordem crescente: "+n3+" < "+n1+" < "+n2);
            }else{
                System.out.println("Ordem crescente: "+n3+" < "+n2+" < "+n1);
            }
        }
    }
}
