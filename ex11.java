import java.util.Random;

public class ex11 {
    
    public static void main(String[] args) {
        Random ranNum = new Random();
        int vetor[] = new int[100];
        int aux;
        

        for(int i=0; i<vetor.length; i++){
            vetor[i] = ranNum.nextInt();
        }

        for(int i=0; i<vetor.length; i++){
            for(int j=0; j<(vetor.length -1); j++){
                if(vetor[j] > vetor[j+1]){
                    aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }

        for(int m=0; m<vetor.length; m++){
            System.out.print(vetor[m] + " ");
        }

    }
}
