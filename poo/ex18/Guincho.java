package poo.ex18;

public class Guincho extends Automóvel{

    private Automóvel guinchado;

    public Guincho(int numRodas, int velMax) {
        super(numRodas, velMax);
    }

    public Automóvel getGuinchado(){
        return guinchado;
    }

    public void setGuinchado(Automóvel guinchado){
        this.guinchado = guinchado;
    }

    public void guinchar(Automóvel guinchado){
        if(this.getGuinchado() != null){
            System.out.println("Este guincho já está em uso");
        } else{
            if(guinchado.getNumRodas() == 2){
                System.out.println("A moto foi guinchada");
                this.setGuinchado(guinchado);
            } else{
                System.out.println("O carro foi guinchado");
                this.setGuinchado(guinchado);
            }
        }
    }
    
}
