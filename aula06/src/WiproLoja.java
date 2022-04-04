public class WiproLoja {

    public static void main(String[] args) {

        Object[][] produtos = new Object[][]{{1, "Cebola", 10, 3.99},
                {2, "Banana", 10, 4.99},
                {3, "Batata", 10, 2.49},
                {4, "Cenoura", 10, 11.99},
                {5, "Ovos", 10, 6.49},
                {6, "Bolacha", 10, 1.99},
                {7, "Massa", 10, 2.99},
                {8, "Arroz", 10, 14.99},
                {9, "Sabão", 10, 3.39},
                {10, "Esponja", 10, 0.99}};

        System.out.println("Escolha quais produtos produtos você quer");
        Object[][] carrinho = new Object[4][];

        carrinho[0] = produtos[1];
        carrinho[1] = produtos[9];

        for (int i = 0; i < carrinho.length; i++) {
            for (int j = 0; j < carrinho[i].length; j++) {
                System.out.print(carrinho[i][j] + "\t\t\t\t\t\t\t");
            }
            System.out.println();
        }

//        for (int i = 0; i < produtos.length; i++) {
//            for (int j = 0; j < produtos[i].length; j++) {
//                System.out.print(produtos[i][j] + "\t\t\t\t\t\t\t");
//            }
//            System.out.println();
//        }

    }
}
