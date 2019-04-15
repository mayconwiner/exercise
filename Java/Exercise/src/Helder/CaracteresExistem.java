/*
 Faça um programa que receba um nome digitado pelo usuário e imprima na telaquantos caracteres existem nesse nome
 */
package Helder;
 
import java.util.Scanner;

public class CaracteresExistem {
    public static void main(String[] args) {
        String nome;
        Scanner leitor = new Scanner(System.in);
        nome = leitor.next();
        System.out.println("Digite o nome para contar os caracteres");
        System.out.println("Quantidade de caracteres é : " + nome.length());
    }
    
}
