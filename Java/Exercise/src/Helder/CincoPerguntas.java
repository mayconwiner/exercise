/*
 Exemplo de uma construção basica em Java

 https://docs.oracle.com/javase/8/docs/api/ --> site java detalhamento de classes

 Faça um programa que realize 5 perguntas para um usuário sobre o crime. As perguntas
 são:
 a - Telefonou para a vitima?
 b - Esteve no local do crime?
 c- Mora perto da vitima
 d- Devia para a vitima?
 e- Já trabalhou com a vitima?

 OBS: DIGITE APENAS S/SIM OU N/NAO PARA AS RESPOSTAS
 O programa ao final deve emitir uma classificação sobre a participação da pessoa
 no crime. Se a pessoa responder positivamente a 2 questões ela deve ser classificada
 como "Suspeita" entre 3 e 4 como "Cumplice" e 5 "Assassino". Caso contrário, ele será
 classificado como "Inocente"
 */
package Helder;

import java.util.Scanner;

public class CincoPerguntas {

    public static void main(String[] args) {

        //Iniciando o objeto Scanner
        Scanner ler;
        String resp;
        int cont = 0;

        //Iniciando o objeto Scanner
        ler = new Scanner(System.in);

        System.out.print("Você telefonou para a vitima? ");
        resp = ler.next().toUpperCase();

        if ((resp.charAt(0) == 'S')) {
            cont++;
        }

        System.out.print("Você esteve no local do crime? ");
        resp = ler.next().toUpperCase();

        if (resp.charAt(0) == 'S') {
            cont++;
        }

        System.out.print("Você mora perto da vítima? ");
        resp = ler.next().toUpperCase();
        if ((resp.charAt(0) == 'S')) {
            cont++;
        }

        System.out.print("Você devia para a vítima? ");
        resp = ler.next().toUpperCase();
        if ((resp.charAt(0) == 'S')) {
            cont++;
        }

        System.out.print("Você já trabalhou para a vítima? ");
        resp = ler.next().toUpperCase();
        if ((resp.charAt(0) == 'S')) {
            cont++;
        }

        if (cont == 2) {
            System.out.println("Suspeita");
        } else if (((cont >= 3) && cont <= 4)) {
            System.out.println("Cumplice");
        } else if (cont == 5) {
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
        }
    }
}
