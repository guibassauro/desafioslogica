package poo.prova;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private int id;
    private List<Produto> listaDeProdutos = new ArrayList<>();

    public void inicializaEstoque(){

    }

    public void cadastrarProduto(Produto produto){
        if(listaDeProdutos.contains(produto)){
            System.out.println("Este produto já foi cadastrado");
        } else{
            listaDeProdutos.add(produto);
            System.out.println(produto.getNome() + " cadastrado.");
        }
    }

    public void imprimeCatalogoDoEstoque(){
        for (Produto produto : listaDeProdutos) {
            System.out.println(
            "Produto: " + produto.getNome() + 
            " | Quantidade: " + produto.getPreco() +
            " | Preço: " + produto.getPreco() +
            " | Em estoque: " + produto.getQuantidadeEstoque()
            );
        }
    }

    public boolean darBaixaEmEstoque(String nome, int quantidadeParaDarBaixa){
        for (Produto produto : listaDeProdutos) {
            if(nome == produto.getNome()){
                if(quantidadeParaDarBaixa < produto.getQuantidadeEstoque()){
                    return true;
                }
            }
        }
    }
}
