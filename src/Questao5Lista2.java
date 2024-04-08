import java.util.Scanner;

public class Questao5Lista2 {

    public static void main(String[] args) {

        int n1;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um números inteiros");
        n1 = leitor.nextInt();

        if (n1 >= 100 && n1 <= 200) {
            System.out.printf("%d está no intervalo de 100 a 200", n1);
        } else {
            System.out.printf("%d não está no intervalo de 100 a 200", n1);
        }
    }
}
