/*
Faça um programa que digite duas palavras e verifique se as palavras
digitadas são iguais ou diferentes. Se forem iguais escreva 
iguais caso contrário escreva diferente
 */
package Helder;
 
import java.util.Scanner;

public class PalavIguais {
    public static void main(String[] args) {
        Scanner leitor;
        String nome,nome1;
        
        leitor = new Scanner(System.in);
        System.out.println("Digite a primeira palavra");
        nome = leitor.nextLine();
        System.out.println("Digite a segunda palavra");
        nome1 = leitor.nextLine();
        if (nome.equalsIgnoreCase(nome1)){
            System.out.println("palavras iguais");
        }else{
            System.out.println("Palavras diferentes");
        }
            
        
    }
}
