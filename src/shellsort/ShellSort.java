package shellsort;

import interfaceOrdenacao.AlgoritmoOrdenacao;
import java.util.Arrays;

/**
 * @author Ana Silva
 */
public class ShellSort implements AlgoritmoOrdenacao {

    @Override
    public void ordenar(int[] v) {
        int h = 0;
        int n = v.length;
        while (h < n) {
            h = h * 3 + 1;
        }
        h = h/3;
        
        int auxiliar, j;
        
        while (h > 0) {
        for (int i = h; i < n; i++) {
            auxiliar = v[i];
            j = i;
            while (j >= h && v[j - h] > auxiliar) {
                v[j] = v[j - h];
                j = j - h;
            }
            v[j] = auxiliar;
        }
        h = h / 2;
        }
    }
}