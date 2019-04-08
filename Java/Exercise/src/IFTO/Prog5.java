/*
Exemplo de uma construção basica em Java

https://docs.oracle.com/javase/8/docs/api/ --> site java detalhamento de classes

Aplicação em Java: Declarando variáveis constantes, 
*/
public class Prog5{



    public static void main(String [] args){
        int a1=10;
        final int A2=20; //declarando uma variavel constante
             
        System.out.println("Os valor da variave a1 = "+a1 + " e de a2 = "+A2);
        a1 = 30;
        A2 = 23;
        System.out.println("Os valor da variave a1 = "+a1 + " e de a2 = "+A2);

    }
}
