import java.util.Scanner;

public class Questao7Lista2 {

    public static void main(String[] args) {

        int n1, n2, n3, n4, vb, vn, vl;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Entre com número de eleitores");
        n1 = leitor.nextInt();
        System.out.println("Entre com número de votos brancos");
        n2 = leitor.nextInt();
        System.out.println("Entre com número de votos nulos");
        n3 = leitor.nextInt();
        System.out.println("Entre com número de votos validos");
        n4 = leitor.nextInt();

        vb = n2 * 100 / n1;
        vn = n3 * 100 / n1;
        vl = n4 * 100 / n1;

        System.out.printf("Resultado:\n %d%s Votos Brancos\n %d%s Votos Nulos\n %d%s Votos Validos ",
                vb, "%", vn, "%", vl, "%");
    }
}
