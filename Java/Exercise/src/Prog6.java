/*
Exemplo de uma construção basica em Java

https://docs.oracle.com/javase/8/docs/api/ --> site java detalhamento de classes


 Faça uma aplicação de triagem de contratação de funcionário no qual o usuário 
informe o nome, sexo e idade. Como parâmetro para seleção o programa deverá 
selecionar apenas usuários do sexo feminino que possuam idade igual ou inferior 
a 25 anos. Se os dados informados obedecerem esse filtro o programa deverá 
apresentar a mensagem "SELECIONADO PARA SEGUNDA FASE";
*/
import java.util.Scanner;

public class Prog6{
    public static void main(String [] args){
        //Iniciando o objeto Scanner
        Scanner ler;
        String nome;
        short idade;
        char sexo;
        
         //Iniciando o objeto Scanner
        ler = new Scanner(System.in);
        
        System.out.print("Informe o seu nome: ");
        nome = ler.nextLine();
        
        System.out.print("Informe sua idade: ");
        idade = ler.nextShort();
        
        System.out.print("Informe seu sexo M/F: ");
        sexo = (ler.next().toUpperCase().charAt(0));
        
        if((idade <= 25) && (sexo == 'F')){
            System.out.println(nome + " - SELECIONADO PARA SEGUNDA FASE");
        }else{
            System.out.println(nome + " - NÃO SELECIONADO PARA SEGUNDA FASE");
        }
    }
}
