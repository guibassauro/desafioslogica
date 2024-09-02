package poo.ex18;

public class Automóvel {
    private int numRodas;
    private int velMax;
    private boolean ligado;

    public Integer getNumRodas(){
        return numRodas;
    }

    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    public Automóvel(int numRodas, int velMax){
        this.numRodas = numRodas;
        this.velMax = velMax;
        this.ligado = false;
    }

    public void ligar(){
        setLigado(true);;
        System.out.println("O automovel foi ligado");
    }

    public void desligar(){
        setLigado(false);
        System.out.println("O automovel foi desligado");
    }

    
}
