package com.winer.cursojava.OO.IFTO.exer03;

public class Date {
    //Atributos

    int dia, mes, ano;

    public Date(int d, int m, int a) {
        if (m != 2) {
            if ((d > 0 && d < 32) && (m > 0 && m < 13) && (a > 0)) {
                this.setDia(d);
            }
            this.setMes(m);
            this.setAno(a);
        } else {
            double aux = a / 2;
            if (aux % 2 == 0) {
                if ((d > 0) && (d <= 29) && (a > 0)) {
                    this.setDia(d);
                    this.setMes(m);
                    this.setAno(a);
                }
            } else if (aux % 2 == 1) {
                if ((d > 0) && (d <= 28) && (a > 0)) {
                    this.setDia(d);
                    this.setMes(m);
                    this.setAno(a);
                }
            }
        }
    }

    public int getDia() {
        return this.dia;
    }

    public void setDia(int d) {
        this.dia = d;
    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int m) {
        this.mes = m;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int a) {
        this.ano = a;
    }
//Método Público:

    public void displayDate() {
        System.out.println(this.getDia() + "/" + this.getMes() + "/" + this.getAno());
    }

    public static void main(String[] args) {
        Date d1 = new Date(01, 04, 2019);
        d1.displayDate();
    }
}
