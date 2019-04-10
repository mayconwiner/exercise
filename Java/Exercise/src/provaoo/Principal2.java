package provaoo;
  //Instancia  e imprime a classe Desenho

import java.util.Scanner;

public class Principal2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Desenho desenho = new Desenho();
        System.out.println("Entre com o valor para efetuar os testes :");
        int num = leitor.nextInt();
        desenho.Desenho(num);

    }
}
