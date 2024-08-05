package poo.prova;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Item> listaDeItens = new ArrayList<>();
    private double valorTotalPedido;

    public double getValorTotalPedido(){
        return valorTotalPedido;
    }

    public void setValorTotalPedido(double valorTotalPedido){
        this.valorTotalPedido = valorTotalPedido;
    }
}
