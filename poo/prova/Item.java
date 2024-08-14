package poo.prova;

public class Item {
    private Produto produto;
    private int quantidade;
    private double valorDoItem;

    public void defineValorTotal(){
        this.valorDoItem = this.produto.getPreco() * this.quantidade;
    }


    // Getters & Setters

    public Item(Produto produto, int quantidade){
        setProduto(produto);
        setQuantidade(quantidade);
        defineValorTotal();
    }

    public Produto getProduto(){
        return produto;
    }

    public void setProduto(Produto produto){
        this.produto = produto;
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

    public void setValorDoItem(double valorDoItem){
        this.valorDoItem = valorDoItem;
    }
}
