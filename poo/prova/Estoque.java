package poo.prova;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    int id = 1;
    List<Produto> listaDeProdutos = new ArrayList<>();

    public void inicializaEstoque(){
        Estoque estoque = new Estoque(1);
    }

    public Produto encontraProduto(String nome){
        for (Produto produto : listaDeProdutos) {
            if(produto.getNome().equals(nome)){
                return produto;
            }
        }

        return null;
    }

    public Produto encontraProduto(int id){
        for (Produto produto : listaDeProdutos) {
            if(id == produto.getId()){
                return produto;
            }
        }

        return null;
    }

    public boolean cadastraProduto(Produto produto){
        if(!listaDeProdutos.contains(produto)){
            listaDeProdutos.add(produto);
            return true;
        }

        return false;
    }

    public void imprimeCatalogoDoEstoque(){
        for (Produto produto : listaDeProdutos) {
            System.out.printf("\nNome: " + produto.getNome());
            System.out.printf("     |     Preço: %.2f", produto.getPreco());
            System.out.printf("     |     Quantidade: " + produto.getQuantidadeEmEstoque());
        }
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
