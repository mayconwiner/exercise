package com.winer.cursojava.OO.IFTO.exer02.Heranca;

public abstract class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
        System.out.println("animal");
    }

  
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void andar(){
        System.out.println(nome+ "andando");
    }
    public void comer(){
        System.out.println(nome+ "comendo");
    }
    
    public void dormir(){
        System.out.println(nome+ "dormindo");
    }
    
}//class
