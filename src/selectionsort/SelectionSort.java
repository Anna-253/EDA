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
}
