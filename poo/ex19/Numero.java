package poo.ex19;

public class Numero {
    private String numero;
    private String nome;

    public Numero(String numero, String nome){
        setNome(nome);
        setNumero(numero);
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNumero(){
        return numero;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }
}
