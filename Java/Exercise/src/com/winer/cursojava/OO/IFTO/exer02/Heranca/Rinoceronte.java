package com.winer.cursojava.OO.IFTO.exer02.Heranca;

public class Rinoceronte extends Animal{
    private double peso;
    
    public Rinoceronte(String nome) {
        super(nome);
         System.out.println("filho");
        
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

      
    public String toString(){
        return "Rinoceronte{" + "nome "+nome+" peso=" + peso + '}';
    }

   
  
   
}
