package poo.prova;

import java.io.ObjectStreamException;
import java.util.Scanner;

public class Menu {
    

    public void controlaMenu(){
        Scanner sc = new Scanner(System.in);
    }

    public static void main(String[] args) throws ObjectStreamException {
        Estoque estoque = new Estoque(1);
        Produto maca = new Produto(2, "Maca", 1.50, 19);
        Produto pera = new Produto(3, "Pera", 3.22, 40);
        Produto microoscopio = new Produto(4, "Microoscopio", 223.45, 6);

        estoque.cadastraProduto(microoscopio);
        estoque.cadastraProduto(pera);
        estoque.cadastraProduto(maca);
        System.out.println(estoque.temEstoqueOuNao(microoscopio, 7));
    }
}
