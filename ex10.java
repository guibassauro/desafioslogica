import java.util.Scanner;

public class ex10 {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int numero = getDados(sc);

        int matriz[][] = criaMatriz(numero, sc);

        int soma = calculaSomaDiagonal(matriz, numero);

        System.out.println("Soma da Diagonal da matriz: " + soma);

        sc.close();
        
    }

    public static int getDados(Scanner sc){
        System.out.println("Digite o valor matriz");
        int numero = sc.nextInt();
        
        return numero;
    }

    public static int[][] criaMatriz(int numero, Scanner sc){

        int matriz[][] = new int[numero][numero];

        for(int i=0; i < Math.pow(numero, 2); i++){
            int linha = i / numero;
            int coluna = i % numero;

            System.out.println("Elemento em: [" + linha + "] [" + coluna + "]:");
            matriz[linha][coluna] = sc.nextInt();
        }

        return matriz;
        
    }

    public static int calculaSomaDiagonal(int [][] matriz, int numero){
        
        int somaDiagonal  = 0;

        for(int i=0; i < numero; i++){
            somaDiagonal += matriz[i][i];
        }

        return somaDiagonal;
    }
}
