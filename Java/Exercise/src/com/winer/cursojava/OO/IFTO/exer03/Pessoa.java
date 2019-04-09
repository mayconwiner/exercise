import java.util.Calendar;

public class Pessoa {
//Atributos:

    String nome;
    int anoNascimento;
//Método Construtor:

    public Pessoa(String no, int anoNasc) {
        this.nome = no;
        this.anoNascimento = anoNasc;
    }
//Método Público:

    public int calcularIdade() {
        Calendar hoje = Calendar.getInstance();
        int idade = hoje.get(Calendar.YEAR) - this.anoNascimento;
        return idade;
    }

    public static void main(String[] args) {
        Pessoa pessoa[] = new Pessoa[10];
        pessoa[0] = new Pessoa("He-Man", 1983);
        System.out.println(" 1. " + pessoa[0].nome + " " + pessoa[0].calcularIdade() + " anos");
        pessoa[1] = new Pessoa("Seya", 1986);
        System.out.println(" 2. " + pessoa[1].nome + " " + pessoa[1].calcularIdade() + " anos");
        pessoa[2] = new Pessoa("Shiryu", 1986);
        System.out.println(" 3. " + pessoa[2].nome + " " + pessoa[2].calcularIdade() + " anos");
        pessoa[3] = new Pessoa("Goku", 1979);
        System.out.println(" 4. " + pessoa[3].nome + " " + pessoa[3].calcularIdade() + " anos");
        pessoa[4] = new Pessoa("Vegeta", 1971);
        System.out.println(" 5. " + pessoa[4].nome + " " + pessoa[4].calcularIdade() + " anos");
        pessoa[5] = new Pessoa("Kuririn", 1975);
        System.out.println(" 6. " + pessoa[5].nome + " " + pessoa[5].calcularIdade() + " anos");
        pessoa[6] = new Pessoa("Jaspion", 1985);
        System.out.println(" 7. " + pessoa[6].nome + " " + pessoa[6].calcularIdade() + " anos");
        pessoa[7] = new Pessoa("Jiraya", 1985);
        System.out.println(" 8. " + pessoa[7].nome + " " + pessoa[7].calcularIdade() + " anos");
        pessoa[8] = new Pessoa("Naruto", 1987);
        System.out.println(" 9. " + pessoa[8].nome + " " + pessoa[8].calcularIdade() + " anos");
        pessoa[9] = new Pessoa("Boruto", 2007);
        System.out.println("10. " + pessoa[9].nome + " " + pessoa[9].calcularIdade() + " anos");
    }

}
