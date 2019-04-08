

/*
Exemplo de uma construção basica em Java

https://docs.oracle.com/javase/8/docs/api/ --> site java detalhamento de classes


Manipulando tipos não primitivos Wrappers, atribuindo tipos primitivos a Wrappers
*/
public class Prog7{
    public static void main(String [] args){
        //tipos inteiros
        byte a1 = 10;
        Byte x1 = a1;
        
        short a2 = 34;
        Short x2 = a2;
        
        int a3 = 1000;
        Integer x3 = a3;
        
        long a4 = 10000;
        Long x4 = a4;
        
        //tipos que aceitam ponto flutuante
        float a5 =  3.6F; //toda literal por padrao é do tipo double;
        Float x5 = a5;
        
        double a6 = 10.6;
        Double x6 = a6;
        
        //tipo caractere
        char a7 = 'B';
        Character x7 = a7;
        
        //tipo booleano
        boolean a8 = true;
        Boolean x8 = a8;
        
        System.out.println("Tipos Primitivos");
        System.out.println("Os valor da variave a1 = "+a1);
        System.out.println("Os valor da variave a2 = "+a2);
        System.out.println("Os valor da variave a3 = "+a3);
        System.out.println("Os valor da variave a4 = "+a4);
        System.out.println("Os valor da variave a5 = "+a5);
        System.out.println("Os valor da variave a6 = "+a6);
        System.out.println("Os valor da variave a7 = "+a7);
        System.out.println("Os valor da variave a8 = "+a8);
        
        System.out.println("\n\nTipos Não Primitivos - Wrappers");
        System.out.println("Os valor da variave a1 = "+x1);
        System.out.println("Os valor da variave a2 = "+x2);
        System.out.println("Os valor da variave a3 = "+x3);
        System.out.println("Os valor da variave a4 = "+x4);
        System.out.println("Os valor da variave a5 = "+x5);
        System.out.println("Os valor da variave a6 = "+x6);
        System.out.println("Os valor da variave a7 = "+x7);
        System.out.println("Os valor da variave a8 = "+x8);

    }
}
