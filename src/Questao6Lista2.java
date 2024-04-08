import java.util.Scanner;

public class Questao6Lista2 {

    public static void main(String[] args) {

        int n1, n2, n3;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Entre com 3 lados do triangulo");
        n1 = leitor.nextInt();
        n2 = leitor.nextInt();
        n3 = leitor.nextInt();

        //Usado formula (A < B+C) e (B < A+C) e (C < A+B)
        if (n1 <= n2+n3 && n2 <= n1+n3 && n3 <= n1+n2 ) {
            System.out.println (" Os lados formam um triângulo");
        }else {
            System.out.println(" Os lados não formam um triângulo");
        }
    }
}


