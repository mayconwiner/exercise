package com.winer.cursojava.OO.exer27;

public class Lampada {

    String modelo, tensao, cor, tipoLuz;
    int garantiaMeses, potencia;
    String[] tipos;
    boolean tipoAbajur, ligada;

    void ligar() {
        ligada = true;
    }

    void desligar() {
        ligada = false;
    }

    void mostrarEstado() {
        if (ligada) {
            System.out.println("Lâmpada esta ligada");
        } else {
            System.out.println("Lâmpada esta desligada");

        }
    }
    
    void mudarEstado(){
        if(ligada){
            desligar();
        }else{
            ligar();
        }
    }
}
