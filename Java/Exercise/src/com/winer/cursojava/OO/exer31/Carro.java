package com.winer.cursojava.OO.exer31;

public class Carro {

    public String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    private double consumoCombustivel;

    public void exibirAutonomia() {
        System.out.println("A autonomia do carro é : " + capCombustivel * consumoCombustivel);
    }

    public double obterAutonomia() {
        System.out.println("Método obterAutonomia foi chamado");
        return this.capCombustivel * this.consumoCombustivel;
    }

    private double divideKMPorconsumoCombustivel(double km) {
    return km / this.consumoCombustivel;
    }

    public double calcularCombustivel(double km) {
         
        return this.divideKMPorconsumoCombustivel(km);
    }
}
