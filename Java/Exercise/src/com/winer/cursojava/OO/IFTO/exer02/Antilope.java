package com.winer.cursojava.OO.IFTO.exer02;

public class Antilope {
    private String nome;

    public Antilope(String nome) {
        this.nome = nome;
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
