/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.winer.cursojava.OO.IFTO.exer02;

/**
 *
 * @author ana
 */
public class Principal {
    public static void main(String[] args) {
        Rinoceronte r1 = new Rinoceronte("rino 1",12);
        Rinoceronte r2 = new Rinoceronte("rino 2",10);
        Antilope a1 = new Antilope("ant1");
        Hipopotamo h1 = new Hipopotamo("hipo1");
        Hipopotamo h2 = new Hipopotamo("hipo2");
        Hipopotamo h3 = new Hipopotamo("hipo3");
        
        r1.andar();
        r1.comer();
        r1.dormir();
        r2.andar();
        r2.comer();
        r2.dormir();
        a1.andar();
        a1.comer();
        a1.dormir();
        h1.andar();
        h1.comer();
        h1.dormir();
        h2.andar();
        h2.comer();
        h2.dormir();
        h3.andar();
        h3.comer();
        h3.dormir();
        
        
    }
}
