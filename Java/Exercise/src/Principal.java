
import java.util.Random;

public class Principal {

    public static void main(String[] args) {

        int[] notas = new int[10];
        Random random = new Random();
        
        for (int i = 0; i < notas.length; i++) {
            System.out.println(i);
        }
        for (int nota : notas) {
            System.out.println(nota);
        }
    }
}
