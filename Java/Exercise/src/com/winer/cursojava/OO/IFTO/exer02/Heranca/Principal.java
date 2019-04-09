package com.winer.cursojava.OO.IFTO.exer02.Heranca;

public class Principal {
    public static void main(String[] args) {
        Rinoceronte r1 = new Rinoceronte("rino1");
              
        Antilope a1 = new Antilope("ant1");
       
        Hipopotamo h1 = new Hipopotamo("hipo1");
        
        Animal animais[]= new Animal[3];
        animais[0] = r1;
        animais[1] = a1;
        animais[2] = h1;
        
        for (Animal animai : animais) {
            animai.andar();
            animai.comer();
            animai.dormir();
        }
       
        
        
        
        
        
        
       
        
    }//main
}//class
