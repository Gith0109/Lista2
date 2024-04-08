import java.util.Scanner;

public class Questao4Lista2 {

    public static void main(String[] args) {

        int n1 , n2 ;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite dois números inteiros");
        n1 = leitor.nextInt();
        n2 = leitor.nextInt();

        if (n1 < n2) {
            System.out.printf("%d é menor que %d\n", n1, n2);
        }else {
            System.out.printf("%d é menor que %d\n", n2, n1);
        }

    }
}
