package poo.ex19;

import java.util.ArrayList;
import java.util.List;

public class Telefonica {
    List<Numero> numeros = new ArrayList<>();

    public void adicionaNumero(Numero numero){
        if(numeros.contains(numero)){
            System.out.println("O número " + numero.getNumero() + " já foi adicionado");
        } else{
            numeros.add(numero);
            System.out.println("O número " + numero.getNumero() + " foi adicionado");
        }
    }

    public void deletaNumero(Numero numero){
        if(numeros.isEmpty()){
            System.out.println("Não há números para serem deletados");
        } else if(!numeros.contains(numero)){
            System.out.println("O número " + numero.getNumero() + " não foi adicionado");
        } else{
            System.out.println("O número " + numero.getNumero() + " foi deletado");
            numeros.remove(numero);
        }
    }

    public void printaNumeros(){
        if(numeros.isEmpty()){
            System.out.println("Não há números salvos");
        } else{
            for (Numero numero : numeros) {
                System.out.println("Nome: " + numero.getNome() + " | Número: " + numero.getNumero() + ".");
            }
        }
    }
    
}
