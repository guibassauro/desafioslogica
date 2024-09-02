import java.util.Random;

public class ex6 {
    public static void main(String[] args) {
        Random ranNum = new Random();

        int[] valores = defineValores(ranNum);

        printaDados(valores);
        
    }

    private static int[] defineValores(Random ranNum){
        int maiorNum = -1;
        int menorNum = 101;
        
        for(int i=0; i<10; i++){
            int num = ranNum.nextInt(100);
            if(num > maiorNum){
                maiorNum = num;
            }

            if(num < menorNum){
                menorNum = num;
            }
        }      

        return new int[] {menorNum, maiorNum};
    }

    private static void printaDados(int[] valores){
        System.out.println("Maior número: " + valores[1]);
        System.out.println("Menor número: " + valores[0]);
    }
}
