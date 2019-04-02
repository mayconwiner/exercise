package com.winer.cursojava.OO.exer29;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;
    
    Carro(){
        System.out.println("Classe Carro foi instanciada");
        numPassageiros = 4;
    }
    Carro(String marca, String modelo, int numPassageiros, double capCombustivel,double consumoCombustivel){
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.consumoCombustivel = consumoCombustivel;
    }
    
    
    void exibirAutonomia() {
        System.out.println("A autonomia do carro é : " + capCombustivel * consumoCombustivel);
    }

    double obterAutonomia() {
        System.out.println("Método obterAutonomia foi chamado");
        return this.capCombustivel * this.consumoCombustivel;
    }

    double calcularCombustivel(double km) {
        double qtdCombustivel = km / this.consumoCombustivel;
        return qtdCombustivel;
    }
    
}
