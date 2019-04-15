/*
 
Faça um programa que receba via teclado três números inteiros
e apresente na tela o maior dos números digitados
*/
package Helder;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner ler;
        int n1,n2,n3, maior = 0;
        ler = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        n1 = ler.nextInt();
        maior = n1;
        
        System.out.println("Digite o segundo numero");
        n2 = ler.nextInt();
        if (n2 > maior)
            maior = n2;
        
        System.out.println("Digite o terceiro numero");
        n3 = ler.nextInt();
        if(n3 > maior)
            maior = n3;
        System.out.println("O maior numero digitado é : " + maior);
        
    }
}
