package com.winer.cursojava.OO.IFTO.exer02;

public class Rinoceronte {
    private String nome;
    private double peso;

    public Rinoceronte(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void andar(){
        System.out.println(nome + " andando");
    }
    
     public void comer(){
        System.out.println(nome + " comendo");
    }
     
      public void dormir(){
        System.out.println(nome + " dormindo");
    }
}
