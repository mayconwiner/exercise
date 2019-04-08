/*
Exemplo de uma construção basica em Java

https://docs.oracle.com/javase/8/docs/api/ --> site java detalhamento de classes


/*
Aplicação em Java: Atribuição de uma variavel de um tipo a outra variavel de 
outro tipo, ou seja fazendo casting
*/
public class Prog4{
    public static void main(String [] args){
        //tipos inteiros
        byte a1 =67;
        short a2 = 34;
        int a3 = 1000;
        long a4 = 10000;
        
        //tipos que aceitam ponto flutuante
        float a5 = (float) 3.6;
        double a6 = 300.0;
        
        //tipo caractere
        char a7 = 'B';
        
        //tipo booleano
        boolean a8 = true;
        
        a2 = a1;
        a1 = (byte) a2;
        a4 = (long) a5;
        a6 = (float) a3;
        a4 = a7;
        a1 = (byte) a6;
        
        System.out.println("Os valor da variave a1 = "+a1);
        System.out.println("Os valor da variave a2 = "+(char)a2);
        System.out.println("Os valor da variave a3 = "+a3);
        System.out.println("Os valor da variave a4 = "+a4);
        System.out.println("Os valor da variave a5 = "+a5);
        System.out.println("Os valor da variave a6 = "+a6);
        System.out.println("Os valor da variave a7 = "+a7);
        System.out.println("Os valor da variave a8 = "+a8);
        
    }
}
