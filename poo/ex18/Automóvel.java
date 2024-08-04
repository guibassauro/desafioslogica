package poo.ex18;

public class Automóvel {
    private int numRodas;
    private int velMax;
    private boolean ligado;

    public Integer getNumRodas(){
        return numRodas;
    }

    public void setNumRodas(int numRodas){
        this.numRodas = numRodas;
    }

    public Integer getVelMax(){
        return velMax;
    }

    public void setVelMax(int velMax){
        this.velMax = velMax;
    }

    public boolean getLigado(){
        return ligado;
    }

    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    public Automóvel(int numRodas, int velMax){
        setNumRodas(numRodas);
        setVelMax(velMax);
        setLigado(false);
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
