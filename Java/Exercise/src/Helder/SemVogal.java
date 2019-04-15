/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helder;

import java.util.Scanner;

public class SemVogal {

    public static void main(String[] args) {
        String nome;

        System.out.print("Digite um nome: ");
        nome = new Scanner(System.in).nextLine();

        nome = nome.toUpperCase();
        nome = nome.replace('A', ' ');
        nome = nome.replace('E', ' ');
        nome = nome.replace('I', ' ');
        nome = nome.replace('O', ' ');
        nome = nome.replace('U', ' ');
        nome = nome.replaceAll(" ", "");
        System.out.println(nome);
    }
}
