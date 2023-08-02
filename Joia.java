import java.util.Scanner;

class Joia {
    String tipo;
    double valor;
    double peso;
    String materialPrincipal;
    int quantidadeEmEstoque;

    public Joia(String tipo, double valor, double peso, String materialPrincipal, int quantidadeEmEstoque) {
        this.tipo = tipo;
        this.valor = valor;
        this.peso = peso;
        this.materialPrincipal = materialPrincipal;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void cadastrarProduto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cadastro de Produto - " + tipo);
        System.out.print("Digite o valor: ");
        valor = scanner.nextDouble();
        System.out.print("Digite o peso: ");
        peso = scanner.nextDouble();
        System.out.print("Digite o material principal: ");
        materialPrincipal = scanner.next();
        System.out.print("Digite a quantidade em estoque: ");
        quantidadeEmEstoque = scanner.nextInt();
    }

    public void exibirDados() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Valor: " + valor);
        System.out.println("Peso: " + peso);
        System.out.println("Material Principal: " + materialPrincipal);
        System.out.println("Quantidade em Estoque: " + quantidadeEmEstoque);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getMaterialPrincipal() {
        return materialPrincipal;
    }

    public void setMaterialPrincipal(String materialPrincipal) {
        this.materialPrincipal = materialPrincipal;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
}