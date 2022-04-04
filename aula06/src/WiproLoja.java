import java.util.Scanner;

public class WiproLoja {

    public static boolean continuaCompra = true;

    public static void main(String[] args) {
        Scanner leitorTeclado = new Scanner(System.in);

        String opcaoCliente = "s";
        int itemDesejado = 0, quantidadeItem = 0;
        Object[][] carrinho = new Object[10][3];

        while (continuaCompra != false) {
            System.out.println("\n\t============ Bem vindo a Loja Wipro ============\n");

            String[] nomeProduto = new String[]{"Cebola", "Banana", "Batata", "Cenoura", "Maçã", "Bolacha", "Massa", "Arroz", "Sabão", "Esponja"};
            int[] estoqueProduto = new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
            double[] precoProduto = new double[]{3.99, 4.99, 2.49, 11.99, 3.49, 1.99, 2.99, 14.99, 3.39, 0.99};
            for (int i = 0; i < nomeProduto.length; i++) {
                System.out.printf("%d\t\t\t", i + 1);
                System.out.print(nomeProduto[i] + "\t\t\t\t\t");
                System.out.print(estoqueProduto[i] + "\t\t\t\t");
                System.out.println("R$ " + precoProduto[i] + "");
            }

            System.out.println("\nDigite o código do produto que você deseja: ");
            itemDesejado = leitorTeclado.nextInt() - 1;
            System.out.println("Digite a quantidade do produto: ");
            quantidadeItem = leitorTeclado.nextInt();

            // Testes impressão
            carrinho[0][0] = nomeProduto[itemDesejado];
            carrinho[0][1] = quantidadeItem;
            carrinho[0][2] = precoProduto[itemDesejado] * quantidadeItem;

            for (int i = 0; i < carrinho.length; i++) {
                System.out.printf("%d\t\t\t", i + 1);
                for (int j = 0; j < carrinho[i].length; j++) {
                    System.out.print(carrinho[i][j] + "\t\t\t");
                }
                System.out.println();
            }

            leitorTeclado.next();
            System.out.println("Deseja seguir comprando S/N");
            opcaoCliente = leitorTeclado.nextLine();

            continuaCompra = verificaOpcao(opcaoCliente);
        }
    }

    private static boolean verificaOpcao(String opcaoCliente) {
        Scanner leitorTeclado = new Scanner(System.in);
        while (!opcaoCliente.equals("n") && !opcaoCliente.equals("N") && !opcaoCliente.equals("s") && !opcaoCliente.equals("S")) {
            System.out.println("Por favor digite uma opção válida para o menu! (S/N)");
            opcaoCliente = leitorTeclado.nextLine();
        }
        if (opcaoCliente.equals("n") || opcaoCliente.equals("N"))
            continuaCompra = false;
        else if (opcaoCliente.equals("s") || opcaoCliente.equals("S"))
            continuaCompra = true;

        return continuaCompra;
    }

    //            for (int i = 0; i < carrinho.length; i++) {
//                for (int j = 0; j < carrinho[i].length; j++) {
//                    System.out.print(carrinho[i][j] + "\t\t\t\t\t\t\t");
//                }
//                System.out.println();
//            }
//            Object[][] produtos = new Object[][]{{"Cebola", 10, 3.99},
//                    {"Banana", 10, 4.99},
//                    {"Batata", 10, 2.49},
//                    {"Cenoura", 10, 11.99},
//                    {"Ovos", 10, 6.49},
//                    {"Bolacha", 10, 1.99},
//                    {"Massa", 10, 2.99},
//                    {"Arroz", 10, 14.99},
//                    {"Sabão", 10, 3.39},
//                    {"Esponja", 10, 0.99}};
}
