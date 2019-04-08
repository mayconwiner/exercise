/*
Exemplo de uma construção basica em Java

https://docs.oracle.com/javase/8/docs/api/ --> site java detalhamento de classes




Faça uma aplicação no qual o usuário informa um número e o programa 
deverá informar se o número é positivo ou negativo e se o número é par ou impar.
 */
import java.util.Scanner;
public class Prog2{
    public static void main(String [] args){
        
        System.out.print("Digite um numero: ");
        int x= new Scanner(System.in).nextInt();

        if (x >= 0){
            System.out.println(x + " é um numero positivo");
        }else{
            System.out.println(x + " é um numero negativo");
        }

        if(x %2 == 0){
            System.out.println(x + " é um numero par");
        }else{
            System.out.println(x + " é um numero impar");
        }
    }
}
