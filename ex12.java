import java.util.Random;

public class ex12 {
    
    public static void main(String[] args) {

        int[] vetora = criaVetor();
        int[] vetorb = criaVetor();

        boobleSort(vetora);
        boobleSort(vetorb);

        int[] vetor = uneVetoresEmUm(vetora, vetorb);

        boobleSort(vetor);

        printaVetor(vetor);
        
    }

    private static int[] criaVetor(){
        Random random = new Random();
        int[] vetor = new int[50];
        
        for(int i=0; i<vetor.length; i++){
            vetor[i] = random.nextInt(1000);
        }

        return vetor;
    }

    private static void boobleSort(int[] vetor){
        for(int i=0; i<vetor.length; i++){
            for(int j=0; j<vetor.length-1;j++){
                if(vetor[j] > vetor[j+1]){
                    int aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }
    }

    private static int[] uneVetoresEmUm(int[] vetora, int[] vetorb){
        int[] vetor = new int[100];

        for(int i=0; i<vetora.length;i++){
            vetor[i] = vetora[i];
            vetor[i+49] = vetorb[i];
        }

        return vetor;
    }

    public static void printaVetor(int[] vetor){
        for(int i=0; i<vetor.length; i++){
            System.out.printf(vetor[i] + " ");
        }
    }
}
