package com.winer.cursojava.OO.IFTO.exer03;

public class Employeetest {

    String nome, sobrenome;
    double salMensal;

    public Employeetest(String nome, String sobrenome, double salmensal) {
        this.setNome(nome);
        this.setSobreNome(sobrenome);
        this.setSalMensal(salmensal);
    }
//Métodos Getters e Setters:

    public String getNome() {
        return this.nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return this.sobrenome;
    }

    private void setSobreNome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalMensal() {
        return this.salMensal;
    }

    private void setSalMensal(double salmensal) {
        this.salMensal = salmensal;
    }
//Método Público:

    public double aumentoSal() {
        double salanual = this.getSalMensal() * 12;
        double salanualaum = salanual + (salanual * 0.1);
        return salanualaum;
    }

    public static void main(String[] args) {
        Employeetest em1 = new Employeetest("Jiraya", "da Silva", 2000);
        Employeetest em2 = new Employeetest("Jaspion", "de Souza", 1500);
        System.out.print(em1.getNome() + " ");
        System.out.println(em1.getSobreNome());
        System.out.printf("Salário mensal: R$ %.2f \n", em1.getSalMensal());
        System.out.printf("Salário anual: R$ %.2f \n", em1.getSalMensal() * 12);
        System.out.println("Aumento salarial: 10%");
        System.out.printf("Salário anual pós aumento: R$ %.2f \n", em1.aumentoSal());
        System.out.println("=======================================");
        System.out.print(em2.getNome() + " ");
        System.out.println(em2.getSobreNome());

    }

}
