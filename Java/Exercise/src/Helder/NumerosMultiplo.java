package Helder;
/*
Exemplo de uma construção basica em Java

https://docs.oracle.com/javase/8/docs/api/ --> site java detalhamento de classes


Faça uma aplicação que analise um número inteiro x e apresente uma das seguintes mensagens na tela:

- O numero x é multiplo de 2, de 3 e de 5

- O número x é multiplo apenas de 2 e de 3

- O número x é multiplo apenas de 2 e de 5

- O número x é multiplo apenas de 3 e de 5

- O número x é múltiplo apenas de 2

- O número x é múltiplo apenas de 3

- O número x é múltiplo apenas de 5

- O número x não é múltiplo de 2, de 3 ou de 5
*/
import java.util.Scanner;
 
public class NumerosMultiplo {
    public static void main(String[] args) {
        
    
int num;
        
        System.out.print("Digite um número inteiro: ");
        num = new Scanner(System.in).nextInt();
        
        
        if((num%2 ==0) && (num%3==0) && (num%5==0))
            System.out.printf("%d é multiplo de 2, de 3 e de 5\n",num);
        else
            if((num%2 ==0) && (num%3==0) && (num%5!=0))
                System.out.printf("%d é multiplo apenas de 2 e de 3\n",num);
            else
                if((num%2 ==0) && (num%3!=0) && (num%5==0))
                    System.out.printf("%d é multiplo apenas de 2 e de 5\n",num);
                else
                    if((num%2 !=0) && (num%3==0) && (num%5==0))
                        System.out.printf("%d é multiplo apenas de 3 e de 5\n",num);
                    else
                        if((num%2 ==0) && (num%3!=0) && (num%5 !=0))
                            System.out.printf("%d é multiplo apenas de 2\n",num);
                        else
                            if((num%2 !=0) && (num%3==0) && (num%5!=0))
                                System.out.printf("%d é multiplo apenas de 3\n",num);
                            else
                                if((num%2 !=0) && (num%3!=0) && (num%5==0))
                                    System.out.printf("%d é multiplo apenas de 5\n",num);
                                else
                                    System.out.printf("%d não é multiplo de 2, de 3 ou de 5\n",num);
    }
}