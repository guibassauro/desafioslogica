package poo.prova;

public class Item {
    private int quantidade;
    private double valorDoItem;

    public Item(int quantidade, double valorDoItem){
        setQuantidade(quantidade);
        setValorDoItem(valorDoItem);
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
