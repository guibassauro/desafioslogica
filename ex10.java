import java.util.Scanner;

public class ex10 {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int quadrado = sc.nextInt();
        int matriz[][] = new int[quadrado][quadrado];

        for(int i=0; i<quadrado; i++){
            for(int j=0; j<quadrado; j++){
                System.out.println("Número em Matriz[" + i + "][" + j + "]:");
                int num = sc.nextInt();
                matriz[i][j] = num;
            }
        }

        int soma = 0;
        int j = 0;
        for(int i=0; i<quadrado; i++){
            int num = Integer.valueOf(matriz[i][j]);
            soma += num;
            j++;
        }

        System.out.println(soma);
        
        sc.close();
    }
}
