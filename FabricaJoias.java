import java.util.ArrayList;
import java.util.Scanner;

public class FabricaJoias {
    public static void main(String[] args) {
        ArrayList<Joia> joias = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== Menu =====");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Buscar Produto");
            System.out.println("3. Exibir Produto com Maior Valor");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                cadastrarProduto(joias);
            } else if (opcao == 2) {
                buscarProduto(joias);
            } else if (opcao == 3) {
                exibirTipoMaiorValor(joias);
            } else if (opcao == 4) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 4);
    }

    public static void cadastrarProduto(ArrayList<Joia> joias) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tipo da joia (anel, colar ou brinco): ");
        String tipo = scanner.next();
        Joia novaJoia = new Joia(tipo, 0, 0, "", 0);
        novaJoia.cadastrarProduto();
        joias.add(novaJoia);
        System.out.println("Produto cadastrado com sucesso!");
    }

    public static void buscarProduto(ArrayList<Joia> joias) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tipo da joia a ser buscada (anel, colar ou brinco): ");
        String tipoBusca = scanner.next();

        for (Joia joia : joias) {
            if (joia.tipo.equalsIgnoreCase(tipoBusca)) {
                joia.exibirDados();
                return;
            }
        }
        System.out.println("Joia não encontrada!");
    }

    public static void exibirTipoMaiorValor(ArrayList<Joia> joias) {
        double maiorValor = 0;
        String tipoMaiorValor = "";

        for (Joia joia : joias) {
            if (joia.valor > maiorValor) {
                maiorValor = joia.valor;
                tipoMaiorValor = joia.tipo;
            }
        }

        System.out.println("A joia com maior valor é o " + tipoMaiorValor);
    }
}