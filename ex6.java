import java.util.Random;

public class ex6 {
    public static void main(String[] args) {
        Random ranNum = new Random();
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

            System.out.print(num + " ");
        }
        System.out.print("\n");
        System.out.println("Maior número: " + maiorNum);
        System.out.println("Menor número: " + menorNum);
    }
}
