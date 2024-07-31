import java.util.Random;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        System.out.println("Digite sua opção:");
        System.out.println("0 - Pedra");
        System.out.println("1 - Papel");
        System.out.println("2 - Tesoura");

        Scanner sc = new Scanner(System.in);

        int op = sc.nextInt();
        sc.close();

        Random oponente = new Random();
        int oponente2 = oponente.nextInt(3);

        System.out.println(oponente2);

        if(op == oponente2){
            System.out.println("Houve um empate");
        } else if(op == 0){
            if(oponente2 == 1){
                System.out.println("Voce perdeu");
            } else{
                System.out.println("Voce ganhou");
            }
        } else if(op == 1){
            if(oponente2 == 0){
                System.out.println("Voce ganhou.");
            } else{
                System.out.println("Voce perdeu.");
            }
        } else{
            if(oponente2 == 0){
                System.out.println("Voce perdeu.");
            } else{
                System.out.println("Voce ganhou.");
            }
        }     
    }
}
