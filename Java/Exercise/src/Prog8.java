/*
https://docs.oracle.com/javase/8/docs/api/ --> site java detalhamento de classes

Exercício:
Digite um nome e o sistema deverá imprimir o nome na tela apenas se esse nome 
iniciar-se com vogal, caso contrário imprima na tela a seguinte mensagem:
Esse nome não inicia com vogal

USANDO VETOR
*/
import java.util.Scanner;

public class Prog8{
    public static void main(String [] args){
        //Iniciando o objeto Scanner
        Scanner ler;
        char nome[];
         
         //Iniciando o objeto Scanner
        ler = new Scanner(System.in);
        
        System.out.print("Informe um nome: ");
        nome = ler.nextLine().toUpperCase().toCharArray();
        
        if((nome[0] == 'A') || (nome[0]== 'E') || (nome[0]== 'I') ||
           (nome[0]== 'O') || (nome[0]== 'U')){
            System.out.println(nome);
        }else{
               System.out.println("Esse nome nao se inicia com vogal");
        }
    }
}
