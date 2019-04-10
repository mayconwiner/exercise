 
package provaoo;
 public class Principal {
     public static void main(String[] args) {
         
         //Instancia  e imprime os valores do perimetro e area passados na instanciação
         System.out.println("Imprimindo Retangulo 1");
         Retangulo retangulo1 = new Retangulo(10, 10);
         Retangulo retangulo2 = new Retangulo(20, 30);
         
         retangulo1.imprimirPerimetro();
         retangulo1.imprimirArea();
         
         System.out.println("---------------------------------");
         
         System.out.println("Imprimindo Retangulo 2");
         retangulo2.imprimirPerimetro();
         retangulo2.imprimirArea();
         
         
         
         
     }
    
}
