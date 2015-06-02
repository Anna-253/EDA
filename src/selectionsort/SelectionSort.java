package selectionsort;

import interfaceOrdenacao.AlgoritmoOrdenacao;
import java.util.Arrays;

/**
 * @author Ana Silva
 */
public class SelectionSort implements AlgoritmoOrdenacao {

    @Override
    public void ordenar(int[] v) {
        for (int i = 0; i < v.length-1; i++) {
            int menorN = i;
            
            for (int j = menorN; j < v.length; j++) {
                if (v[j] <v[menorN])
                    menorN = j;
            }
            /**
             * Efeuta a troca.
             */
            if (menorN != i) {
                int auxiliar = v[i];
                v[i] = v[menorN];
                v[menorN] = auxiliar;
            }
        }
    }
    
    public static void main(String[] args) {
        SelectionSort selectionsort = new SelectionSort();
        
        int[] v = {8,0,12,34,1,65,33,7};
        
        selectionsort.ordenar(v);
        
        System.out.println(Arrays.toString(v));
    }
}
