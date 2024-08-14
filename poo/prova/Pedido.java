package poo.prova;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pedido {
    private List<Item> listaDeItens = new ArrayList<>();
    private double valorTotalDoPedido = 0;

    public void calculaValorTotal(){
        for (Item item : listaDeItens) {
            this.valorTotalDoPedido += item.getValorDoItem();
        }
    }

    public boolean adicionaItemNaLista(Produto produto, int quantidade){
        Item novoItem = new Item(produto, quantidade);

        for (Item item : listaDeItens) {
            if(item.getProduto().getNome().equals(novoItem.getProduto().getNome())){
                System.out.println("Este item já foi adicionado ao pedido");
                return false;
            }
        }

        if(produto.getQuantidadeEmEstoque() < quantidade){
            System.out.println("\nNão temos o suficiente desse produto");
            return false;
        }

        listaDeItens.add(novoItem);
        produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque() - quantidade);
        System.out.println("\nItem adicionado");
        return true;
    }

    public void imprimePedido(){
        System.out.println("\nPedido:");
        for (Item item : listaDeItens) {
            System.out.printf("\nProduto: " + item.getProduto().getNome());
            System.out.printf("   |   Quantidade: " + item.getQuantidade());
            System.out.printf("   |   Preço total: R$%.2f" , item.getValorDoItem());
        }
        this.calculaValorTotal();
        this.imprimeValorTotal();
    }

    public void imprimeValorTotal(){
        System.out.printf("\nValor Total: R$%.2f" , this.getValorTotalDoPedido());
    }

    public void adicionaItem(){
        String nome = recebeNomeDoTeclado();
        for (Item item : listaDeItens) {
            if(item.getProduto().getNome().equals(nome)){
                int quantidadeAdicionada = recebeQuantidadeNoTeclado();
                if(item.getProduto().getQuantidadeEmEstoque() < (quantidadeAdicionada)){
                    System.out.println("Não temos o suficiente para adicionar");
                } else{
                    item.setQuantidade(item.getQuantidade() + quantidadeAdicionada);
                    item.getProduto().setQuantidadeEmEstoque(item.getProduto().getQuantidadeEmEstoque() - quantidadeAdicionada);
                    System.out.println(quantidadeAdicionada + " unidades adicionadas a " + item.getProduto().getNome());
                    item.defineValorTotal();
                }
            }
        }
    }

    public String recebeNomeDoTeclado(){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do item");
        String nome = sc.nextLine();
;
        return nome;
    }

    public int recebeQuantidadeNoTeclado(){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade do item");
        int quantidadeAdicionada = sc.nextInt();

        return quantidadeAdicionada;
    }

    public void limparCarrinho(){
        this.listaDeItens.clear();
        this.valorTotalDoPedido = 0;
    }

    public void pagarPedido(){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDigite o valor pago pelo cliente:");

        double valor = sc.nextDouble();

        if(this.getValorTotalDoPedido() == 0){
            this.calculaValorTotal();
        }

        if(valor >= this.getValorTotalDoPedido()){
            valor -= this.getValorTotalDoPedido();
            System.out.println("Compra paga!");
            System.out.printf("Troco:  R$%.2f" , valor);
            System.out.println("\n\nTroco sugerido:");
            this.calcularNotas(valor);
            this.limparCarrinho();
        } else{
            System.out.println("Valor insuficiente");
        }
    }

    public void calcularNotas(double valor){
        while(valor > 0){
            if((valor - 200) >= 0){
                System.out.println("Nota de 200");
                valor -= 200;
            } else if((valor - 100) >= 0){
                System.out.println("Nota de 100");
                valor -= 100;
            } else if((valor - 50) >= 0){
                System.out.println("Nota de 50");
                valor -= 50;
            } else if((valor - 20) >= 0){
                System.out.println("Nota de 20");
                valor -= 20;
            } else if((valor - 10) >= 0){
                System.out.println("Nota de 10");
                valor -= 10;
            } else if((valor - 5) >= 0){
                System.out.println("Nota de 5");
                valor -= 5;
            } else if((valor - 2) >= 0){
                System.out.println("Nota de 2");
                valor -= 2;
            } else if((valor - 1) >= 0){
                System.out.println("Moeda de 1");
                valor -= 1;
            } else{
                System.out.println("Moedas");
                valor = -1;
            }
        }
    }

    // Getters & Setters

    public double getValorTotalDoPedido(){
        return valorTotalDoPedido;
    }

    public void setValorTotalDoPeDido(double valorTotalDoPedido){
        this.valorTotalDoPedido = valorTotalDoPedido;
    }


}
