package com.winer.cursojava.estruturado.exer01;

/*
Exemplo de uma construção basica em Java

https://docs.oracle.com/javase/8/docs/api/ --> site java detalhamento de classes

 Exemplo: Fazendo uso de teste condicional simplificado (operador ternário)
*/

public class Variaveis1{
    public static void main(String [] args){
        int x=1, y=2;

        System.out.println("O valor de x = "+x +" e o valor de y =  "+y);
        x=((y <3)?5:6);
        System.out.println("O valor de x = "+x +" e o valor de y =  "+y);
        x=(!(y<3)?7:8);
        System.out.println("O valor de x = "+x +" e o valor de y =  "+y);
        x=((y<3) || (y>10)?11:12);
        System.out.println("O valor de x = "+x +" e o valor de y =  "+y);
        x=((y<3) && (y>10)?20:30);
        System.out.println("O valor de x = "+x +" e o valor de y =  "+y);


    }
}
