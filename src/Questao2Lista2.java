import java.util.Scanner;

public class Questao2Lista2 {

    public static void main(String[] args) {
        int numero;

        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {

            System.out.println("Leitor par ou impar");
            numero = leitor.nextInt();

            if (numero %2 ==0) {
                System.out.println("Numero é par");
            } else {
                System.out.println("Numero é impar");
            }
        }
    }
}

