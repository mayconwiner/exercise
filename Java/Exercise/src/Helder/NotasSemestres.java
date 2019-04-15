/*Faça um programa que leia o nome do aluno, o nome da  disciplina,
 duas notas obtivas na disciplina ao longo do semestre, e calcule a média e
 aplique o conceito conforme  tabela abaixo:
 Media de Aproveitamenteo     Conceito
 Entre 9 e 10                  A - Aprovado - Destaque
 Enre 7,5 e 8,9                B - Aprovado - Bom
 Entre 6 e 7,4                 C - Aprovado - Regular
 Entre 4 e 5,9                 D - Em construção 
 Entre 0 e 3,9                 E - Reprovado

 Ao ser executado e fornecendo os dados o probrama deverá apresentar as seguinte
 resposta na tela:
 Nome do aluno, nome da disciplina, media, Conceito e AProvado/Em Construção ou reprovado
 Ex:
 Nome: João Pedro Coimbra
 Disciplina: Matemática
 Media: 9,2
 Conceito: A
 Situação: Aprovado - Destaque

 */
package Helder;

import java.util.Scanner;

public class NotasSemestres {

    public static void main(String[] args) {
        //Iniciando o objeto Scanner
        Scanner ler;
        float n1, n2, md;
        String nome, disc;

        //Iniciando o objeto Scanner
        ler = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        nome = ler.nextLine();

        System.out.print("Digite o nome da disciplina: ");
        disc = ler.nextLine();

        System.out.print("Digite a nota1: ");
        n1 = ler.nextFloat();

        System.out.print("Digite a nota2: ");
        n2 = ler.nextFloat();

        md = (n1 + n2) / 2;

        System.out.println("Nome: " + nome);
        System.out.println("Disciplina: " + disc);
        System.out.printf("Media: %.2f\n", md);

        if ((md >= 9) && (md <= 10)) {
            System.out.println("Conceito: A\nSituação: Aprovado - Destaque");
        } else if ((md >= 7.5) && (md < 8.9)) {
            System.out.println("Conceito -> B\nSituação: Aprovado - Bom");
        } else if ((md >= 6) && (md < 7.4)) {
            System.out.println("Conceito -> C\nSituação: Aprovado - Regular");
        } else if ((md >= 4) && (md < 6)) {
            System.out.println("Conceito -> D\nSituação: Em Construção");
        } else {
            System.out.println("Conceito -> E\nSituação: Reprovado");
        }

    }
}
