import java.util.Random;

public class ex12 {
    
    public static void main(String[] args) {
        Random numRam = new Random();

        int vetora[] = new int[50];
        int vetorb[] = new int[50];
        int vetor[] = new int[100];
        int aux;

        for(int i=0; i<vetora.length; i++){
            vetora[i] = numRam.nextInt();
            vetorb[i] = numRam.nextInt();
        }

        for(int i=0; i<vetora.length; i++){
            for(int j=0; j<(vetora.length-1); j++){
                if(vetora[j] > vetora[j+1]){
                    aux = vetora[j];
                    vetora[j] = vetora[j+1];
                    vetora[j+1] = aux;
                }

                if(vetorb[j] < vetorb[j+1]){
                    aux = vetorb[j];
                    vetorb[j] = vetorb[j+1];
                    vetorb[j+1] = aux;
                }
            }
        }

        for(int i=0; i<vetora.length; i++){
            vetor[i] = vetora[i];
            vetor[i + 49] = vetorb[i];
        }

        for(int i=0; i<vetor.length; i++){
            for(int j=0; j<(vetor.length - 1); j++){
                if(vetor[j] > vetor[j+1]){
                    aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }

        for(int i=0; i<vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
    }
}
