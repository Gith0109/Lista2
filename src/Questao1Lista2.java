import java.util.Scanner;

public class Questao1Lista2 {

    public static void main(String[] args) {
        int numero;

        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {

            System.out.println("Leitor de maior que 100");
            numero = leitor.nextInt();

            if (numero > 100) {
                System.out.println("Numero é maior que 100");
            } else {
                System.out.println("Numero não é maior que 100");
            }
        }
    }
}

