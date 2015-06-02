package bubblesort;

import interfaceOrdenacao.AlgoritmoOrdenacao;
import java.util.Arrays;

/**
 * @author Ana Silva
 */
public class BubbleSort implements AlgoritmoOrdenacao {

    @Override
    public void ordenar(int[] v) {
        boolean houveTroca = true;
        int auxiliar;
        while (houveTroca) {
            houveTroca = false;
            for (int i = 0; i < v.length - 1; i++) {
                if (v[i] > v[i + 1]) {
                    auxiliar = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = auxiliar;
                    houveTroca = true;
                }
            }
        }
    }
}
