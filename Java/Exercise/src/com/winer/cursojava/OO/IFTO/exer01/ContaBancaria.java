package com.winer.cursojava.OO.IFTO.exer01;

public class ContaBancaria {
    String nomeCorrentista;
    double saldo;
    boolean statusConta;
    
    public void abrirConta(String nome, double deposito, boolean especial){
        nomeCorrentista = nome;
        saldo = deposito;
        statusConta = especial;
    }
    
     public void abrirContaSimples(String nome){
        nomeCorrentista = nome;
        saldo = 0.0;
        statusConta = false;
    }
     
     public void depositar(double valor){
         saldo = saldo+valor;
     }
     
     public void retirar(double valor){
         if(statusConta == true){
             saldo = saldo-valor;
         }else{
             if(saldo>=valor){
                 saldo = saldo-valor;
             }
         }
         
     }
     
     public void mostrarDados(){
         System.out.println("nome: " +nomeCorrentista);
         System.out.println("saldo: "+saldo);
         if (statusConta == true){
             System.out.println("Conta especial");
         }else{
             System.out.println("Conta simples");
         }
         
     }
    
}
