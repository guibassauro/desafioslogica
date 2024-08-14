package poo.prova;

public class Menu {

    public static void main(String[] args) {
        Estoque estoque1 = new Estoque(1);
        Produto maca = new Produto(1, "maca", 1.50, 1000);
        Pedido pedido = new Pedido();
        
        estoque1.cadastraProduto(maca);
        pedido.adicionaItemNaLista(maca, 1000);
        estoque1.imprimeCatalogoDoEstoque();
        pedido.imprimePedido();
        pedido.pagarPedido();
    }
}
