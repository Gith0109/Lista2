import java.util.Scanner;

public class Questao10Lista2 {

    public static void main(String[] args) {

        int entrada, n1, n2, n3, n4;

        Scanner leitor = new Scanner(System.in);
        System.out.printf("%s\n%s\n%s\n%s\n%s\n\n%s\n",
                "-------- Lista de Produtos e Preços -----",
                "1. Banana -> R$ 0,30 \"Preço a Granel\" ou R$ 0,25 \"Preço em Duzia ou Mais\"",
                "2. Laranja -> R$ 0,40 \"Preço a Granel\" ou R$ 0,35 \"Preço em Duzia ou Mais\"",
                "3. Maçã -> R$ 0,50 \"Preço a Granel\" ou R$ 0,45 \"Preço em Duzia ou Mais\"",
                "4. Kiwi -> R$ 0,40 \"Preço a Granel\" ou R$ 0,30 \"Preço em Duzia ou Mais\"",
                "Escolha o \"Produto Desejado\" ou Digite -1 para Sair:");

        entrada = leitor.nextInt();

        if(entrada == -1)
            System.out.printf("%s", "Operação Finalizada!");

        switch (entrada) {
            case 1 -> {
                System.out.printf("%s\n", "Escolha a quantidade de Banana desejada:");
                n1 = leitor.nextInt();
                if (n1 <= 11 && n1 >= 1)
                    System.out.printf("%s\n %d %s %.2f",
                            "----- Valor da Compra -----", n1,
                            "Unidade(s) de banana a R$0,30 a unidade = R$", (double) n1 * 0.30);
                else if (n1 >= 12) {
                    System.out.printf("%s\n %d %s %.2f\n",
                            "--- Valor da Compra ---", n1, "Unidade(s) de banana a R$ 0,25 a unidade =",
                            (double) n1 * 0.25);
                } else {
                    System.out.println("Nenhum item esta sendo comprado");
                }
            }
            case 2 -> {
                System.out.printf("%s\n", "Escolha a quantidade de Laranja desejada:");
                n2 = leitor.nextInt();
                if (n2 <= 11 && n2 >= 1)
                    System.out.printf("%s\n %d %s %.2f",
                            "----- Valor da Compra -----", n2,
                            "Unidade(s) de laranja a R$0,40 a unidade = R$", (double) n2 * 0.40);
                else if (n2 >= 12) {
                    System.out.printf("%s\n %d %s %.2f\n",
                            "--- Valor da Compra ---", n2, "Unidade(s) de laranja a R$ 0,35 a unidade =",
                            (double) n2 * 0.35);
                } else {
                    System.out.println("Nenhum item esta sendo comprado");
                }
            }
            case 3 -> {
                System.out.printf("%s\n", "Escolha a quantidade de Maçã desejada:");
                n3 = leitor.nextInt();
                if (n3 <= 11 && n3 >= 1)
                    System.out.printf("%s\n %d %s %.2f",
                            "----- Valor da Compra -----", n3,
                            "Unidade(s) de maçã a R$0,50 a unidade = R$", (double) n3 * 0.50);
                else if (n3 >= 12) {
                    System.out.printf("%s\n %d %s %.2f\n",
                            "--- Valor da Compra ---", n3, "Unidade(s) de maçã a R$ 0,45 a unidade =",
                            (double) n3 * 0.45);
                } else {
                    System.out.println("Nenhum item esta sendo comprado");
                }
            }
            case 4 -> {
                System.out.printf("%s\n", "Escolha a quantidade de Kiwi desejada:");
                n4 = leitor.nextInt();
                if (n4 <= 11 && n4 >= 1)
                    System.out.printf("%s\n %d %s %.2f",
                            "----- Valor da Compra -----", n4,
                            "Unidade(s) de kiwi a R$0,40 a unidade = R$", (double) n4 * 0.40);
                else if (n4 >= 12) {
                    System.out.printf("%s\n %d %s %.2f\n",
                            "--- Valor da Compra ---", n4, "Unidade(s) de kiwi a R$ 0,30 a unidade =",
                            (double) n4 * 0.30);
                } else {
                    System.out.println("Nenhum item esta sendo comprado");
                }
            }
            default -> {
            }
        }
    }
}

