package poo.prova;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private int id = 1;
    private List<Produto> listaDeProdutos = new ArrayList<>();

    public static void inicializaEstoque(){
        
    }

    public  Produto encontraProduto(String nome){
        for (Produto produto : listaDeProdutos) {
            if(produto.getNome().equals(nome)){
                return produto;
            }
        }

        return null;
    }

    public  Produto encontraProduto(int id){
        for (Produto produto : listaDeProdutos) {
            if(id == produto.getId()){
                return produto;
            }
        }

        return null;
    }

    public  boolean cadastraProduto(Produto produto){
        for (Produto produto2 : listaDeProdutos) {
            if(produto2.getNome().equals(produto.getNome()) || produto2.getId() == produto.getId()){
                System.out.println("Esse produto já foi cadastrado");
                return false;
            }
        }

        listaDeProdutos.add(produto);
        return true;
    }

    public  void imprimeCatalogoDoEstoque(){
        for (Produto produto : listaDeProdutos) {
            System.out.printf("\nNome: " + produto.getNome());
            System.out.printf("     |     Preço: %.2f", produto.getPreco());
            System.out.printf("     |     Quantidade: " + produto.getQuantidadeEmEstoque());
        }
    }

    public  boolean darBaixaEmEstoque(String nome, int quantidadeParaDarBaixa){
        Produto produto = this.encontraProduto(nome);

        if(this.temEstoqueOuNao(produto, quantidadeParaDarBaixa) && quantidadeParaDarBaixa >=0){
            this.encontraProduto(nome).setQuantidadeEmEstoque
            (produto.getQuantidadeEmEstoque() - quantidadeParaDarBaixa);
            return true;
        }

        return false;
    }

    public  boolean darBaixaEmEstoque(int id, int quantidadeParaDarBaixa){
        Produto produto = this.encontraProduto(id);

        if(this.temEstoqueOuNao(produto, quantidadeParaDarBaixa) && quantidadeParaDarBaixa >=0){
            this.encontraProduto(id).setQuantidadeEmEstoque
            (produto.getQuantidadeEmEstoque() - quantidadeParaDarBaixa);
            return true;
        }

        return false;
    }

    public int getQuantidadeAtualEmEstoque(Produto produto){
        return produto.getQuantidadeEmEstoque();
    }

    public int getPosicaoDoProdutoNaLista(Produto produto){
        return this.listaDeProdutos.indexOf(produto);
    }

    public boolean temEstoqueOuNao(Produto produto, int quantidadeParaDarBaixa){
        if(produto.getQuantidadeEmEstoque() >= quantidadeParaDarBaixa){
            return true;
        }
        
        return false;
    }


    // Getters & Setters


    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public Estoque(int id){
        setId(id);
        listaDeProdutos.clear();
    }
}
