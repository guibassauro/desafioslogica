package poo.ex18;

public class CarroAutomatico extends Carro{
    
    public CarroAutomatico(int numRodas, int velMax){
        super(numRodas, velMax);
        this.setLigado(false);
        this.setFreio(false);
    }

    public void ligar(){
        if(this.getFreio()){
            this.setLigado(true);
            System.out.println("O carro automatico foi ligado");
        } else{
            System.out.println("O freio precisa estar pressionado para o carro ligar");
        }
    }

    public void desligar(){
        this.setLigado(false);
        System.out.println("O carro automatico foi desligado");
    }

    public void pisaFreio(){
        this.setFreio(true);
        System.out.println("O freio está sendo pressionado");
    }

    public void soltaFreio(){
        this.setFreio(false);
        System.out.println("O freio está solto");
    }
    
}
