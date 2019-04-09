package com.winer.cursojava.OO.IFTO.exer01;

public class Principal {

    public static void main(String args[]) {
        ContaBancaria cb1 = new ContaBancaria();
        cb1.abrirConta("GOKU", 100, true);
        cb1.depositar(10);
        cb1.mostrarDados();

        ContaBancaria cb2 = new ContaBancaria();
        cb2.abrirContaSimples("VEGETA");
        cb2.depositar(50);
        cb2.retirar(5);
        cb2.mostrarDados();
    }
}
