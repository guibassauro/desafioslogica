package poo.ex18;

public class Moto  extends Automóvel{

    private boolean acelerador;
    
    public Moto(int numRodas, int velMax){
        super(numRodas, velMax);
        setAcelerador(false);
    }

    public boolean getAcelerador(){
        return acelerador;
    }

    public void setAcelerador(boolean acelerador){
        this.acelerador = acelerador;
    }
}
