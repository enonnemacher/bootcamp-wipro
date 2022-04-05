import java.util.ArrayList;
import java.util.Scanner;

/** Grupo 4 - Projeto Loja Wipro
 * Ederson M. de Melo
 * Ederson Rafael Nonnemacher
 * Eliton Santos de Oliveira
 * Guilherme Domingues
 * Ícaro Leone Rodrigues Nogueira
 * Lazaro Mendes de Oliveira
 * Viviane Viana Bresolin
 */

public class WiproLoja {

    public static boolean continuaCompra = true;

    public static void main(String[] args) {
        Scanner leitorTeclado = new Scanner(System.in);

        String[] nomeProduto = new String[]{"Cebola", "Banana", "Batata", "Cenoura", "Maçã", "Bolacha", "Massa", "Arroz", "Sabão", "Esponja"};
        int[] estoqueProduto = new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        double[] precoProduto = new double[]{3.99, 4.99, 2.49, 11.99, 3.49, 1.99, 2.99, 14.99, 3.39, 0.99};

        ArrayList<Integer> quantidadeProdutoCarrinho = new ArrayList<>();
        String[] nomeProdutoCarrinho = new String[10];
        double[] precoProdutoCarrinho = new double[10];
        double[] precoTotalProdutoCarrinho = new double[10];

        String opcaoCliente;
        int itemDesejado, quantidadeItem, contadorItens = 0, formaPagamento;
        double somaTotal = 0d, desconto = 0d;

        while (continuaCompra) {
            System.out.println("\n\t============ Bem vindo a Loja Wipro ============\n");

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

            if (quantidadeItem > estoqueProduto[itemDesejado]) {
                System.out.printf("Produto Indisponível! Quantidade em estoque %d\n", estoqueProduto[itemDesejado]);
            } else {
                estoqueProduto[itemDesejado] -= quantidadeItem;
                System.out.printf("\n%d un. de %s adicionado com sucesso no carrinho!\n\n", quantidadeItem, nomeProduto[itemDesejado]);
                quantidadeProdutoCarrinho.add(quantidadeItem);
                nomeProdutoCarrinho[contadorItens] = nomeProduto[itemDesejado];
                precoProdutoCarrinho[contadorItens] = precoProduto[itemDesejado];
                precoTotalProdutoCarrinho[contadorItens] = precoProduto[itemDesejado] * quantidadeItem;
                somaTotal += precoTotalProdutoCarrinho[contadorItens];
                contadorItens++;
            }

            leitorTeclado.nextLine();
            System.out.println("Deseja seguir comprando S/N: ");
            opcaoCliente = leitorTeclado.nextLine();
            continuaCompra = verificaOpcao(opcaoCliente);
        }

        System.out.println("\nITENS DO CARRINHO:");
        System.out.println("Nome\t\t\t\t\tQtde no carrinho\t\t\t\t\tPreço unit.(R$)\t\t\t\t\tPreço total (R$)");
        for (int i = 0; i < quantidadeProdutoCarrinho.size(); i++) {
            System.out.print(nomeProdutoCarrinho[i] + "\t\t\t\t\t\t\t");
            System.out.print(quantidadeProdutoCarrinho.get(i) + "\t\t\t\t\t\t\t\t");
            System.out.print(precoProdutoCarrinho[i] + "\t\t\t\t\t\t\t\t");
            System.out.printf("%.2f\n", precoTotalProdutoCarrinho[i]);
        }

        System.out.println("\nOpções de pagamento:");
        System.out.print("\n\t\t [1] À vista (dinheiro, pix ou cartão MasterdCard) tem 20% de desconto");
        System.out.print("\n\t\t [2] À vista no crédito tem 10% de desconto");
        System.out.print("\n\t\t [3] Parcelado em até 3x não tem desconto;\n\n");

        System.out.println("Qual seria a forma de pagamento?");
        formaPagamento = leitorTeclado.nextInt();
        if (formaPagamento == 1) {
            somaTotal = somaTotal * 0.8;
            desconto = somaTotal * 0.2;
        } else if (formaPagamento == 2) {
            somaTotal = somaTotal * 0.9;
            desconto = somaTotal * 0.1;
        }

        System.out.println("\nWipro STORE \nRua dos Bôbos, nº 0 - Mercadinho - LTDA \nCNPJ: 12.345.678/0001-66");
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t NOTA FISCAL");
        System.out.println("=================================================================================================");
        System.out.println("PRODUTO \t\t\t\t QTDE. PRODUTOS \t\t\t\t PREÇO UNIT. \t\t\t\t PREÇO TOTAL");
        for (int i = 0; i < quantidadeProdutoCarrinho.size(); i++) {
            System.out.print(nomeProdutoCarrinho[i] + "\t\t\t\t\t\t\t");
            System.out.print(quantidadeProdutoCarrinho.get(i) + "\t\t\t\t\t\t\t");
            System.out.print(precoProdutoCarrinho[i] + "\t\t\t\t\t\t");
            System.out.printf("%.2f\n", precoTotalProdutoCarrinho[i]);
        }
        System.out.println("=================================================================================================\n");

        System.out.printf("DESCONTO NA COMPRA: R$ %.2f\n", desconto);
        System.out.printf("VALOR TOTAL A SER PAGO: R$ %.2f\n", somaTotal);
        System.out.printf("VALOR TRIBUTÁRIO: R$ %.2f", (somaTotal * 0.09));
    }

    private static boolean verificaOpcao(String opcaoCliente) {
        Scanner leitorTeclado = new Scanner(System.in);
        while (!opcaoCliente.equals("n") && !opcaoCliente.equals("N") && !opcaoCliente.equals("s") && !opcaoCliente.equals("S")) {
            System.out.println("Por favor digite uma opção válida para o menu! (S/N): ");
            opcaoCliente = leitorTeclado.nextLine();
        }
        if (opcaoCliente.equalsIgnoreCase("n"))
            continuaCompra = false;
        else continuaCompra = true;

        return continuaCompra;
    }
}
