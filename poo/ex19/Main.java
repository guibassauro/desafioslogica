package poo.ex19;

public class Main {
    public static void main(String[] args) {
        Telefonica lista = new Telefonica();
        
        Numero numero1 = new Numero("123", "João");
        Numero numero2 = new Numero("321", "Beatriz");

        lista.printaNumeros();
        lista.deletaNumero(numero1);
        lista.adicionaNumero(numero1);
        lista.adicionaNumero(numero2);
        lista.printaNumeros();
        lista.adicionaNumero(numero1);
        lista.deletaNumero(numero1);
        lista.deletaNumero(numero1);
        lista.deletaNumero(numero2);
        lista.printaNumeros();
    }
}
