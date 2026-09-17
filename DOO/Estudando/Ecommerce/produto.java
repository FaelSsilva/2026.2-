//o nome aqui nao precisa obrigatoriamente ser igual ao do nome do arquivo
class CriarProduto {
    String nome;
    double preco;
    int estoque;

    CriarProduto(String nome, double preco, int estoque){
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;

        System.out.println("----------------------------------");
        System.out.println("Produto criado com sucesso");
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em estoque: " + estoque);
        System.out.println("----------------------------------");
    }
}
