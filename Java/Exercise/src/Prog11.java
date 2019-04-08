/*
 https://docs.oracle.com/javase/8/docs/api/ --> site java detalhamento de classes

 Exercício:
 Faça uma aplicação no qual o usuário digite uma sigla do estado e programa 
 apresente na tela o nome do estado
 */

import java.util.Scanner;

public class Prog11 {

    public static void main(String[] args) {
        //Iniciando o objeto Scanner
        Scanner ler;
        String dado;

        //Iniciando o objeto Scanner
        ler = new Scanner(System.in);

        System.out.print("Digite a sigla do estado:  ");
        dado = ler.nextLine();
        switch (dado.toUpperCase()) {
            case "TO": {
                System.out.println("Tocantins");
                break;
            }
            case "MA": {
                System.out.println("Maranhao");
                break;
            }
            case "PA": {
                System.out.println("PARÁ");
                break;
            }
            case "GO": {
                System.out.println("Goiás");
                break;
            }
            default: {
                System.out.println("Associação nao encontrada");
            }
        }
    }
}
