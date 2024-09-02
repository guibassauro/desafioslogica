package poo.ex19;

public class Numero {
    private String numero;
    private String nome;

    public Numero(String numero, String nome){
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome(){
        return nome;
    }

    public String getNumero(){
        return numero;
    }

}
