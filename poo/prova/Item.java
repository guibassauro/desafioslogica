package poo.prova;

public class Item {
    private Produto produto;
    private int quantidade;
    private double valorDoItem;

    public void defineValorTotal(){
        this.valorDoItem = this.produto.getPreco() * this.quantidade;
    }

    public Item(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
        this.defineValorTotal();
    }

    public Produto getProduto(){
        return produto;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public double getValorDoItem(){
        return valorDoItem;
    }

}
