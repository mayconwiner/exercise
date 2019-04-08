/*
Exemplo de uma construção basica em Java

https://docs.oracle.com/javase/8/docs/api/ --> site java detalhamento de classes

/*
Fazendo uma aplicação para inserção de nome e idade, sendo que esses
dados serão inseridos em tempo de execução
*/
//package desafiocarnaval;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author aline
 */
public class Prog9
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) //throws ArithmeticException //aplica tratamento de exceção
    {
        // TODO code application logic here
        String nome;
        int id=0;
       
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        nome = ler.nextLine();
        
        System.out.print("Digite sua idade: ");
        try{
            id = ler.nextInt();
        }catch (InputMismatchException e){
            System.out.println(e.getMessage().toString());
            System.out.println("ERRO: Digite apenas número");
        }
        
        System.out.println("O nome digitado foi: " + nome);
        System.out.println("A idade digitada foi: "+ id);

    }
    
}
