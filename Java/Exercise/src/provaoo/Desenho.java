package provaoo;

public class Desenho {

    public int Desenho(int num) {
        int lin = 0, col = 0;
        //
        for (lin = 0; lin < num; lin++) {
            for (col = 0; col < num; col++) {
                if (lin > col) {
                    System.out.print("@");
                }

            }
            System.out.println();
        }

        return num;
    }

}
