package poo.ex18;

public class Carro extends Automóvel {

    private boolean freio;

    public Carro(int numRodas, int velMax) {
        super(numRodas, velMax);
    }

    public boolean getFreio(){
        return freio;
    }

    public void setFreio(boolean freio){
        this.freio = freio;
    }
    
}
