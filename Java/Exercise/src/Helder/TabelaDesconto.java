/*
 Um posto está vendendo com a seguinte tabela de descontos:
 alcool
 -> até 20 litros, desconto de 3% por litro
 -> acima de 20 litros, descontro de 5% por litro

 gasolina
 -> até 20 litros, desconto de 4% por litro
 -> acima de 20 litros, desconto de 6% por litro

 Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível
 (codificado da seguinte forma: A-alcool, G-gasolina), calcule e imprima o valor 
 a ser pago pelo cliente sabendo que o preço a ser calaculado é R$ 3,50 o litro
 do alcool e R$4,90 o litro da gasolina.
 Obs: O cliente pode solicitar o uso dos dois combustíveis, ou seja, por exemplo
 coloque 10 litros d alcool e 30 litros de gasolina

 */
package Helder;

import java.util.Scanner;

public class TabelaDesconto {

    public static void main(String[] args) {

        //Iniciando o objeto Scanner
        Scanner ler;
        float la, lg, totalA = 0, totalG = 0;
        float valorLitroAlcool = 3.5F, valorLitroGas = 4.9F;
        float descAat20l = 3.0F, descAac20l = 5F;
        float descGat20l = 4.0F, descGac20l = 6F;

        //Iniciando o objeto Scanner
        ler = new Scanner(System.in);

        System.out.print("Quantos litros de alcool? ");
        la = ler.nextFloat();

        System.out.print("Quantos litros de gasolina? ");
        lg = ler.nextFloat();

        if (la != 0) {
            totalA = (la * valorLitroAlcool);
            if (la <= 20) {
                totalA = totalA - (totalA * descAat20l) / 100F;
            } else {
                totalA = totalA - (totalA * descAac20l) / 100F;
            }
        }

        if (lg != 0) {
            totalG = (lg * valorLitroGas);
            if (la <= 20) {
                totalG = totalG - (totalG * descGat20l) / 100F;
            } else {
                totalG = totalG - (totalG * descGac20l) / 100F;
            }
        }

        System.out.printf("O custo total do combustível é R$ %.2f\n ", (totalA + totalG));
    }
}
