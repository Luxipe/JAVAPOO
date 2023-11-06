class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double calcularTotal() {
        return preco * quantidade;
    }

    public String toString() {
        return String.format("Nome: %s, Preço: %.2f, Quantidade: %d, Total: %.2f", nome, preco, quantidade, calcularTotal());
    }
}

class Main {

    public static void main(String[] args) {
        String nome = "camisa";
        double preco = 12.00;
        int quantidade = 15;

        Produto produto1 = new Produto(nome, preco, quantidade);
        Produto produto2 = new Produto("Tênis", 50.0, 2);

        System.out.println(produto1);
        System.out.println(produto2);
        // Adicione mais coisas
        

        // Crie um novo produto com o nome "Caderno", o preço de R$ 15,00 e a quantidade de 5 unidades.
        Produto produto3 = new Produto("Caderno", 15.0, 5);

        // Crie um array para armazenar os produtos.
        Produto[] produtos = {produto1, produto2, produto3};

        // Use um loop for para iterar sobre o array e exibir o total de cada produto.
        for (Produto produto : produtos) {
            System.out.println(produto.calcularTotal());
        }
    }
}