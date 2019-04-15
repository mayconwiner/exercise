package Helder;
/*
 Exemplo de uma construção basica em Java

 https://docs.oracle.com/javase/8/docs/api/ --> site java detalhamento de classes


 Um banco concede empréstimo a seus clientes no valor conforme o valor bruto
 do salário a ser informado.
 o valor a ser emprestado deve ser em referência ao salário loquido
 Desconto de INSS sobre o salário bruto - 11%
 Desconto de IR sobre o salário bruto - 8%
 Para permitir o empréstimo o valor da parcela não pode ultrapassar 30% do salário liquido
 A quandidade máxima de meses para se pagar o empréstimo é de 48x

 Após a entrada dos dados a aplicação deverá retornar as seguintes informações:
 VALOR DA PARCELA PARA PAGAMENTO EM 12X - juros simples de 10%
 VALOR DA PARCELA PARA PAGAMENTO EM 24X - juros simples de 12%
 VALOR DA PARCELA PARA PAGAMENTO EM 36X - juros simples de 15%
 VALOR DA PARCELA PARA PAGAMENTO EM 48X - juros simples de 18%
 */

import java.util.Scanner;

public class Emprestimo {

    public static void main(String[] args) {

        float salarioBruto, salarioLiquido;
        float impINSS = 11, impIR = 8;
        float emprestimo, valorPerc30;
        float j12x = 10, j24x = 12, j36x = 15, j48x = 18;

        System.out.print("Entre com o salário bruto: ");
        salarioBruto = new Scanner(System.in).nextFloat();

        salarioLiquido = salarioBruto - salarioBruto * impINSS / 100F;
        System.out.printf("Menos desconto de %.2f do INSS- Salario liquido = %.2f\n", impINSS, salarioLiquido);

        salarioLiquido = salarioLiquido - salarioBruto * impIR / 100F;
        System.out.printf("Menos desconto de %.2fdo IR  - Salario liquido = %.2f\n", impIR, salarioLiquido);

        valorPerc30 = salarioLiquido * 0.3F;
        System.out.print("Informe o valor de emprestimo solicitado: ");
        emprestimo = new Scanner(System.in).nextFloat();

        if (((emprestimo + emprestimo * j12x / 100) / 12) > valorPerc30) {
            System.out.printf("O emprestimo de %.2f não pode ser financiado em 12x\n", emprestimo);
            System.out.println("O valor da parcela ultprassou 30%% do salario liquido");
            System.out.println("----------------------------------------------------------");
        } else {
            System.out.printf("Emprestimo de %.2f fica 12x de %.2f\n", emprestimo, emprestimo / 12);
            System.out.println("----------------------------------------------------------");
        }

        if (((emprestimo + emprestimo * j24x / 100) / 24) > valorPerc30) {
            System.out.printf("O emprestimo de %.2f não pode ser financiado em 24x\n", emprestimo);
            System.out.println("O valor da parcela ultprassou 30%% do salario liquido");
            System.out.println("----------------------------------------------------------");
        } else {
            System.out.printf("Emprestimo de %.2f fica 24x de %.2f\n", emprestimo, emprestimo / 24);
            System.out.println("----------------------------------------------------------");
        }

        if (((emprestimo + emprestimo * j36x / 100) / 36) > valorPerc30) {
            System.out.printf("O emprestimo de %.2f não pode ser financiado em 36x\n", emprestimo);
            System.out.println("O valor da parcela ultprassou 30%% do salario liquido");
            System.out.println("----------------------------------------------------------");
        } else {
            System.out.printf("Emprestimo de %.2f fica 36x de %.2f\n", emprestimo, emprestimo / 36);
            System.out.println("----------------------------------------------------------");
        }

        if (((emprestimo + emprestimo * j48x / 100) / 48) > valorPerc30) {
            System.out.printf("O emprestimo de %.2f não pode ser financiado em 48x\n", emprestimo);
            System.out.println("O valor da parcela ultprassou 30%% do salario liquido");
            System.out.println("----------------------------------------------------------");
        } else {
            System.out.printf("Emprestimo de %.2f fica 48x de %.2f\n", emprestimo, emprestimo / 48);
            System.out.println("----------------------------------------------------------");
        }

    }
}
