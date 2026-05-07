public class Livro extends Produto {
    String autor;
    String sistemaRPG;

    public Livro(String nome, double preco, String autor, String sistemaRPG) {
        super(nome, preco);
        this.autor = autor;
        this.sistemaRPG = sistemaRPG;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Autor: " + autor);
        System.out.println("Sistema: " + sistemaRPG);
    }
}