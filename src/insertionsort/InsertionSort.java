package insertionsort;

import interfaceOrdenacao.AlgoritmoOrdenacao;
import java.util.Arrays;

/**
 * @author Ana Silva
 */
public class InsertionSort implements AlgoritmoOrdenacao {

    @Override
    public void ordenar(int[] v) {
        ordenar(v, v.length);
    } 
    
    public void ordenar(int[] v, int tamanhoDoVetor) {
        int i, j, escolhido;
        for (i = 1; i < tamanhoDoVetor; i++){
            escolhido = v[i];
            j = i - 1;
        while ((j>=0) && (escolhido < v[j])) {
            v[j+1] = v[j];
            j--;
        }
        v[j+1] = escolhido;
        }
    }
}