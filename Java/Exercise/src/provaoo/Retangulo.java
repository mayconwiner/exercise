package provaoo;

public class Retangulo {

    private double largura;
    private double altura;

    public Retangulo() {
    }

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double perimetro(double base, double altura) {
        base = this.largura;
        altura = this.altura;
        double perimetro = 2 * base + 2 * altura;
        return perimetro;
    }

    public double area(double base, double altura) {
        double area = 0;
        area = (base * altura);
        return area;
    }

    public void imprimirPerimetro() {
       double p = perimetro(this.largura, this.altura);
        System.out.println("O valor do perimetro é : " + p);
    }
    
    public void imprimirArea() {
       double a = area(this.largura, this.altura);
        System.out.println("O valor da area é :" + a);
    }
}
