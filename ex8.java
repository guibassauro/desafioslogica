import java.util.Scanner;

public class ex8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        
        while(numero != 10){
            numero = getNumero(sc);
        }

        encerraLoop();
        sc.close();
    }

    private static int getNumero(Scanner sc){
        System.out.println("Digite um número(10 encerra o loop):");
        int numero = sc.nextInt();

        return numero;
    }

    private static void encerraLoop(){
        System.out.println("Loop Encerrado");
    }
}
