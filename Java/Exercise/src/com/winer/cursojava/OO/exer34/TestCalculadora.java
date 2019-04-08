package com.winer.cursojava.OO.exer34;

public class TestCalculadora {

    static int resultsoma;

    public static void main(String[] args) {
//        MinhaCalculadora calc = new MinhaCalculadora();
//        calc.soma(2, 3);
//        
        MinhaCalculadora.soma(1, 2);
        
        resultsoma = MinhaCalculadora.soma(1, 2);
        System.out.println(resultsoma);
        
        soma2Valores(1,2);
        
    }
    
    static int soma2Valores(int num1, int num2) {
        return MinhaCalculadora.soma(num1, num2);
    }
    
}
