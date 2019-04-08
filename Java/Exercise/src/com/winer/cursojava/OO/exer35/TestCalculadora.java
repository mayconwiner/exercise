package com.winer.cursojava.OO.exer35;

public class TestCalculadora {

    public static void main(String[] args) {

        int fatorialNR = Calculadora.fatorialNaoRecursivo(5);
        System.out.println(fatorialNR);
        
        int fatorialR = Calculadora.fatorial(5);
        System.out.println(fatorialR);
    }
}
