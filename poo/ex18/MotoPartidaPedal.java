package poo.ex18;

public class MotoPartidaPedal extends Moto{

    public MotoPartidaPedal(int numRodas, int velMax) {
        super(numRodas, velMax);
    }

    public void ligar(){
        if(this.getAcelerador()){
            this.setLigado(true);
            System.out.println("A moto foi ligada");
        } else{
            System.out.println("Voce precisa pisar no acelerador para ligar a moto");
        }
    }

    public void desligar(){
        this.setLigado(false);
        System.out.println("A moto foi desligada");
    }

    public void pisaAcelerador(){
        this.setAcelerador(true);
        System.out.println("Voce pisou no acelerador da moto");
    }

    public void soltaAcelerador(){
        this.setAcelerador(false);
        System.out.println("Voce soltou o acelerador da moto");
    }
    
}
