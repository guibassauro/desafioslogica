package poo.ex18;

public class Main {
    public static void main(String[] args) {
        CarroAutomatico car1 = new CarroAutomatico(4, 120);
        MotoPartidaPedal moto1 = new MotoPartidaPedal(2, 200);
        Guincho guincho1 = new Guincho(4, 120);

        car1.ligar();
        car1.pisaFreio();
        car1.ligar();
        car1.soltaFreio();
        car1.desligar();

        System.out.print("\n");

        moto1.ligar();
        moto1.pisaAcelerador();
        moto1.ligar();
        moto1.soltaAcelerador();
        moto1.desligar();

        System.out.print("\n");

        guincho1.guinchar(car1);
        guincho1.guinchar(moto1);
    }
}
