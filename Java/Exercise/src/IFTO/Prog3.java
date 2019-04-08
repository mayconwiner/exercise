/*
Exemplo de uma construção basica em Java

https://docs.oracle.com/javase/8/docs/api/ --> site java detalhamento de classes

Aplicação em Java: Variáveis criadas dentro da class
*/
public class Prog3{
            //tipos inteiros
        static byte a1; //inicializado com 0
        static short a2; //inicializado com 0
        static int a3; //inicializado com 0
        static long a4; //inicializado com 0
        
        //tipos que aceitam ponto flutuante
        static float a5; //inicializado com 0.0
        static double a6; //inicializado com 0.0
        
        //tipo caractere
        static char a7; //inicializado com vazio
        
        //tipo booleano
        static boolean a8; //inicializado com false

    public static void main(String [] args){
        
        Prog4 ab = new Prog4();
        System.out.println("Os valor da variave a1 = "+a1);
        System.out.println("Os valor da variave a2 = "+a2);
        System.out.println("Os valor da variave a3 = "+a3);
        System.out.println("Os valor da variave a4 = "+a4);
        System.out.println("Os valor da variave a5 = "+a5);
        System.out.println("Os valor da variave a6 = "+a6);
        System.out.println("Os valor da variave a7 = "+a7);
        System.out.println("Os valor da variave a8 = "+a8);
        
    }
}
