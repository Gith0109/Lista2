import java.util.Scanner;

public class Questao9Lista2 {

    public static void main(String[] args) {

        int n1;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite quantas laranjas serão compradas");
        n1 = leitor.nextInt();

        if (n1 <= 11 && n1 >= 1)
            System.out.printf("%s\n%d unidade(s) de laranja a R$ 0,30 a unidade = %.2f\n",
                    "--- Valor da Compra ---", n1, (double) n1 * 0.30);
        else if ( n1 >= 12 ) {
            System.out.printf("%s\n%d unidade(s) de laranja a R$ 0,25 a unidade = %.2f\n",
                    "--- Valor da Compra ---",n1, (double) n1 * 0.25);
        }else{
            System.out.println("Nenhum item esta sendo comprado");
        }

    }
}

